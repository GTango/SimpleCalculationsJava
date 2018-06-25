import java.util.Scanner;

public class RadiansToDegrees  {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double rad = Double.parseDouble(scan.nextLine());

        double deg = 180/Math.PI * rad ;

        System.out.println(Math.round(deg));
    }
}
