public class IF_ELSE {
    public static void main(String[] args) {
        int age=25;
        if(age>=18){
            System.out.println("adult : drive, vote");
        }
        if(age>13&&age<18){
            System.out.println("teenager");
        }else{
            System.out.println("not adult");
        }
    }
}