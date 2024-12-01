import java.util.*;

public class TypeCasting{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         float a = 25.12f;
        // int b =a; gives error like possible lossy conversion from float to int
        // int b=(int)a;
        // System.out.println(b); gives value 25

        //TypeCasting ko Narrowing ya Explicit Conversion bhi Khte h...

        char ch1='a';
        char ch2='b';
        int number1=ch1;
        int number2=ch2;
        System.out.println(number1);
        System.out.println(number2);


    }

}
