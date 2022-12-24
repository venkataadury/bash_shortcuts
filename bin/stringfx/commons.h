#include <stdio.h>
#include <stdlib.h>
#define MAX_SIZE 256

extern int len(char* s)
{
        int pos=0;
        char CH=' ';
        while(CH!='\0')
        {
                CH=s[pos];
                pos++;
        }
        return pos-1;
}
extern char caps(char c)
{
        if(c>='a' && c<='z')
        {
                c-=32;
                return (char)c;
        }
	return c;
}
extern char small(char c)
{
        if(c>='A' && c<='Z')
        {
                c+=32;
                return (char)c;
        }
	return c;
}

extern int toInt(char a[]) {
  int c, sign, offset, n;

  if (a[0] == '-') {  // Handle negative integers
    sign = -1;
  }
  else
  {
          sign=1;
  }

  if (sign == -1) {  // Set starting position to convert
    offset = 1;
  }
  else {
    offset = 0;
  }

  n = 0;

  for (c = offset; a[c] != '\0'; c++) {
    n = n * 10 + a[c] - '0';
  }

  return n*sign;
}
extern int countChar(char c,char* str)
{
	char ch='0';
	int i=0,ctr=0;
	while(ch!='\0')
	{
		ch=str[i];
		if(ch==c)
		{
			ctr++;
		}
		i++;
	}
	return ctr;
}
extern void flip(char* str)
{
	int l=len(str);
	printf("%d\n",l);
	for(int i=l-1;i>=0;i--)
	{
		printf("%c",str[i]);
	}
	printf("\n");
}
extern int endswith(char* end,char* str)
{
	int l=len(end);
	int m=len(str);
	if(m<l){return 1;}
	int K=0;
	for(int i=m-l;i<m;i++)
	{
		if(str[i]!=end[K]) {return 1;}
		K++;
	}
	return 0;
}
extern char* toLowerCase(char* str)
{
	int l=len(str);
	for(int i=0;i<l;i++)
	{
		str[i]=small(str[i]);
	}
	return str;
}
extern char* toUpperCase(char* str)
{
	int l=len(str);
	for(int i=0;i<l;i++)
	{
		str[i]=caps(str[i]);
	}
	return str;
}
extern int indexOf(char ch,char* str)
{
	int l=len(str);
	for(int i=0;i<l;i++)
	{
		if(str[i]==ch) {return i;}
	}
	return -1;
}
