// class Calculator{
//     public int add(int n1, int n2){
//         return n1+n2;
//     }
// }
// public class V5_Oops{
//     public static void main(String args[]){
//         int n1=13;
//         int n2=10;

//         Calculator calc= new Calculator();
//         int res = calc.add(n1,n2);
//         System.out.println(res); // 23
//     }
// }

// Function Overloading
class calculator{
    int multiply(int a,int b){
        return a*b;
    }
    int multiply(int a ,int b,int c){
        return a*b*c;
    }
    double multiply(double a,double b){
         return  a*b;
    }

}
public class V5_Oops{
    public static void main(String args[]){
        
        calculator obj = new calculator();
        int c = obj.multiply(5,4);
        double d = obj.multiply(5.1,4.2);
        int e =obj.multiply(13,10,23);
        System.out.println("Mutiply method : returns integer : " + c);
        System.out.println("Mutiply method : returns double : " +  d);
        System.out.println("Mutiply method : returns integer : " +  e);


    }
}