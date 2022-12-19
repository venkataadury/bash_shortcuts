#include "maths/stats.h"
#include "maths/maths.h"

int main(int argc,char** args)
{
	Vector v=stats::toNumList(args+1,argc-1);
	Polynomial p(v);
	std::vector<double> roots=p.getRoots();
	for(double d : roots)
		cout << d << " ";
	cout << "\n";
}
