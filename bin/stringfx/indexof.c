#include <stdio.h>
#include "commons.h"

int main(int argc,char** args)
{
	char* str=args[2];
	char ch=args[1][0];
	printf("%d\n",indexOf(ch,str));
}
