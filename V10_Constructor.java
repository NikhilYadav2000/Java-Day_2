// class Human{
//     private int age;
//     private String name;
//     public Human(int age,String name){
//         this.age=age;
//         this.name=name;
//     }
//     public int getAge(){ //getters
//         return age;
//     }
//     public String getName(){
//         return name;
//     }

// }
// public class V10_Constructor {
//     public static void main(String args[]){
//         Human obj=new Human(23,"Nikhil");
//         System.out.println(obj.getAge());
//         System.out.println(obj.getName());
//     }
// }

/*
 23
Nikhil
*/

// Constructor Overloading
class Human{
    private int age;
    private String name;
    public Human(){
        age = 23;
        name = "Nikki";
    }
    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }
    public Human(int age){
        this.age=age;
        this.name="Mona";
    }
    public Human(String name){
        this.name=name;
        this.age=22;
    }
    public int getAge(){ //getters
        return age;
    }
    public String getName(){
        return name;
    }

}
public class V10_Constructor {
    public static void main(String args[]){
        Human obj=new Human(22,"Sona");
        Human obj1=new Human();
        Human obj2=new Human(22);
        Human obj3=new Human("Mona");

        System.out.println(obj.getAge() + " " + obj.getName());
        System.out.println(obj1.getAge() + " " + obj1.getName());
        System.out.println(obj2.getAge() + " " + obj2.getName());
        System.out.println(obj3.getAge() + " " + obj3.getName());
    }
}

/*
22 Sona
23 Nikki
22 Mona
22 Mona

*/