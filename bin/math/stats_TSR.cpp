#include "maths/stats.h"
//cout << stats::stddev(stats::toNumList(args+1,argc-1)) << "\n";
int main(int argc,char** argv)
{
	std::vector<double> nums=stats::toNumList(argv+1,argc-1);
	double tot=0;
	for(int i=0;i<nums.size();i++) tot+=nums[i];
	tot/=nums.size();
	double TSR=0;
	for(int i=0;i<nums.size();i++) TSR+=(nums[i]-tot)*(nums[i]-tot);
	cout << "TSR: "<<TSR<<"\n";
}
