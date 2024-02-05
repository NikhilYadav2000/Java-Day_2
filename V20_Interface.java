// In interface all are public, we use interface to design something. It will give u methods but wont implement them.

// interface A {
//     // all the variables in it are static and final(we have to put values in them)
//     int age=23;
//     void show();
//     void config();
// }
// interface X{
//     void run();
// }
// // interface Y extends X{}

// class B implements A,X { // class B implements A,Y if u extend X with Y
//     public void show() {
//         System.out.println("show");
//     }
//     public void config() {
//         System.out.println("config");
//     }
//     public void run(){
//         System.out.println("run");
//     }
// }

// public class V20_Interface {
//     public static void main(String args[]) {
//         // we cant make object of A
//         A obj = new B();
//         obj.show();
//         // A.area=12; as it is final u cant chnge them.

//         X obj1 = new B();
//         obj1.run(); // cant implement show() and config();
//     }
// }

abstract class Computer{ // interface Computer
    public abstract void code(); // void code();
} 
class Laptop extends Computer{ // class Laptop implements Computer
    public void code(){
        System.out.println("lap");
    }
}
class Desktop extends Computer{ // class Desktop implements Computer
    public void code(){
        System.out.println("Desk");
    }
}
class Dev {
    public void devApp(Computer obj ){
        obj.code();
        // System.out.println("Dev");
    }
}

public class V20_Interface {
    public static void main(String args[]) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        // Nikhil.devApp(); // Dev
        Dev Nikhil = new Dev(); 
        Nikhil.devApp(desk); // Desk
        Nikhil.devApp(lap); // lap
    }
}

// Types of Interface 
// 1. Normal - which has 2 or more than 2 methods
// 2. Functional (Simple Abstract Method) -> has only 1 method
// 3. Marker -> Has No methods (Blank Methods)