import java.util.*;
public class TypePromotion {
    public static void main(String args[]){
        // char a='a';
        // char b='b';
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(b-a); //print 1 , 98-91=1
        // System.out.println(a); //ye a hi pring hoga bcz type promotion expression ko hi print krta h 

        // short a=5;
        // byte b=25;
        // char c='c';
        // byte bt=(byte)(a+b+c);
        // System.out.println(bt); //gives random existing value


        byte b=5;
        byte a= (byte) (b*2);
        System.out.println(a);
        
    }
    
}
