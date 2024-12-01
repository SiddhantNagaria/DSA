import java.util.*;
public class Cost_of_pen_pencil_eraser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil_cost=sc.nextFloat();
        float pen_cost=sc.nextFloat();
        float eraser_cost=sc.nextFloat();
        float total_cost= pencil_cost+pen_cost+eraser_cost;
        System.out.println("The total is:" +total_cost);
        //After 18% GST
        float total_cost_after_GST= (0.18f*total_cost)+total_cost;
        System.out.println("The total is after GST:" +total_cost_after_GST);

        
    }
    
}
