class Human{
    private int age;
    private String name;
    public void setAge(int age){
        this.age=age;
        // java bydefault passes the object (obj) with the method setAge.
        // age on the left side is the instance variable and on the right is the local variable.
    }
    public void setName(String name){ // Setters
        this.name=name;
    }
    public int getAge(){ //getters
        return age;
    }
    public String getName(){
        return name;
    }

}

public class V9_Encapsulation{
    public static void main(String args[]){
        Human obj=new Human();
        obj.setAge(22);
        obj.setName("Rishika");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}

/*
22
Rishika
 */