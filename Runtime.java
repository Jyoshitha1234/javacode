public class Runtime{
    public static void main(String[] args) {
        Person e1=new Employee("E123",50000.0f);
        e1.printPerson();
        Person p1=new Person("jyoshitha",20,55.0f);
        p1.printPerson();
        
    }
    
}

class Person{
    String name;
    int age;
    float weight;
    Person(String name,int age,float weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    public void printPerson(){
        System.out.println("name:"+name);
        System.out.println("Age="+age);
        System.out.println("weight="+weight);
    }

}
class Employee extends Person{
    String empid;
    float salary;
    Employee(String empid,float salary){
        super("jyoshitha",20,55.0f);
        this.empid=empid;
        this.salary=salary;
    }
    public void printPerson(){
        System.out.println("name:"+super.name);
        System.out.println("Age="+super.age);
        System.out.println("weight="+super.weight);
        System.out.println("empid="+empid);
        System.out.println("salary="+salary);
    }
}