import java.util.Scanner;

public class Largest_of_two{
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the A number");
    int A=sc.nextInt();
    System.out.println("Enter the B number");
    int B=sc.nextInt();
    if(A>=B){
        System.out.println("A is greater than B");
    }else{
        System.out.println("B is greater than A");
    }
    }
}
