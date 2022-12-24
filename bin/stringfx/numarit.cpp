#include <stdio.h>
#include <iostream>
#include "commons.h"

using std::cout;
using std::cerr;
//Inplace numerics on numbers in a string

int main(int argc,char** args)
{
	char* str=args[1];
	std::string cppstr(str);
	char oper=args[2][0]; // One of +,-,x,/ or 'a','s','m','d' respectively.
	int param=std::stoi(args[3]);
	int ind =0; //Index of location of number to work on. (Default zero - First occuring numeric string)
	if(argc>4) ind=std::stoi(args[4]);
	int L=0,K=0,N=0;
	char ch;
	char num[20];
	bool dump=false;
	std::string pre,post;
	long numeric;
	do {
		ch=str[L++];
		if(!dump && ((ch>='0' && ch<='9') || ch=='-' && K==0)) num[K++]=ch;
		else
		{
			if(K>0)
			{
				if(N==ind)
				{
					num[K]='\0';
					if(dump) {cerr << "Error: Number at index "<<ind<<" is "<<num<<" and is too long to process as an integer\n"; exit(1);}
					numeric=atoi(num);
					pre=cppstr.substr(0,L-K-1);
					post=cppstr.substr(L-1);
					break;
				}
				N++;
			}

			K=0;
			dump=false;
		}
		if(K>18) dump=true;
	} while(ch!='\0');

	switch(oper)
	{
		case '+':
		case 'a':
			numeric+=param;
			break;
		case '-':
		case 's':
			numeric-=param;
			break;
		case 'x':
		case '*':
		case 'm':
			numeric*=param;
			break;
		case '/':
		case 'd':
			numeric/=param;
			break;
		default:
			cerr << "Unknown operation '"<<oper<<"'\n";
			exit(1);
	};

	cout << pre << numeric << post << "\n";
	return 0;
}
