#include "maths/stats.h"

using namespace std;
int main(int argc,char** args)
{
	/*std::vector<double> nums;
	for(int i=1;i<argc;i++)
		nums.push_back(std::stod(args[i]));*/
	int net=argc-1;
	if(net%2!=0) {cerr << "Required even number of entries. First half is observed and second half is expected values.\nFound odd number of entries.\n"; return 1;}
	std::vector<double> obs=stats::toNumList(args+1,net/2),expe=stats::toNumList(args+1+net/2,net/2);
	cout << stats::chi2(obs,expe) << "\n";
}
