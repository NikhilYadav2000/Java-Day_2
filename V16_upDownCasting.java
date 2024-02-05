class A{
    public void show1(){
        System.out.println("A");
    }
}
class B extends A{
    public void show2(){
        System.out.println("B");
    }
}
public class V16_upDownCasting {
    public static void main(String args[]){

        // Up Casting
        // A obj = new B();
        // obj.show1();
        A obj = (A)new B();
        obj.show1();

        // Down Casting
        B obj1 = (B)obj;
        obj1.show1();
        obj1.show2(); // As now we have typecasted class A to class B it has all the features of B (show1 and show2)
    }
}
