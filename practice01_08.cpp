# include <iostream>
using namespace std;

int main(){
	
	double c = 20;
	double f;
	f = (9/5)*c + 32.0;
	
	cout << "The Fahrenheit temperature is " << f << "\n";
	
	double right_f;
	right_f=(9.0/5)*c + 32.0;
	cout << "The programmer intended "<< right_f;
	
}