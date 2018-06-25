import java.util.Scanner;

public class  CircleAreaAndPerimeter  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = Double.parseDouble(scan.nextLine());
        double area = Math.PI * Math.pow(r,2);
        double perimeter = 2* Math.PI *r;
        System.out.println("Area =" + area);
        System.out.println("Perimeter = " + perimeter);

    }
}
