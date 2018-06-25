import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyWhiskey = Double.parseDouble(scan.nextLine());
        double quantityBeer= Double.parseDouble(scan.nextLine());
        double quantityWine = Double.parseDouble(scan.nextLine());
        double quantityBrandy = Double.parseDouble(scan.nextLine());
        double quantityWhiskey = Double.parseDouble(scan.nextLine());

        double moneyBrandy =  moneyWhiskey/2;
        double moneyWine = moneyBrandy-(0.4*moneyBrandy);
        double moneyBeer= moneyBrandy-(0.8*moneyBrandy);

        double sumBrandy = quantityBrandy*moneyBrandy;
        double sumWine = quantityWine*moneyWine;
        double sumBeer = quantityBeer*moneyBeer;
        double sumWiskey = quantityWhiskey* moneyWhiskey;

        double allSum = sumBrandy + sumBeer + sumWine + sumWiskey;

        System.out.printf("%.2f" , allSum);

    }
}
