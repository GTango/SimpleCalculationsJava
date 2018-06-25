import java.util.Scanner;

public class SquareArea  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = Double.parseDouble(scan.nextLine());
        double square = a*a;
        System.out.println(square);
    }
}

