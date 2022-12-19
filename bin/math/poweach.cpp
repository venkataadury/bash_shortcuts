#include "maths/stats.h"

using namespace std;
int main(int argc,char** args)
{
	/*std::vector<double> nums;
	for(int i=1;i<argc;i++)
		nums.push_back(std::stod(args[i]));*/
	auto vec=stats::toNumList(args+2,argc-2);
	for(auto num : vec) std::cout << ::pow(num,std::stod(args[1])) << "\n";
}
