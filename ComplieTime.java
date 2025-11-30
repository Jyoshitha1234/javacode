public class ComplieTime {
    public static void main(String[] args) {
        Addition obj=new Addition();
        System.out.println("Addition of two integers:"+obj.add(5,10));
        System.out.println("Addition of two doubles:"+obj.add(5.5,10.5));
        System.out.println("Addition of two floats:"+obj.add(5.5f,10.5f));
        
    }
    
}
class Addition{
    public int add(int n1,int n2){
    return n1+n2;
}
    public double add(double n1,double n2){
        return n1+n2;
    }
    public float add(float n1,float n2){
        return n1+n2;
    }
}
