#include <stdio.h>
#include "commons.h"

int main(int argc,char** args)
{
	char* str=args[1];
	str=toUpperCase(str);
	printf("%s\n",str);
	return 0;
}

