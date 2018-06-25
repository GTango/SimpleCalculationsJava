import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numday = Integer.parseInt(scan.nextLine());
        int numchefs= Integer.parseInt(scan.nextLine());
        int numcake = Integer.parseInt(scan.nextLine());
        int numgrofreti = Integer.parseInt(scan.nextLine());
        int numpancakes = Integer.parseInt(scan.nextLine());

        int cake = numcake * 45;
        double gofreti = numgrofreti * 5.80;
        double pancakes = numpancakes * 3.20;
        double sumDay = (cake + gofreti + pancakes) * numchefs;
        double generalSum = sumDay * numday;
        double endSum = generalSum - (0.125*generalSum);

        System.out.printf("%.2f", endSum);
    }
}