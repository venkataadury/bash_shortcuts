#include <iostream>

using std::cout;
long int factorial(int n)
{
	long int r=1;
	for(int i=2;i<=n;i++) r*=i;
	return r;
}
int main(int argc,char** argv)
{
	int n=std::stoi(argv[1]);
	int r=std::stoi(argv[2]);
	int nPr=factorial(n);
	nPr/=factorial(n-r);
	cout << nPr << "\n";
	return 0;
}
