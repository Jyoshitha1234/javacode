public class Switch {
    public static void main(String[] args) {
        int day = 4;
        if(day < 1|| day>7);
        {
            System.out.println("your input value is not in range (1-7)");
        }

         switch(day){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("friday");
            break;
            case 6:
            System.out.println("saturday");
            break;
            case 7:
            System.out.println("sunday");
            break;
            default:
            System.out.println("invalid number");
        }
    }

    }
    
