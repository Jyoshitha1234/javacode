public class operators {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        // arithmetic operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);
        // relational operators
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
        if(a==b){
            System.out.println("a is equal to b");
        }
        else{
            System.out.println("a is not equal to b");
        }
        // logical operators
        if(a>b && a<b){
            System.out.println("a is greater than b and a is less than b");
        }
        else{
            System.out.println("condition is false");
        }
        if(a>b || a<b){
            System.out.println("condition is true");
        }
        else{
            System.out.println("condition is false");
        }
        //assignment operators
        int j=a;
        System.out.println("value of j is:"+j);
        j+=5;
        System.out.println("value of j after +=5 is:"+j);
        // unary operators
        for(int num=1;num<=5;num++){
            System.out.println("value of num is:"+num);
        }
        for(int num=5;num>=1;num--){
            System.out.println("value of num is:"+num);
        }
        // ternary operators
        int num=(a<b)?a:b;
        System.out.println("value of num is:"+num);


    }
    
}
