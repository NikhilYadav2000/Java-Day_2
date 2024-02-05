// abstract class Car {
//     public abstract void drive(); // just declared it and when this will be inherited they must define it.

//     public void playMusic() {
//         System.out.println("Play Music");
//     }
// }

// class Mercedes extends Car {
//     public void drive() {
//         System.out.println("Driving...");
//     }

// }

// public class V18_abstractKeyword {
//     public static void main(String args[]) {
//         Mercedes obj = new Mercedes();
//         obj.drive();
//         // Cant create object of the abstract class
//         // Car obj = new Car(); // Not allowed

//         Car obj1 = new Mercedes();
//         obj1.drive(); // Mercedes drive() will be called
//         obj1.playMusic();
//     }

// }

abstract class Car {
    public abstract void drive(); // 2 abstract classes

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

abstract class Mercedes extends Car { // if u cant satisfy all the abstract classes then this also becomes an abstract
                                      // class.
    public void drive() {
        System.out.println("Driving...");
    }

}

class UpdatedMercedes extends Mercedes {
    public void fly() {
        System.out.println("Flying");
    }
}

public class V18_abstractKeyword {
    public static void main(String args[]) {
        Mercedes obj = new UpdatedMercedes();
        obj.drive();
        // Cant create object of the abstract class
        // Car obj = new Car(); // Not allowed

        Car obj1 = new UpdatedMercedes();
        obj1.drive(); // Mercedes drive() will be called
        obj1.playMusic();
    }

}
