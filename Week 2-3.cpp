
COME107-Lab-Week 
Example1-v1
//Write a program that displays "Welcome to C++" //sentence on the screen

#include <iostream>
using namespace std;

  int main()
   {
	cout << "Welcome to C++" << endl;

	system("pause");
	return 0;
    }


//Example1-v2
//Write a program that displays "Welcome to C++" //sentence on the screen

  #include<iostream>
  using namespace std;

  int main()
   {
	cout << "Welcome to C++.\n";

	system("pause");
	return 0;
   } //end main function



 //Example2-v1
//Write a program that displays "Welcome to C++" //sentence on the screen

 #include<iostream>
 using namespace std;
 
 int main()
 {
      cout << "Example2-v1: \n";
      cout << "Welcome "; 
      cout << "to "; 
      cout<<"C++.\n";
      
      system("pause");
      return 0;
 }

//Example2-v2
//Write a program that displays "Welcome to C++" //sentence on the screen
 
  #include<iostream>
  using namespace std;
 
 int main()
   {
	 cout << "Example2-v2:" << endl;
	 cout << "Welcome ";
	 cout << "to ";
	 cout << "C++.";
	 cout << endl;

	 system("pause");
	 return 0;
 }

//Example3-v1
//Write a program that displays "Welcome to C++" //sentence on the screen (in two lines)
//
//Welcome 
//to C++

#include<iostream>
 using namespace std;
 
 int main()
 {
      cout << "Example3-v1:\n\n";
      cout << "Welcome \n to C++." <<endl <<endl ;
	  cout << endl;
      system("pause");
      return 0;
 }

//Example3-v2
//Write a program that displays "Welcome to C++" //sentence on the screen (in two lines)
//Welcome 
//to C++

  #include<iostream>
  using namespace std;
 
  int main()
   {
 	cout << "Example3-v2" << endl << endl;
 	cout << "Welcome";
 	cout << endl;
 	cout << "to C++.";
 	cout << endl;
 	cout << endl;
 
 	system("pause");
 	return 0;
 }
 
//Example 4 -v1
//Write a C++ program that takes one side length of //square and display the area (result) on the screen.


  #include<iostream>
  using namespace std;
 
  int main()
  {
	int side;
	int area;

	cout << "Enter the side length:"<<endl;
	cin >> side;

	area = side * side;

	cout << "The area of square:" << area << endl;

	system("pause");

	return 0;
  }


//Example 5 -v2
//Write a C++ program that takes one side length of //square and display the area (result) on the screen.
  
  #include<iostream>
  using namespace std;

  int main()
   {	
     int side;

 cout << "Enter one side length value of square:  ";
     cin >> side;

     cout << "The area result : " << side*side<<endl<<"\n";
      
      system("pause");
      return 0;
 }



//Example 2-v1
//Write a C++ program that takes length and width of //rectangle and display the area (result) on the //screen.

   #include<iostream>
   using namespace std;

int main()
  {
     double width;
     double length;
     double area;

     cout << "Enter width value of rectangle: ";
     cin >> width;
     
     cout << "Enter length value of rectangle: ";
     cin >> length;

     area = width*length;

    cout << "The area result :" << area << endl << "\n";

      system("pause");
       return 0;
   }

//Example 2-v2
//Write a C++ program that takes length and width of //rectangle and display 
//the area (result) on the screen.

   #include<iostream>
   using namespace std;
 
   int main()
    {
      double width, length;
 
      cout << "Enter width value of rectangle: ";
      cin >> width;
     
      cout << "Enter length value of rectangle: ";
      cin >> length;
 
      cout << "The area result : " << width*length << endl << "\n";
 
      system("pause");
      return 0;
   }

//Example 3-v1
//Write a C++ program that takes length, width and //height of rectangular prism
//and display the volume (result) on the screen.
 
   #include<iostream>
   using namespace std;
 
   int main()
    {
     double width;
     double length;
     double height;
     double volume;

      cout << "Enter width value of rectangular prism:";
      cin >> width;

      cout << "Enter length value of rectangular prism:";
      cin >> length;
 
      cout << "Enter height value of rectangular prism:";
      cin >> height;
 
      volume= width*length*height;
 
      cout << "The volume result :" << volume << endl << "\n";
 
       system("pause");
       return 0;
   }

//Example 3-v2
//Write a C++ program that takes length, width and //height of rectangular prism
//and display the volume (result) on the screen.

    #include<iostream>
    using namespace std;
 
   int main()
   {
      double width,length,height;
      
      cout << "Enter width value of rectangular prism:" <<endl;
      cin >> width;
 
      cout << "Enter length value of rectangular prism:"<<endl;
      cin >> length;
 
     cout << "Enter height value of rectangular prism:" <<endl;
     cin >> height;
 
     cout << "The volume result:" << width*length*height << endl << "\n";
 
      system("pause");
      return 0;
    }

//Example 4
//Write a C++ program that takes two numbers from //user and display the division (result) on the //screen.

  #include<iostream>
  using namespace std;
 
  int main()
   {
      double number1, number2, result;
 
      cout << "Enter first number:";
      cin >> number1;
 
     cout << "Enter second number:";
     cin >> number2;

     result = number1 / number2;
 
     cout << "\n The division result:" << result << endl << "\n";
 
      system("pause");
      return 0;
    }

//Example 5
//Write a C++ program that takes three numbers from //user and display 
//the following equation result on the screen.
//Result = (x + y) % (z - 3)

   #include<iostream>
   using namespace std;
 
   int main()
   {
 	int x, y, z, result;
 
 	cout << "Enter first number:"<<endl;
 	cin >> x;
 
 	cout << "Enter second number:"<<endl;
 	cin >> y;
 
 	cout << "Enter third number:"<<endl;
 	cin >> z;
 
 	result = (x + y) % (z - 3);
 
 	cout << "\nThe result:" << result << endl << "\n";
 
 	system("pause");
 	return 0;
 }
