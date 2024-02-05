// Polymorphism
// 1. Compile Time - Early Binding (Ex - Overloading)
// 2. Run Time - Late Binding (Ex-  Overridding)

// Run Time Polymorphism
// class Computer {
//     public void show() {
//         System.out.println("Computer");
//     }
// }

// class Laptop extends Computer {

// }

// public class V14_Polymorphism {
//     public static void main(String args[]) {
//         // Laptop obj = new Laptop();
//         Computer obj = new Laptop(); // Reference obj is of Computer type but object is of Laptop type.
//         obj.show();
//     }
// }
// Computer

class Computer {
    public void show() {
        System.out.println("Computer");
    }
}

class Laptop extends Computer {
    public void show() {
        System.out.println("Laptop");
    }
}

public class V14_Polymorphism {
    public static void main(String args[]) {
        Computer obj = new Computer();
        obj.show(); // Computer

        obj = new Laptop(); // Computer obj will now refer to Laptop object in heap
        obj.show(); // Laptop
    }
}