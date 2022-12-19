#include "commons/commons.h"
#include "maths/maths.h"

int main(int argc,char** args)
{
	int nM;
	std::vector<Matrix> matrices;
	Matrix m;
	cout << "Enter matrix :\n";
	cin >> m;
	matrices.push_back(m);
	cout << "Enter exponent: ";
	cin >> nM;
	Matrix res=m;
	for(int i=1;i<nM;i++) res=res*m;
	cout << res << "\n";
}
