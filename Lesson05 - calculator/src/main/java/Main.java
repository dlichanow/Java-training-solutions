import java.math.BigDecimal;
import java.util.Locale;

/**
 * Created by rb22172 on 2016-08-31.
 */
public class Main {

    public static void main(String[] args) {
        AverageSalaryCalculator averageSalaryCalculator = new AverageSalaryCalculator(new Locale("es", "es"));
        BigDecimal averageSalary = averageSalaryCalculator.calculate(".//src//main//resources//salary.csv");
        System.out.println("Average salary is " + averageSalary);


        String fileWithTooFewLines = "salary_empty.csv";
        try {
            averageSalaryCalculator.calculate(fileWithTooFewLines);
        } catch (Exception e) {
            System.out.println("The file " + fileWithTooFewLines + " has too few lines");
        }
    }
}




