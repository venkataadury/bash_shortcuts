#include "commons/commons.h"
#include "maths/maths.h"

int main(int argc,char** args)
{
	Matrix m;
	cout << "Enter matrix:\n";
	cin >> m;
	cout << m.getInverse() << "\n";
}
