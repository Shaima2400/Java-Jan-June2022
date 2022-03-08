
package trianglearea;

import java.util.Scanner;

public class TriangleArea {

    
    public static void main(String[] args) {
       float b,h,area;
       Scanner trian= new Scanner(System.in);
       
       System.out.print("Enter the value of Base: ");
       b = trian.nextFloat();
       System.out.print("Enter the value of Height: ");
       h = trian.nextFloat();
       
       area=(b*h)/2;
       System.out.println("Area of triangle is "+area);
       
       
    }
    
}
