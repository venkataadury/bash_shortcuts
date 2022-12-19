#!/usr/bin/python3

import sys
if len(sys.argv)<1:
    print("Database of primes needed")
pfile=sys.argv[1]
pndata=open(pfile,"r")
primes=[]
for l in pndata:
    primes.append(int(l))
print("Prime numbers loaded")
def factorize(n):
    p=0
    factored=[]
    while n!=1:
        t=primes[p]
        while n%t==0:
            n/=t
            factored.append(t)
        p+=1
    return factored
while True:
    fac=int(input("Enter a number to factorize: "))
    print(*factorize(fac))
