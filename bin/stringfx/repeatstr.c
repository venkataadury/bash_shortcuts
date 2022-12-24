#include <stdio.h>
#include "commons.h"

int main(int argc,char** args)
{
	char* str=args[2];
	int n=atoi(args[1]);
	for(int i=0;i<n;i++) printf("%s ",str);
	printf("\n");
}
