# include <iostream>
using namespace std;

int main(){
	
	cout.setf(ios::fixed);
	cout.setf(ios::showpoint);
	cout.precision(5);
	
	double doubleNumber = 154.0/47;
	
	cout << doubleNumber;
	
	return 0;
	
}