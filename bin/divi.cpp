#include "maths/stats.h"

using namespace std;
int main(int argc,char** args)
{
	double s=stats::prod(stats::toNumList(args+2,argc-2));
	double n1=std::stod(args[1]);
	cout << (n1/s) << "\n";
}
