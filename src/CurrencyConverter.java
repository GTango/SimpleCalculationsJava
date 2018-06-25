import java.util.Scanner;

public class CurrencyConverter  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double v1 = 0.00;
        double v2 = 0.00;
        v1 = scan.nextDouble();
        scan.nextLine();
        String c1 = scan.nextLine();
        String c2 = scan.nextLine();

        if (c1.equals("BGN") && c2.equals("USD")) {

            v2  = v1 / 1.79549;
            System.out.printf("%.2f USD", v2);
            ;
        } else if (c1.equals("USD") && c2.equals("BGN")) {

            v2 = v1 * 1.79549;
            System.out.printf("%.2f BGN", v2);

        } else if (c1.equals("BGN") && c2.equals("GBP")) {

            v2 = v1 / 2.53405;
            System.out.printf("%.2f GBP", v2);

        } else if (c1.equals("GBP") && c2.equals("BGN")) {

            v2 = v1 * 2.53405;
            System.out.printf("%.2f BGN", v2);

        }

        else if (c1.equals("BGN") && c2.equals("EUR")) {

            v2 = v1 / 1.95583;
            System.out.printf("%.2f EUR", v2);
        }

        else if (c1.equals("EUR") && c2.equals("BGN")) {

            v2 = v1 * 1.95583;
            System.out.printf("%.2f BGN", v2);
        }

        else if (c1.equals("EUR") && c2.equals("USD")) {

            v2 = v1 * (1.95583/1.79549);
            System.out.printf("%.2f USD", v2);
        }
        else if (c1.equals("USD") && c2.equals("EUR")) {

            v2 = v1 / (1.95583/1.79549);
            System.out.printf("%.2f EUR", v2);

        }

        else if (c1.equals("USD") && c2.equals("GBP")) {

            v2 = v1 * (2.53405/1.79549);
            System.out.printf("%.2f GBP", v2);
        }

        else if (c1.equals("GBP") && c2.equals("USD")) {

            v2 = v1 * (2.53405/1.79549);
            System.out.printf("%.2f USD", v2);
        }

        else if (c1.equals("GBP") && c2.equals("EUR")) {

            v2 = v1 * (2.53405/1.95583);
            System.out.printf("%.2f EUR", v2);
        }
        else if (c1.equals("EUR") && c2.equals("GBP")) {

            v2 = v1 / (2.53405/1.95583);
            System.out.printf("%.2f GBP", v2);
        }

        else {
            System.out.println("Error");
        }
        scan.close();
    }

}