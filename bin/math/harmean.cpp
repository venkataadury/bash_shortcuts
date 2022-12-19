#include "maths/stats.h"

using namespace std;
int main(int argc,char** args)
{
	/*std::vector<double> nums;
	for(int i=1;i<argc;i++)
		nums.push_back(std::stod(args[i]));*/
	std::vector<double> nums=stats::toNumList(args+1,argc-1);
	double hmi=0;
	for(int i=0;i<nums.size();i++) hmi+=1.0/nums[i];
	std::cout << nums.size()/hmi << "\n";
}
