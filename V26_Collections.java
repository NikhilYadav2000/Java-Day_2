// collection API
//  collection 
// Colledtions 

// List
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.List;

// public class V26_Collections {
//     public static void main(String args[]) {
//         List<Integer> nums = new ArrayList<Integer>();
//         nums.add(13);
//         nums.add(10);
//         nums.add(23);

//         System.out.println((nums).indexOf(13));
//         System.out.println((nums).get(2));
//         for (Object n : nums) {
//             int num = (Integer) n;
//             System.out.println(num);
//         }
//     }
// }
/*
 * 0
 * 23
 * 13
 * 10
 * 23
 */

// import java.util.ArrayList;
// import java.util.Collection;

// public class V26_Collections {
// public static void main(String args[]) {
// Collection<Integer> nums = new ArrayList<Integer>();
// nums.add(13);
// nums.add(10);
// nums.add(23);

// for (int n : nums) {
// System.out.println(n);
// }
// }
// }

// Set
// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
// import java.util.Map;

// public class V26_Collections {
//     public static void main(String args[]) {
//         Set<Integer> nums = new HashSet<Integer>();
//         nums.add(13);
//         nums.add(10);
//         nums.add(23);
//         nums.add(13); // cant have duplicate values
//         for (Object n : nums) {
//             int num = (Integer) n;
//             System.out.println(num);
//         }
//     }
// }
/*
 * 23
 * 10
 * 13 // Not following the sequence
 */

// import java.util.Collection;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;
// import java.util.TreeSet;

// import javax.swing.text.html.HTMLDocument.Iterator;

// public class V26_Collections {
//     public static void main(String args[]) {
//         // Set<Integer> nums = new TreeSet<Integer>();
//         Collection<Integer> nums = new TreeSet<Integer>(); //can also be used
//         nums.add(13);
//         nums.add(10);
//         nums.add(23);
//         nums.add(13); // cant have duplicate values
//         // Iterator<Integer> values = nums.iterator();
//         // while(values.hasNext()){
//         //     System.out.println(values.next());
//         // }
//         for (Object n : nums) {
//             int num = (Integer) n;
//             System.out.println(num);
//         }
//     }
// }

/*
 * 10
 * 13 
 * 23 // Order
 */

// Map
// import java.util.HashMap;
// import java.util.Map;
// public class V26_Collections {
//     public static void main(String args[]) {
//         Map<String, Integer> students = new HashMap<String, Integer>();
//         students.put("Nikki", 23);
//         students.put("Sona", 22);
//         students.put("Mona", 22);
//         System.out.println(students); // cant have duplicate keys, can have DUplicate values
//         System.out.println(students.keySet());
//         for(String key : students.keySet()){
//             System.out.println(key + " : " + students.get(key));
//         }
//     }
// }

// arranged in Asceding order of keys.
// {Mona=22, Nikki=23, Sona=22}
// [Mona, Nikki, Sona] // keyset

// import java.util.HashMap;
// import java.util.Hashtable;
// import java.util.Map;
// public class V26_Collections {
//     public static void main(String args[]) {
//         Map<String, Integer> students = new Hashtable<>();
//         students.put("Nikki", 23);
//         students.put("Sona", 22);
//         students.put("Mona", 22);
//         System.out.println(students); // cant have duplicate keys, can have DUplicate values
//         System.out.println(students.keySet());
//         for(String key : students.keySet()){
//             System.out.println(key + " : " + students.get(key));
//         }
//     }
// } // Synchornise table // same output

// sorting
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// public class V26_Collections{
//     public static void main(String args[]){
//         List<Integer> nums = new ArrayList<>();
//         nums.add(13);
//         nums.add(10);
//         nums.add(23);
//         Collections.sort(nums);
//         System.out.println(nums);

//     }
// } //[10, 13, 23]

// Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class V26_Collections{
    public static void main(String args[]){
        Comparator<Integer> com = new Comparator<Integer>(){
            public int compare(Integer i,Integer j){ // Integer is class name
                if(i%10>j%10) return 1;
                else return -1;
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(15);
        nums.add(10);
        nums.add(21);
        Collections.sort(nums,com);
        System.out.println(nums);

    }
} // [10, 21, 15]