// Super();
// If u make Class A and Class B, If class B is inheriting from class A(Super class), if u make the object of class B then default constructor of class A runs first and then Class B's construtor runs(Default one if parameters are not given).
// Even if the parameterised constructor of class B is called bydefault the default constructor of class A runs.
// because Super() is present in it which says that go and run the default constructor of class A as Super() has no parameters and then the constructor of class B is run.
// If u give arguments in Super() like Super(n) where n is the argument same as the parameters in the constructor of class A then that parameterised Constructor of class A is run then Class B will run.

// class A {
//     public A() {
//         super(); // Bydefault it is present.
//         System.out.println("Default Constructor of A");
//     }

//     public A(int n) {
//         super(); // Bydefault it is present.
//         System.out.println("Parameterised Constructor of A");
//     }}

// class B extends A
// {

//     public B(){
//         super(); // Bydefault it is present.(Calling class of super class A)
//         System.out.println("Default Constructor of B");
//     }

//     public B(int n){
//         super(); // Bydefault it is present.
//         System.out.println("Parameterised Constructor of B");
//     }
// }

// public class V11_super_this {
//     public static void main(String args[]) {
//         B obj = new B();
//     }
// }

/*
Default Constructor of A
Default Constructor of B
 */

// class A {
//     public A() {
//         super(); // Bydefault it is present.
//         System.out.println("Default Constructor of A");
//     }

//     public A(int n) {
//         super(); // Bydefault it is present.
//         System.out.println("Parameterised Constructor of A");
//     }}

// class B extends A
// {

//     public B(){
//         super(); // Bydefault it is present.
//         System.out.println("Default Constructor of B");
//     }

//     public B(int n){
//         super(); // Bydefault it is present.
//         System.out.println("Parameterised Constructor of B");
//     }
// }

// public class V11_super_this {
//     public static void main(String args[]) {
//         B obj = new B();
//     }
// }
// Default Constructor of A
// Parameterised Constructor of B

// Super class is there in Class A bcoz there is a Object class
// class A extends Object 
// class A {
//     public A() {
//         super(); // Bydefault it is present.
//         System.out.println("Default Constructor of A");
//     }

//     public A(int n) {
//         super(); // Bydefault it is present.
//         System.out.println("Parameterised Constructor of A");
//     }}

// class B extends A
// {

//     public B(){
//         super(); // Bydefault it is present.
//         System.out.println("Default Constructor of B");
//     }

//     public B(int n){
//         super(n); // Bydefault it is present.
//         // or u can give a value super(5)
//         System.out.println("Parameterised Constructor of B");
//     }
// }

// public class V11_super_this {
//     public static void main(String args[]) {
//         B obj = new B(5);
//     }
// }

/*
Parameterised Constructor of A
Parameterised Constructor of B
 */

// this
class A {
    public A() {
        super(); // Bydefault it is present.
        System.out.println("Default Constructor of A");
    }

    public A(int n) {
        super(); // Bydefault it is present.
        System.out.println("Parameterised Constructor of A");
    }}

class B extends A
{

    public B(){
        super(); // Bydefault it is present.
        System.out.println("Default Constructor of B");
    }

    public B(int n){
        this(); // this calls the default constructor in B
        System.out.println("Parameterised Constructor of B");
    }
}

public class V11_super_this {
    public static void main(String args[]) {
        B obj = new B(5);
    }
}

/*
Default Constructor of A
Default Constructor of B
Parameterised Constructor of B
*/