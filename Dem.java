public class Dem {
    public static void main(String[] args) {
      person p1= new person();
      p1.printInfo();
        
    }
    
}

class person{
    String name;
    int age;
    int height;
    int gender;
    long phoneNumber;
    String email;
    Address address;

    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Gender:"+gender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Email: "+email);
        System.out.println(("Address:"+address.state));
    
    }
}
class Address{
    String doornumber;
    String streetname;
    String city;
    String state;
    String country;

}
