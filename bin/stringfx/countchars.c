#include <stdio.h>
#include "commons.h"

int main(int argc,char** args)
{
	char* charr=args[1];
	char* str=args[2];
	char ch=charr[0],chmain=str[0];
	int cnt=0,K=0,L=0;
	while(chmain!='\0')
	{
		L=0;
		ch=charr[0];
		while(ch!='\0')
		{
			if(ch==chmain) cnt++;
			ch=charr[++L];
		}
		chmain=str[++K];
	}

	printf("%d\n",cnt);
}
