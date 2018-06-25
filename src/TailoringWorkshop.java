import java.util.Scanner;

public class TailoringWorkshop  {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        double brTables =  Double.parseDouble(scan.nextLine());
        double length =  Double.parseDouble(scan.nextLine());
        double width =  Double.parseDouble(scan.nextLine());

        double areaP = brTables*(length+2*0.30)*(width+2*0.30);
        double areaK = brTables*(length/2)*(length/2);
        double dollars = (areaP*7)+(areaK*9);
        double leva =  dollars * 1.85;

        System.out.printf("%.2f USD", dollars );
        System.out.println();
        System.out.printf("%.2f BGN", leva);

    }
}
