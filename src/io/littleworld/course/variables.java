
/// variable
int x = 3;
#// declares a variable of type int with the name x with a very long comment

/// print
System.out.println(x);
// print x

/// inferred
var x = 3;
#// the compiler infers the variable type;
since java 12

/// more variables
int x = 3, y = 4;
// declare more variables separated by a comma

/// constant
final int x = 3;
#// declares x as a constant

/// types
long l = 100;
double d = 3.14;
boolean b = true;
String s = "hello";
#// other primitive types;
String is a class

/// typecast
double d = x;
int x = (int) d;
#// int to double implicit cast
double to an int explicit cast

/// operators
int a = 4, b = 3, c;
c = a + b;   // 7
c = a - b;   // 1
c = a * b;   // 12
c = a / b;   // 1
c = a % b;   // 1
#// basic math operators
