import java.util.List;

public class AlgoritmaPengurutan {
    public static void bubbleSortByAge(List<DataCsv> users) {
        int n = users.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (users.get(j).getApplicantIncome() > users.get(j + 1).getApplicantIncome()) {
                    DataCsv temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);
                }
            }
        }
    }

    // Bubble Sort by Minecraft ID
    public static void bubbleSortByMinecraftId(List<DataCsv> users) {
        int n = users.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String id1 = users.get(j).getEducation().toLowerCase();
                String id2 = users.get(j + 1).getEducation().toLowerCase();
                if (id1.compareTo(id2) > 0) {
                    DataCsv temp = users.get(j);
                    users.set(j, users.get(j + 1));
                    users.set(j + 1, temp);
                }
            }
        }
    }
}
