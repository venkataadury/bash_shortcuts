#include <vector>
#include "maths/stats.h"

using namespace std;
int main(int argc,char** args)
{
	std::vector<char> chs;
	char* alch=args[1];
	for(int i=0;alch[i]!='\0';i++)
		chs.push_back(alch[i]);
	int nsel=std::stoi(args[2]);
	for(int i=0;i<nsel;i++) std::cout << randgen::choice(chs);
	std::cout <<"\n";
}
