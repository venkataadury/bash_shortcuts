#include <stdio.h>
#include "commons.h"

int main(int argc,char** args)
{
	char* str=args[1];
	char ret[len(str)];
	char ch='x',lc=' ';
	int i=0;
	while(ch!='\0')
	{
		ch=str[i];
		if(lc==' ')
			ret[i]=caps(str[i]);
		else
			ret[i]=str[i];
		lc=ch;
		i++;
	}
	printf("%s\n",ret);
}
