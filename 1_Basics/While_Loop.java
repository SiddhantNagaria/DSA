import java.util.*;
public class While_Loop {
    public static void main(String[] args) {

        //While Loop --->
        // int counter=1;
        // while(counter<=500){
        //     System.out.print(counter+" "); 
        //     counter++;
        // }
        

        //Print number from 1 to n --->
        // Scanner sc=new Scanner(System.in);
        // int range =sc.nextInt();
        // int counter=1;
        // while(counter<=range){
        //      System.out.print(counter+" ");
        //      counter++;
        // }
        // System.out.println();


        //Sum of first n natural number ---->
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int sum=0;
        // int i=1;
        // while(i<=n){
            // sum=sum+i;
            // i++;
        // }
        // System.out.println("Sum of first "+n+" natural number is "+sum);
    
        
        //print Square pattern ---->
        // int line=1;
        // while (line<=4){
        //     System.out.println("****");
        //     line++;

        // } 
         

        //Print Reverse The Number ---->
        // int n=19034;
        // while (n>0) {
            // int lastDigit=n%10;
            // System.out.print(lastDigit + "");
            // n=n/10;
            // 
        // }
        // System.out.println();


        //Reverse The Given Number --->
        int rev=0;
        int n=10899;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10) + lastDigit;
            n=n/10;
        }
        System.out.println(rev);

        
        }

    }   