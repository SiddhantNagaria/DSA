import java.util.Scanner;

public class ElseIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("You are adult");
        }
        else if(age>=13&&age<18){
            System.out.println("You are teenager");
        }
        else{
            System.out.println("You are kid");
        }
        }        
    }

