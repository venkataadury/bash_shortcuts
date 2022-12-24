#include <stdio.h>
#include "commons.h"

int main(int argc,char** args)
{
	char ch=args[1][0];
	char* str=args[2];
	printf("%d\n",countChar(ch,str));
}
