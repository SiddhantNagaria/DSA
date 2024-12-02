import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a :");
        int a = scanner.nextInt();
        System.out.print("enter b :");
        int b = scanner.nextInt();
        System.out.print("enter operator :");
        char operator=scanner.next().charAt(0);
        switch (operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Wrong Operator");

        }


       }
    
}
