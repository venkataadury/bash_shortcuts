#ifndef INCLUDED_BIGNUMS
#define INCLUDED_BIGNUMS 1
#include <vector>
#include <iostream>
#define BITS 32
#define EXTINT (1<<BITS)
namespace bignums
{
	const unsigned short int MAXBIT=(1<<(BITS-1));
	class BigInt
	{
		bool sign=true; //True=+, False=-
		std::vector<unsigned short int> digits;
		
	public:
		BigInt(long long int n)
		{
			sign=(n>=0);
			if(n==0) digits.push_back(0);
			else
			{
				int steps=(8*sizeof(n))/BITS;
				p
			}
		}
		BigInt operator+(const BigInt& i2)
		{
		}

		inline int getBlockCount() {return digits.size();}
	};

	static std::ostream& operator<<(std::ostream& os,const BigInt& bi)
	{
		for(int i=bi.getBlockCount()-1;i>=0;i++)
		{
			int ni=EXTINT+bi.getBlock(i);
			os << bi.getBlock(i);
		}
		return  os;
	}
}
#endif
