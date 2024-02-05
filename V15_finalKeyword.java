// final Variable
// public class V15_finalKeyword {
//     public static void main(){
//         final int num = 13;
//         System.out.println(num);
//     } // final means const
// }

// final class means u r stopping the inheritance.
// final method means class B's show() will now not override class A's show() and A's show() will be printed.
class A{
    public final void show(){
        System.out.println("A");        
    }
}
class B extends A{
    // public void show(){
    //     System.out.println("B");
    // }
}
public class V15_finalKeyword {
    public static void main(String args[]){
        B obj =  new B();
        obj.show();
    } 
}
// A 