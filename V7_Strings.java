public class V7_Strings{
    public static void main(String args[]){
        String name =  new String("Nikhil");
        // or just write 
        // String name = "Nikhil"; // Computer will make the object bts.
        System.out.println("Hello "+name); // Hello Nikhil
        System.out.println(name.charAt(1)); // i
        System.out.println(name.concat(" Yadav")); // Nikhil Yadav

        // String s1="Nikhil";
        // String s2="Nikhil"; // Both are pointing at the same direction, So only one object is created.  
        // String constant pool will make object for every variable we create, Nikhil and nikhil are 2 different object. Every time u make Nikhil it will check in pool in the heap and the stack will point to tht particular location.
        // Strings are immutable Strings by default means it cant be changed ones it is made.

        // instead use StringBuffer which is a mutable String.

        StringBuffer sb = new StringBuffer("Nikhil"); // we can chnge this data.
        System.out.println(sb.length()); // 6        
        System.out.println(sb.capacity()); // Though it is a 6 letter word the capacity changes sometimes it can be 16 or 22. // It gives u a buffer or extra space so that if the word length changes it can accomodate in continous memory location. 

        sb.append(" Yadav");
        System.out.println(sb); // Nikhil Yadav

        String str=sb.toString(); // String buffer to String

        sb.deleteCharAt(2);
        System.out.println(sb); // Nihil Yadav

        sb.insert(2,'k'); // 'k' or "k" both will work
        System.out.println(sb); // Nikhil Yadav

    }
}