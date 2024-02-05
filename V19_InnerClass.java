// class A{
//     public void show(){
//         System.out.println("A");
//     }
//     class B{
//         public void config(){
//             System.out.println("B");
//         }
//     }
// }
// public class V19_InnerClass {
//     public static void main(String args[]){
//         A obj = new A();
//         obj.show(); // A
//         A.B obj1 = obj.new B();
//         obj1.config(); // B
//     }
// }

// we can make inner class as static not A.
// class A{
//     public void show(){
//         System.out.println("A");
//     }
//     static class B{
//         public void config(){
//             System.out.println("B");
//         }
//     }
// }
// public class V19_InnerClass {
//     public static void main(String args[]){
//         A obj = new A();
//         obj.show(); // A
//         A.B obj1 = new A.B(); // will create a file A$B
//         obj1.config(); // B
//     }
// }

// Anonymous Class
class A{ // Same for abstarct class A 
    public void show(){
        System.out.println("A");
    }
}
public class V19_InnerClass {
    public static void main(String args[]){
        A obj = new A(){
            public void show(){
                System.out.println("B");
            }
        };
        obj.show(); // B

    }
}