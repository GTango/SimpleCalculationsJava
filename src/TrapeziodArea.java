import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        double area = 0.5*(a + b) * h;
        System.out.println(area);

    }
}