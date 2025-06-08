import java.util.List;

public class AlgoritmaPencarian {
    public static DataCsv linearSearchByMinecraftId(List<DataCsv> users, String targetId) {
        for (DataCsv user : users) {
            if (user.getEducation().equalsIgnoreCase(targetId)) {
                return user;
            }
        }
        return null;
    }

    public static DataCsv binarySearchByMinecraftId(List<DataCsv> users, String targetId) {
        int left = 0;
        int right = users.size() - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            DataCsv midUser = users.get(mid);
            int cmp = midUser.getEducation().compareToIgnoreCase(targetId);

            if (cmp == 0) {
                return midUser;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }
}
