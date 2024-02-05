// Runtime Errors are avoided by Exception Handling
// public class V23_Exceptionalhandling {
// public static void main(String a[]) {
// int i = 0;
// int j = 0;
// try {
// j = 18 / i;
// } catch (Exception e) {
// System.out.println("Something went wrong " + e);
// }
// System.out.println(j);
// System.out.println("Bye");
// }
// }
/*
 * Something went wrong java.lang.ArithmeticException: / by zero
 * 0
 * Bye
 * 
 */

// public class V23_Exceptionalhandling {
// public static void main(String a[]) {
// int i =2;
// int j = 0;
// int nums[]= new int[5];
// try {
// j = 18 / i;
// System.out.println(nums[1]);
// System.out.println(nums[5]);
// } catch (Exception e) {
// System.out.println("Something went wrong " + e);
// }
// System.out.println(j);
// System.out.println("Bye");
// }
// }

/*
 * 0
 * Something went wrong java.lang.ArrayIndexOutOfBoundsException: Index 5 out of
 * bounds for length 5
 * 9
 * Bye
 */

// public class V23_Exceptionalhandling {
// public static void main(String a[]) {
// int i = 0;
// int j = 0;
// int nums[] = new int[5];
// try {
// j = 18 / i;
// System.out.println(nums[1]);
// System.out.println(nums[5]);
// } catch (ArithmeticException e) {
// System.out.println("Cannot divide by Zero " + e);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Stay in your limits");
// }
// System.out.println(j);
// System.out.println("Bye");
// }
// }

/*
 * Cannot divide by Zero java.lang.ArithmeticException: / by zero
 * 0
 * Bye
 */

// public class V23_Exceptionalhandling {
// public static void main(String a[]) {
// int i = 2;
// int j = 0;
// int nums[] = new int[5];
// try {
// j = 18 / i;
// System.out.println(nums[1]);
// System.out.println(nums[5]);
// } catch (ArithmeticException e) {
// System.out.println("Cannot divide by Zero " + e);
// } catch (ArrayIndexOutOfBoundsException e) {
// System.out.println("Stay in your limits");
// }
// catch(Exception e){
// System.out.println("Another type of Exception");
// } // For other Exceptions, keep it below other exceptions as it is the parent
// type of all type of exceptions so if it is on the top it will take care of
// the exception if it arrives.
// System.out.println(j);
// System.out.println("Bye");
// }
// }

/*
 * 0
 * Stay in your limits
 * 9
 * Bye
 */

// Object -> Throwable -> Error
// -> Exception -> Runtime -> Arithmetic
// -> IO

// public class V23_Exceptionalhandling {
// public static void main(String a[]) {
// int i = 0;
// int j = 0;

// try {
// j = 18 / i; // 18/0 will give exception so it goes inside catch and do 18/1.
// // Exception Handling.
// if (j == 0)
// throw new ArithmeticException("I dont want to print zero"); // message
// } catch (ArithmeticException e) {
// j = 18 / 1;
// System.out.println("Default Output " + e);
// } catch (Exception e) {
// System.out.println("Error" + e);
// }
// System.out.println(j);
// System.out.println("Bye");
// }
// }
/*
 * Default Output java.lang.ArithmeticException: / by zero
 * 18
 * Bye
 */

// class MyException extends Exception {
// MyException(String string) {
// // calling a super class constructor
// super(string); // as the superclass constructor is also taking string.
// }
// }

// public class V23_Exceptionalhandling {
// public static void main(String a[]) {
// int i = 20;
// int j = 0;

// try {
// j = 18 / i; // 18/20 will give exception so it goes inside catch and do 18/1.
// // Exception Handling.
// if (j == 0)
// throw new MyException("I dont want to print zero"); // message
// } catch (MyException e) {
// j = 18 / 1;
// System.out.println("MyException Default Output " + e);
// } catch (Exception e) {
// System.out.println("Error" + e);
// }
// System.out.println(j);
// System.out.println("Bye");
// }
// }

/*
 * MyException Default Output MyException: I dont want to print zero
 * 18
 * Bye
 */

//  finally
// With Exception
//  public class V23_Exceptionalhandling {
//     public static void main(String a[]) {
//         int i = 0;
//         int j = 0;

//         try {
//             j = 18 / i; 
//             System.out.println("Bye"); // This wont be printed
//         } catch (Exception e) {
//             System.out.println("Something went wrong " + e);
//         } 
//         finally{

//         }
//     }
// }
// Something went wrong java.lang.ArithmeticException: / by zero

// Without exception
// public class V23_Exceptionalhandling {
//     public static void main(String a[]) {
//         int i = 2;
//         int j = 0;

//         try {
//             j = 18 / i; 
//             System.out.println("Bye");
//         } catch (Exception e) {
//             System.out.println("Something went wrong " + e);
//         } 
//         finally{

//         }
//     }
// } // 2

public class V23_Exceptionalhandling {
    public static void main(String a[]) {
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        } finally {
            System.out.println("Bye"); // THis will be printed with or without the exception
        }
    }
}
/*
 * Something went wrong java.lang.ArithmeticException: / by zero
 * Bye
 */