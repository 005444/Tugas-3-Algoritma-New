
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        String filePath = "train.csv";
        List<DataCsv> users = DataLoader.loadData(filePath);

        if (users.isEmpty()) {
            System.out.println("Data tidak ditemukan atau gagal dimuat.");
            return;
        }

        System.out.println("Total data dimuat: " + users.size());


        AlgoritmaPengurutan.bubbleSortByMinecraftId(users);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nMasukkan Minecraft ID untuk dicari (binary search): ");
        String targetId = scanner.nextLine();
        DataCsv found = AlgoritmaPencarian.binarySearchByMinecraftId(users, targetId);

        if (found != null) {
            System.out.println("Data ditemukan: " + found);
        } else {
            System.out.println("Data dengan Minecraft ID '" + targetId + "' tidak ditemukan.");
        }

        AlgoritmaPengurutan.bubbleSortByAge(users);
        System.out.println("\nData setelah diurutkan berdasarkan usia (Bubble Short):");
        users.stream().limit(5).forEach(System.out::println);

        scanner.close();
    }
}
