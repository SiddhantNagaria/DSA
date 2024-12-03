import java.util.*;
public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("Prime");
        }else{
            boolean isPrime=true;
            //for BIG numbers
            //for(int i=2; i<=Math.sqrt(n);i++)
            for(int i=2;i<n-1;i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }
        }
    }
}