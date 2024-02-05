import V12.V12_Inheritance_AdvCalc;
public class V12_Inheritance {
    public static void main(String args[]) {
        V12_Inheritance_AdvCalc obj = new V12_Inheritance_AdvCalc();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        System.out.println(r1 + " " + r2); // 9 4
        int r3 = obj.mul(4, 5);
        int r4 = obj.div(7, 3);
        System.out.println(r3 + " " + r4); // 20 2
    }
}

// Single Inheritance
/*
 * A
 * ^
 * |
 * B
 */

// Multilevel Inheritance
/*
 * A
 * ^
 * |
 * B
 * ^
 * |
 * C
 */

// Multiple Inheritance =  Not possible
/*
 
*/