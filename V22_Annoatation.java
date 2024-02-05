// Debugging - Spelling mistake in B (Logical error)
// @override gives u the mistake.
// @deprecated is used to show deprecated classes.
// class A{
//     public void showw(){
//         System.out.println("A");
//     }
// }
// class B extends A{
//     @Override
//     public void showw(){ // we wrote shww
//         System.out.println("B");
//     }
// }
// public class V22_Annoatation {
//     public static void main(String a[]){
//         B obj = new B();
//         obj.showw(); // It gave A but now it gives B.
//     }
// }

// @FunctionalInterface  is an interface which has only 1 method
@FunctionalInterface
interface A {
    // void show(int i);
    int show(int i, int j);

}

public class V22_Annoatation {
    public static void main(String args[]) {
        // A obj = new A(){
        // public void show(){
        // System.out.println("show");
        // }
        // };
        // obj.show();

        // Lambda Expression
        // A obj = () -> System.out.println("show");
        // obj.show(); // show

        // A obj = new A(){
        // public void show(int i){
        // System.out.println("show" + i);
        // }
        // };
        // obj.show(5);

        // Lambda Expression
        // A obj = i -> System.out.println("show " + i);
        // obj.show(5); // show + 5

        // A obj = new A() {
        //     public int show(int i, int j) {
        //         return i + j;
        //     }
        // };
        // System.out.println(obj.show(13, 10)); // 23

        A obj = (i, j) -> i + j;
        System.out.println(obj.show(13, 10)); // 23
    }
}
