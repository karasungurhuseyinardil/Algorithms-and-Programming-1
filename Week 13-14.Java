COME107-Week13-14

1)	Write the program that creates the matrix A below and displays it on the screen.


#include <iostream>
using namespace std;

int main()
{
	int row, column;
	char A[5][5];

	for (int row = 0; row < 5; row++)
	{
		for (int column = 0; column < 5; column++)
		{
			if (row == column || (row + column) == 4)
			{
				A[row][column] = '*';
			}
			else
			{
				A[row][column] = ' ';
			}

			cout << A[row][column];
		}
		cout << endl;

	}

	cout << endl << endl;
	system("pause");
	return 0;
}


//OR

#include <iostream>
using namespace std;
int main()

{
	char star[5][5];
	
	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
		{
			if (i == j || j == 4 - i)

			{
				star[i][j] = '*';
			}

			else

			{
				star[i][j] = '\0';
			}
		}
	}

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 5; j++)
		{
			cout << star[i][j];
		}

		cout << endl;
	}
    system("pause");
	return 0;
}

2) Write the program that adds the A and B matrices below and displays the result on the screen.

 

#include <iostream>
using namespace std;

int main()
{
	int row, column;
	int A[3][3] = { { 3,5,9 },{ 4,6,1 },{ 1,8,2 } };
	int B[3][3] = { { 1,0,3 },{ 4,5,7 },{ 2,3,6 } };
	int C[3][3];

	for (row = 0; row < 3; row++)
	{
		for (column = 0; column < 3; column++)
		{
			C[row][column] = A[row][column] + B[row][column];
			cout << C[row][column]<<"  ";
		}
		cout << endl;
	}
	cout << endl<<endl;
	system("pause");
	return 0;
}

3)	 Write a program that replaces rows and columns of a matrix as follows.


 

#include <iostream>
#include <stdlib.h>
using namespace std;

int main()
{
	int j, i;

	int A[3][4] = { { 0,1,2,3 },{ 4,5,6,7 },{ 8,9,0,4 } };
	int B[4][3];

	cout << "A matrix : \n";

	for (i = 0; i < 3; ++i)
	{
		for (j = 0; j < 4; ++j)
		{
			cout << A[i][j] <<" ";
			B[j][i] = A[i][j];
		}
		cout << endl;
	}

	cout << endl<<endl;
	cout << "B matrix : \n";
	for (i = 0; i < 4; ++i)
	{
		for (j = 0; j < 3; ++j)
		{
			cout << B[i][j] <<" ";
		}
		cout << endl;
	}
	cout << endl << endl;
	system("pause");
	return 0;
}






4) Pointer :Show the basic declaration of pointer :
Here is m = 10, n and o are two integer variable and *z is an integer

#include <iostream>
using namespace std;

int main()
{
	int m = 10, n, o;
	int* z = &m;

	cout << "\n\n Pointer \n Show the basic declaration of pointer :\n\n";
	cout << "-------------------------------------------------------\n\n";
	cout << " Here is m=10, n and o are two integer variable and *z is an integer";
	cout << "\n\n z stores the address of m  = " << z; // z is a pointer so %p would 
	//print the address
	cout << "\n *z stores the value of m = " << *z;
	cout << "\n &m is the address of m = " << &m; // &m gives the address of the 
	//integer variable m so %p is the specifier for that address
	cout << "\n &n stores the address of n = " << &n;
	cout << "\n &o  stores the address of o = " << &o;
	cout << "\n &z stores the address of z = " << &z; // &z gives the address, 
	//where the pointer z is stored -> still an address -> %p is the right specifier 
	cout << endl << endl;
	system("pause");
	return 0;
}






5 )Write a program in C++ to add two numbers using pointers.

#include <iostream>
using namespace std;
int main()
{
	int fno, sno, *ptr, *qtr, sum;

	cout << "\n\n Pointer \n Add two numbers \n\n";
	cout << "--------------------------------";
	cout << "\n\n Input the first number : ";
	cin >> fno;
	cout << " Input the second  number : ";
	cin >> sno;

	ptr = &fno;
	qtr = &sno;

	sum = *ptr + *qtr;

	cout << " The sum of the entered numbers is : " << sum;
	cout << endl<<endl;
	system("pause");
	return 0;
}

6)  This is an example of using pointer.

#include <iostream>
using namespace std;

int main() {

	int number = 1453;
	cout << "Variable value : " << number << endl;
	cout << "Variable adress: " << &number << endl;
	cout << endl;

	int *ptr = &number;
	cout << "Address indicated by the pointer   : " << ptr << endl;
	cout << "Address value indicated by pointer : " << *ptr << endl;
	cout << "Address of the pointer : " << &ptr <<endl;

	system("pause");
	return 0;
}



7)The use of pointers to represent array elements


#include <iostream>
using namespace std;

int main() {

	int numbers[] = { 55, 66, 77, 88, 99, 18 };
	int* ptr = numbers; // &numbers[0];

	cout << "1.element: " << *ptr << endl;
	ptr++;
	cout << "2.element: " << *ptr << endl;
	cout << "5.element: " << *(ptr + 3) << endl;
	ptr--;
	cout << "1.element: " << *ptr << endl;

	system("pause");
	return 0;
}


8) The use of pointers to write the contents of array elements

#include <iostream>
using namespace std;

int main() {

	int numbers[] = { 55, 66, 77, 88, 99, 18 };
	int* ptr = numbers;

	for (int i = 0; i < sizeof(numbers) / 4; i++) {
		cout << "numbers[" << i << "] = " << *(ptr + i) << endl;
	}

	system("pause");
	return 0;
}

9) Create the program that calculates and prints a multiplication table for all values between 1 and 9 inclusive.


#include <iostream>
using namespace std;

int main()
{
	const int numRows= 10 ;
	const int numCols= 10;

//	Declare a 10x10 array
	int product[numRows][numCols]={};

//	Calculate a multiplication table
	for (int row=1 ; row < numRows; ++row)
	{
		for (int col= 1 ; col < numCols; ++col)
		{
			product[row][col] = row * col;
		}
	}

//  Print the table
	for (int row=1 ; row < numRows; ++row)
	{
		for (int col= 1 ; col < numCols; ++col)
		{
			cout << product[row][col] << '\t';
		}

		cout << '\n';
	}

	system("pause");
	return 0;
}
