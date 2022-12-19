#include "commons/commons.h"
#include "maths/maths.h"

int main(int argc,char** args)
{
	int nM;
	if(argc<2)
		nM=2;
	else
		nM=std::stoi(args[1]);
	std::vector<Matrix> matrices;
	Matrix m;
	for(int i=0;i<nM;i++)
	{
		cout << "Enter matrix "<<(i+1)<<":\n";
		cin >> m;
		matrices.push_back(m);
	}
	Matrix res=matrices[0];
	for(int i=1;i<nM;i++)
		res=res*matrices[i];
	cout << res << "\n";
}
