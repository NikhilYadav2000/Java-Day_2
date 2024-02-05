// While Loop
// class V4_Loops{
//     public static void main(String args[]){
//         int i = 1;
//         while(i<=4){
//             System.out.println("Hii" + i);
//             i++;
//         }
//     }
// }

/*
Hii1
Hii2
Hii3
Hii4
 */

// // Do while
// class V4_Loops{
//     public static void main(String args[]){
//         int i = 1;
//         do{
//             System.out.println("Hii" + i);
//             i++;
//         }
//         while(i<=4);
//     }
// }

/*
Hii1
Hii2
Hii3
Hii4
 */

// For Loop
// class V4_Loops{
//     public static void main(String args[]){
//         for(int i=0;i<5;i++){
//             System.out.println(i);
//         }
//     }
// }

/*
0
1
2
3
4
 */

// Nested Loop
class V4_Loops{
    public static void main(String args[]){
        for(int i=0;i<=5;i++){
            System.out.println("Day " + i);
            for(int j=1;j<=9;j++){
            System.out.println("  " + (j+8)); // j+8 in bracket as we want the compiler to deal with it separately otherwise it will concatenate it instead of adding it.
            }
        }

    }
}