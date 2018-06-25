import java.util.Scanner;

public class RectangleArea2D  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x1 = Double.parseDouble(scan.nextLine());
        double y1= Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double a= Math.max(x1,x2)- Math.min(x2,x1);
        double b= Math.max(y1,y2)- Math.min(y2,y1);

        double area =  a * b;
        double perimeter = 2*(a+b);

        System.out.println(area);
        System.out.println(perimeter);


    }
}
