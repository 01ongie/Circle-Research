package app;
import za.ac.wsu.s220111235.Circle;
/**
 * @versin 0.1
 * @author O. NGQOBE 220111235
 */
public class CircleApp {
    /**
     * @param args the command line arguments 
     */
    public static void main(string[]  args) {
   //Circle object one
   Circle circle1 = new Circle((float) 1.5, 6, 3);
   System.out.println(circle1.toString());
   System.out.println("Area: " + circle1.calculateArea() + "\n Circumference: " + 
        circle1.calculateCircumference() + "\nDiameter: " + circle1.calculateDiameter()+ "\n");
   
   //Circle object two 
   Circle circle2 = new Circle((float) 9.0, 8, 7);
   System.out.println(circle2.toString());
   System.out.println("Area : " + circle2.calculateArea() + "\n Circumference: " + 
        circle2.calculateCircumference() + "\nDiameter: " + circle2.calculateDiameter()+ "\n");
   
   //Circle object three
   Circle circle3 = new Circle((float) -5.5, 10, 4);
   System.out.println(circle3.toString());
   System.out.println("Area : " + circle3.calculateArea() + "\n Circumference: " + 
        circle3.calculateCircumference() + "\nDiameter: " + circle3.calculateDiameter()+ "\n");
    }
}