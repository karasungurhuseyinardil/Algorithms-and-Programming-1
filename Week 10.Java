COME107-Lab-Week10


/*Example1-v1
Write a C++ program that calculate square-root of the number entered by user in a function. You should call this function in main function.

NOTE: Write the function with no parameter and no return type.
*/

#include<iostream>
#include<cmath>
using namespace std;

void SquareRoot()
{
     double number, result;

     cout << "Example1-v1" << endl;
     cout << "Enter a number:";
     cin >> number;
	 result = sqrt(number);
	 cout << "Result is " << result << endl;
}

int main()
{
     SquareRoot();
	 system("pause");
     return 0;
}



/*Example1-v2
Write a C++ program that calculate square-root of the number entered by user in a function. You should call this function in main function.

NOTE: Write the function with parameter and no return type.
*/
#include<iostream>
#include<cmath>
using namespace std;

void SquareRoot (double number)
{
	double result;
	cout << "Example1-v2" << endl;
	result = sqrt(number);
	cout << "Result is " << result << endl;
}

int main()
{
	double value;
	cout << "Enter a number : ";
	cin >> value;
	SquareRoot(value);
	system("pause");
	return 0;
}



/*Example1-v3
Write a C++ program that calculate square-root of the number entered by user in a function. You should call this function in main function.

NOTE: Write the function with return type and no parameter.
*/
#include<iostream>
#include<cmath>
using namespace std;

double SquareRoot()
{
	double number, result;
	cout << "Example1-v3" << endl;
	cout << "Enter a number:";
	cin >> number;
	result = sqrt(number);
	return result;
}

int main()
{
	double finalresult;
	finalresult= SquareRoot();
	cout << "Result is " << finalresult << endl;
	cout << "Result is " << SquareRoot() << endl;
	system("pause");
	return 0;
}





/*Example1-v4
Write a C++ program that calculate square-root of the number entered by user in a function. You should call this function in main function.

NOTE: Write the function with return type and parameter.
*/
#include<iostream>
#include<cmath>
using namespace std;

double SquareRoot(double number)
{
	double result;
	cout << "Example1-v4" << endl;
	result = sqrt(number);
	return result;
}

int main()
{
	double value;
	cout << "Enter a number : ";
	cin >> value;
	double finalresult;
	finalresult = SquareRoot(value);
	cout << "Result is " << finalresult << endl;
	cout << "Result is " << SquareRoot(value) << endl;
	system("pause");
	return 0;
}

/*Example2-v1
Write a C++ program that calculate division result of two numbers entered by user in a function. You should call this function in main function.

NOTE: Write the function with no parameter and no return type.
*/

#include<iostream>
#include<cmath>
using namespace std;

void Division()
{
     double number1, result; int number2;
     cout << "Example2-v1" << endl;
     cout << "Enter two numbers : ";
     cin >> number1 >> number2;
     result =number1/number2;
	 cout << "Result is " << result << endl;
}

int main()
{
     Division();
     system("pause");
     return 0;
}



/*Example2-v2
Write a C++ program that calculate division result of two numbers entered by user in a function. You should call this function in main function.

NOTE: Write the function with parameter and no return type.
*/
#include<iostream>
#include<cmath>
using namespace std;

void Division(double number1, int number2)
{
	double result;
	cout << "Example2-v2" << endl;
	result = number1/number2;
	cout << "Result is " << result << endl;
}

int main()
{
	double value1, value2;
	cout << "Enter two numbers:";
	cin >> value1 >> value2;
	Division(value1, value2);
	system("pause");
	return 0;
}



/*Example2-v3
Write a C++ program that calculate division result of two numbers entered by user in a function. You should call this function in main function.

NOTE: Write the function with return type and no parameter.
*/

#include<iostream>
#include<cmath>
using namespace std;

double Division()
{
	double number1, result; int number2;
	cout << "Example2-v3" << endl;
	cout << "Enter two numbers : ";
	cin >> number1 >> number2;
	result = number1/number2;
	return result;
}

int main()
{
	double finalresult;
	finalresult=Division();
    cout << "Result is " << finalresult << endl;
	cout << "Result is " << Division() << endl;
	system("pause");
	return 0;
}



/*Example2-v4
Write a C++ program that calculate division result of two numbers entered by user in a function. You should call this function in main function.

NOTE: Write the function with return type and parameter.
*/

#include<iostream>
#include<cmath>
using namespace std;

double Division(double number1, int number2)
{
	double result;

	cout << "Example2-v4" << endl;
	
	result = (number1/number2);

	return result;
}

int main()
{
	double value1; int value2;

	cout << "Enter two numbers : ";
	cin >> value1>>value2;

	double finalresult;
    finalresult = Division(value1, value2);
    cout << " Result is " << finalresult << endl;
	cout << " Result is " << Division(value1, value2) << endl;

	system("pause");
	return 0;
}

/*Example3

Write a C++ program that takes three integer number (x,y,z) from user and calculates and displays the following function result. The result should be calculated by a function. Then, you should call this function in main function.

f(x,y,z)=((x^3+y^9)^(0,5))/(3*z)

*/
#include<iostream>
#include<cmath>
using namespace std;

double f(double x, double y, double z)
{
	double result;

	result = sqrt(pow(x, 3) + pow(y, 9)) / (3 * z);

	return result;
}
int main()
{
	double a,b,c;
		
	cout << "Example3" << endl;
	cout << "Enter three numbers:";
	cin >> a >> b >> c;
		
	cout << "Result is " << f(a,b,c) << endl;
	
	system("pause");
	return 0;	
}


/*Example4
Write a C++ program that print following triangle using * by using a defined function

        *
      * * *
    * * * * *  
  * * * * * * *
* * * * * * * * *


*/

#include <iostream>
using namespace std;

void drawTriangle(int rows);

int main()
  {  
    int rows;
	cout <<"Enter number of rows: ";
	cin >> rows;
	drawTriangle(rows);
	system("pause");
	return 0;
  }
void drawTriangle(int rows)
  {
	int space;
	for(int i = 1, k = 0; i <= rows; ++i, k = 0)
		{
			for(space = 1; space <= rows-i; ++space)
				{
					cout <<"  ";
				}

			while(k != 2*i-1)
				{
				cout << "* ";
				++k;
				}
			cout << endl;
		}
  }


/*Example5
Write a C++ program that print following triangle using numbers by using a defined function

        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5

*/


#include <iostream>
using namespace std;

void drawTriangle(int rows);

int main()
 {
    int rows;
	cout <<"Enter number of rows: ";
	cin >> rows;
	drawTriangle(rows);
	system("pause");
	return 0;
  }
void drawTriangle(int rows)
  {
	int count=0;
	int count1=0;
	for(int i = 1; i <= rows; ++i)
	 {
	  for(int space = 1; space <= rows-i; ++space)
	    {
	     cout << "  ";
	     ++count;
	    }
	    int k=0;
	    while(k != 2*i-1)
	      {
	       if (count <= rows-1)
	         {
				cout << i+k << " ";
				++count;
			  }
	       else
			  {
				++count1;
				cout << i+k-2*count1 << " ";
			  }
	       ++k;
	      }
	  count1 = count = k = 0;
	  cout << endl;
	}
 }



/*Example6
Write a C++ program that print following triangle using * by using a defined function

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *


*/

#include <iostream>
using namespace std;

void drawTriangle(int rows);

int main()
  {
    int rows;
	cout <<"Enter number of rows : ";
	cin >> rows;
	drawTriangle(rows);
	system("pause");
	return 0;
  }
void drawTriangle(int rows)
  {
    for(int i = rows; i >= 1; --i)
     {
       for(int space = 0; space < rows-i; ++space)
       cout << "  ";

       for(int j = i; j <= 2*i-1; ++j)
       cout << "* ";

	   for(int j = 0; j < i-1; ++j)
	   cout << "* ";

       cout << endl;
     }
   }
