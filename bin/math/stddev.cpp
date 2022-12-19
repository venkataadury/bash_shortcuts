#include "maths/stats.h"

using namespace std;
int main(int argc,char** args)
{
	cout << stats::stddev(stats::toNumList(args+1,argc-1)) << "\n";
}
