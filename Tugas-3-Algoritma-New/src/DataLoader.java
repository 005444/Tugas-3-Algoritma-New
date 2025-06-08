import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DataLoader {
    public static List<DataCsv> loadData(String filename) {
        List<DataCsv> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine(); // Skip header

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                if (parts.length < 13) continue;

                try {
                    String loanId = parts[0].trim();
                    String gender = parts[1].trim();
                    String married = parts[2].trim();
                    String dependents = parts[3].trim();
                    String education = parts[4].trim();
                    String selfEmployed = parts[5].trim();
                    double applicantIncome = (double) Double.parseDouble(parts[6].trim());
                    double coapplicantIncome = (double) Double.parseDouble(parts[7].trim());
                    double loanAmount = (double) Double.parseDouble(parts[8].trim());
                    double loanAmountTerm = (double) Double.parseDouble(parts[9].trim());
                    String creditHistory = parts[10].trim();
                    String propertyArea = parts[11].trim();
                    String loanStatus = parts[12].trim();

                    users.add(new DataCsv(loanId, gender, married, dependents, education, selfEmployed, applicantIncome, coapplicantIncome, loanAmount, loanAmountTerm, creditHistory, propertyArea, loanStatus));
                } catch (NumberFormatException e) {
                    System.err.println("Skipping invalid row: " + line);
                }
            }

        } catch (IOException e) {
            System.err.println("Failed to read the file: " + e.getMessage());
        }

        return users;
    }
}
