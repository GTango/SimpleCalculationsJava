import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DaysAfterBirth {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate d = LocalDate.parse(data, format);
        LocalDate dPlus = d.plusDays(999);
        System.out.println(dPlus.format(format));
    }
}
