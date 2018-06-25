import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double l =  Double.parseDouble(scan.nextLine());
        double w =  Double.parseDouble(scan.nextLine());
        double a =  Double.parseDouble(scan.nextLine());

        double sizeIncm = (l*100)*(w*100);
        double wardrobe = (a*100)*(a*100);
        double p =  sizeIncm /10;
        double space =  sizeIncm  - wardrobe - p;
        double dancers = space/(40+7000);

        System.out.println((int)dancers);

    }
}
