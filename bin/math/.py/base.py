import os
import sys
import math
import subprocess as sp

def conv10(x,y):
	a=str(x)
	b=int(len(a))
	b-=1
	p=0
	s=0
	while b>=0:
		va=int(y**b)
		va2=a[p]
		try:
			va2=int(va2)
		except:
			va2=getv(va2)
		if va2 >= y:
			print("Error while parsing: Digit ("+str(va2)+") greater than expected for the given base.("+str(y)+"). Expected (<="+str(y-1)+").  Please check your number.")
			exit(2)
		vaf=va*va2
		s=s+vaf
		b-=1
		p+=1
	return s
def getv(a):
    b=sp.getoutput("/bin/math/.py/getval "+a)
    return int(b)
def getn(a):
	b=sp.getoutput("/bin/math/.py/getnum "+str(a))
	return str(b)
try:
    a=sys.argv[1]
    b=int(sys.argv[2])
    c=int(sys.argv[3])
    po=0
    d=c**po
except:
    print("not enough parameters or bad format. \nUsage: base.py number original-base target-base")
    exit(1)
if b != 10:
    a=conv10(a,b)
else:
	try:
		a=int(a)
	except:
		print("Error while parsing: One or more digits greater than expected for the given base.("+str(b)+"). Expected (<="+str(b-1)+").  Please check your number.")
		exit(2)
if b<=1 or b>36:
	print("Sorry: This program only accepts bases from 2 to 36.")
	exit(1)
if c<=1 or c>36:
	print("Sorry: This program only accepts bases from 2 to 36.")
	exit(1)
while d<=a:
	po+=1
	d=c**po
e=po-1
f=100
s=""
while f>1:
	f=c**e
	cn=0
	while a>=f:
		a-=f
		cn+=1
	e-=1
	if cn>=11:
		cn=getn(cn)
	s=s+str(cn)
print(s)
