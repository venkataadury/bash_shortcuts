#include "maths/stats.h"

using namespace std;
int main(int argc,char** args)
{
	double n1=std::stod(args[1]);
	for(int i=2;i<argc;i++)
		n1=pow(n1,std::stod(args[i]));
	cout << n1 << "\n";
}
