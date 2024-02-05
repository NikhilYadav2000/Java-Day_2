// class A {
//     public void show() {
//         System.out.println("In A show");
//     }

//     public void config() {
//         System.out.println("In A Config");
//     }
// }

// class B extends A {

// }

// public class V13_MethodOverriding {
//     public static void main(String args[]) {
//         B obj = new B();
//         obj.show();
//         obj.config();
//     }
// } // class A's show method will be called
/*
 * In A show
 * In A Config
 */

class A {
    public void show() {
        System.out.println("In A show");
    }

    public void config() {
        System.out.println("In A Config");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

public class V13_MethodOverriding {
    public static void main(String args[]) {
        B obj = new B();
        obj.show();
        obj.config();
    }
} // B overrid A
/*
 * In B show
 * In A Config
 */