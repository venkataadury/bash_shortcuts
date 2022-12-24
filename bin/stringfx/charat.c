#include <stdio.h>
#include "commons.h"


int main(int argc,char** args)
{
	int ind=toInt(args[1]);
	char* str=args[2];
	int leng=len(str);
	if(ind<leng)
	{
		printf("%c\n",str[ind]);
		return 0;
	}
	return 1;

}
