#include "maths/stats.h"

using namespace std;
int main(int argc,char** args)
{
	auto vec=stats::toNumList(args+2,argc-2);
	for(auto num : vec) std::cout << num+std::stod(args[1]) << " ";
	std::cout << "\n";
}
