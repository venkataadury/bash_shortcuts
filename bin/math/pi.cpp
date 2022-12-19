#include <iostream>
#include <cmath>
#include <cassert>

using std::cout;
int main(int argc,char** argv)
{
	int preclim=-1;
	if(argc>1) preclim=std::stoi(argv[1]);
	const int base=10;
	double pi=0;
	int prec=0;
	double r=1;
	double rprec=::pow(base,-prec-1)/3.0;
	for(int i=1;;i+=2)
	{
		pi+=4.0*(r/i)*((((i+1)/2)%2==0)?-1.0:1.0);
		if((1.0/(double)i)<rprec)
		{
			r*=base;
			long int dig=(long int)pi;
			cout << dig;  //<< (i<5?".":"");
			cout.flush();
			pi*=base;
			pi-=base*dig;
			assert(pi<10.0);
			prec++;
			rprec=::pow(base,-prec-1)/3.0;
			if(prec==preclim) break;
		}
	}
}
