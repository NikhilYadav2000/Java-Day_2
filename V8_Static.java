// class Mobile{
//     static String type;
//     String brandName;
//     int Cost;

//     public void show(){
//         System.out.println("Type : " + type + ", Brand Name : " + brandName + ", Cost : " + Cost );
//     }
// }
// public class V8_Static{
//     public static void main(String args[]){
//         Mobile obj1=new Mobile();
//         obj1.brandName="Apple";
//         obj1.Cost=70000;

//         Mobile obj2=new Mobile();
//         obj2.brandName="Samsung";
//         obj2.Cost=45000;

//         // as "type" is a static variable it should be used wiht the class datatype as it is shared with all the objects.

//         Mobile.type="Smartphone";
//         obj1.show();
//         obj2.show();

//     }
// }

// class Mobile{
//     static String type;
//     String brandName;
//     int Cost;

//     static{ // Static block contanins static variable.
//         type="Smartphone";
//         System.out.println("Static variable was called");
//     }
    
//     public Mobile(){
//         brandName="Abc";
//         Cost=35000;
//         System.out.println("Constructor was called");
//     }

// }
// public class V8_Static{
//     public static void main(String args[]){
//         Mobile obj1=new Mobile();
//         Mobile obj2=new Mobile();
//     }
// }

/*
Static variable was called
Constructor was called
Constructor was called
 */

// No matter what is the sequince of the Static varibale with respect to the constructor it will be called first and only ones no matter how many objects are there.


// To call the Static variable without making objects we use "Class Class",
// write inside main() = Class.forname("Mobile") // Mobile is the name of our class. It throws an exception beside our main(); 
// Static Block is called

class Mobile{
    static String type;
    String brandName;
    int Cost;

    static{ // Static block contanins static variable.
        type="Smartphone";
        System.out.println("Static variable was called");
    }
    
    public Mobile(){
        brandName="Abc";
        Cost=35000;
        System.out.println("Constructor was called");
    }

    // Static variables can be used inside a static method; 
    public static void show1(Mobile obj){
        System.out.println("in static method : " + obj.brandName + " : " + obj.Cost + " : " + type);
    } // to use non static instance inside static variable use reference.


}
public class V8_Static{
    public static void main(String args[]){
        Mobile obj1=new Mobile();
        obj1.brandName="Apple";
        obj1.Cost=70000;
        Mobile obj2=new Mobile();
        Mobile.show1(obj1);
    }
}

/*
Static variable was called
Constructor was called
Constructor was called
in static method : Apple : 70000 : Smartphone
*/

// public static void main(String args[]) // We write static here bcoz it is where execution starts.