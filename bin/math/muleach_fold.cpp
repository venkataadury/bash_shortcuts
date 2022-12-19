#include "maths/stats.h"

using namespace std;
int main(int argc,char** args)
{
	/*std::vector<double> nums;
	for(int i=1;i<argc;i++)
		nums.push_back(std::stod(args[i]));*/
	auto vec=stats::toNumList(args+2,argc-2);
	int fold=std::stoi(args[1]);
	if(vec.size()%fold!=0) {cerr << "Vector to be folded equally into " << fold<< " segments, but size: "<<vec.size()<<" is not divisible by "<<fold<<"\n"; return 1;}
	int ressize=vec.size()/fold;
	std::vector<double> ret;
	for(int i=0;i<ressize;i++) ret.push_back(vec[i]);
	for(int j=1;j<fold;j++)
	{
		for(int i=0;i<ressize;i++) ret[i]*=vec[j*ressize+i];
	}
	for(auto num : ret) std::cout << num << " ";
	std::cout << "\n";
}
