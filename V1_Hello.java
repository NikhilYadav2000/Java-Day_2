public class V1_Hello {
    public static void main(String args[]){
        // int num1=13;
        // int num2=10;
        // int res=num1+num2;
        // System.out.println("I'm Nikhil");
        // System.out.println(res);
        // char c = 'a';
        // c++;
        // System.out.println(c); // b

        // Type Casting (Explicit Conversion)

        // byte b = 127;
        // System.out.println(b); // 127
        // byte b = 257;
        // System.out.println(b); // will give error

        // byte b = 127;
        // int a = b;
        // System.out.println(a); // a = 127

        // int a = 12;
        // byte k = a;
        // System.out.println(k); // Error

        // int a = 12;
        // byte k = (byte)a;
        // System.out.println(k); // 12
        
        // int a = 257;
        // byte k = (byte)a;
        // System.out.println(k); // 257 % 256 = 1       

        // float f = 5.6f;
        // int t = (int)f;
        // System.out.println(t); // 5

        // Type Promotions 
        byte a = 10;
        byte b = 13;
        int res = a * b;
        System.out.println(res);


    }
}

//  Byte = 1byte - 2^-7 to 2^7 - 1 = -128 to 127.
//  char = 2 bytes it follows UNICODE not ASCII. char c = 'k'
//  By default decimal values are considered as a double (5.6) so u have to out 
//  (5.6f) to consider it as a float value.
//  Boolean gives true or false not 0 and 1. boolean b = true.

// Primitive Data Type
/* 
    int num = 9;
    byte by = 127;
    short sh = 558;
    long l = 5954l;
    float f = 5.8f;
    double d = 5.8;
    char c = 'k';
    boolean b = true;
*/

/*
byte b = 127;
int a = 12;
b = a not allowed
b = (byte)a; THIS IS CALLED CASTING(Explicit Conversion). (condition is the value of a is 12 which is in the range of -128 to 127 = 256 ).
if the value of a was 257 then modulo operator will be used 257%256=1, will be stored in the variable b.
a = b is allowed as a is a bigger varibale then b. THIS IS CALLED CONVERSION(Implicit Conversion = Done automatically by the computer ).  
 */