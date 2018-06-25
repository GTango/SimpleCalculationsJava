import java.util.Scanner;

public class Birthday  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());
        double height = Double.parseDouble(scan.nextLine());
        double percentage = Double.parseDouble(scan.nextLine());

        double volume = length * width * height;
        double generalLiters = volume * 0.001;
        double p = percentage * 0.01;
        double liters =  generalLiters*(1-p);
        System.out.printf("%.3f", liters);


    }

}
