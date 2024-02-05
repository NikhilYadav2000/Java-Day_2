// cs V6_Arrays{
//     public static void main(String args[]){
//         int num[]= {1,2,3};
//         for(int i=0;i<3;i++){
//             System.out.println(num[i]);
//         }
//     }
// }
/*
1
2
3
 */

// cs V6_Arrays{
//     public static void main(String args[]){
//         int num[]= new int[4];
//         // if we dont put any values then all the values will be 0;
//         num[0]=4;
//         num[1]=8;
//         num[2]=12;
//         num[3]=16;
//         for(int i=0;i<4;i++){
//             System.out.println(num[i]);
//         }
//     }
// }
/*
4
8
12
16
 */

// Multidimensional Array
// cs V6_Arrays{
//     public static void main(String args[]){
//         int num[][]=new int [3][4];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 num[i][j]=(int)(Math.random()*10);
//             }
//         }
//         for(int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 System.out.print(num[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

/*
9 3 3 9  
5 8 0 4
3 7 3 5
 */

// cs V6_Arrays{
//     public static void main(String args[]){
//         int num[][]=new int [3][4];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<4;j++){
//                 num[i][j]=(int)(Math.random()*10);
//             }
//         }

// For Each Loop or Enhanced Loop
//         for(int n[]:num){ // n is an array jo hum num k 3 rows hai unme se ek ek kr k uthayega wo
//             for(int m:n){ // fir harr ek row k harr ek number ko "m" uthayega.
//             System.out.print(m + " ");
//             }
//             System.out.println();
//         }
//     }
// }
/*
7 5 0 5 
1 5 1 1
3 1 9 9 
 */

// Jagged Array -  We know the number of rows but the number of colums are not clear.
// cs V6_Arrays{
//     public static void main(String args[]){
//         int nums[][]= new int[3][];
//         nums[0]= new int[3];
//         nums[1]= new int[4];
//         nums[2]= new int[2];
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums[i].length;j++){
//                 nums[i][j]=(int)(Math.random()*10);
//             }
//         }
//         for(int n[]:nums){
//             for(int m:n){
//                 System.out.print(m + " ");
//             } System.out.println();
//         }
//     }
// }
/*
6 1 1 
7 8 0 1
1 5
 */

class Student{
    String name;
    int cs;
    int rollno;
}
class V6_Arrays{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Nikhil";
        s1.cs=20;
        s1.rollno=6;

        Student s2=new Student();
        s2.name="Rishika";
        s2.cs=12;
        s2.rollno=8;

        Student s3[]= new Student[2];
        s3[0]=s1;
        s3[1]=s2;
        for(int i=0;i<s3.length;i++){
            System.out.println(s3[i].name + " " + s3[i].cs + " " + s3[i].rollno);
        }
        for(Student stud:s3){
            System.out.println(stud.name + " " + stud.cs + " " + stud.rollno);
        }
    }
}
/*
Nikhil 20 6
Rishika 12 8
Nikhil 20 6
Rishika 12 8
 */