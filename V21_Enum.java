// enum Status { // Status is a class
//     Running, Failed, Pending, Success;
// }

// public class V21_Enum {
//     public static void main(String args[]) {
//         // Status s= Status.Running;
//         // System.out.println(s); // Running
//         // System.out.println(s.ordinal()); // 0
//         Status[] s = Status.values(); // this gives array
//         // System.out.println(s); // It gives address
//         System.out.println(s[0]); // Running

//         for (Status n : s) {
//             System.out.println(n + " : " + n.ordinal());
//         }
//         /*
//          * Running : 0
//          * Failed : 1
//          * Pending : 2
//          * Success : 3
//          */
//     }
// }

// Enum cant be extended (No Parent child)
enum Laptop { // Laptop is a class
    mackbook(2000), Asus(3000), Dell(1000), thinkpad;

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println(this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class V21_Enum {
    public static void main(String args[]) {
        // Laptop lap = Laptop.mackbook;
        // System.out.println(lap + " : " + lap.getPrice());
        // mackbook : 2000

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
/*
 * mackbook
 * Asus
 * Dell // thinkpad is not here bcoz it was created using the default constructor.
 * mackbook : 2000
 * Asus : 3000
 * Dell : 1000
 * thinkpad : 500
 */