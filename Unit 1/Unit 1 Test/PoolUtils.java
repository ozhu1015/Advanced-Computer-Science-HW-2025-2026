public class PoolUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (0 <= cleanlinessLevel && cleanlinessLevel <= 10) {
            return cleanlinessLevel;
        } else if (cleanlinessLevel < 0) {
            return 0;
        } else {
            return 10;
        }
    }

    public static String generateUsername(String name) {
        String str = "@";
        String newName = name.toLowerCase();
        int space = newName.indexOf(" ");
        str += newName.substring(0, space);
        str += "_";
        str += newName.substring(space + 1);
        str += "_";
        int randNum = (int) Math.random() * 10 + 1950;
        str += randNum;
        return str;
    }

    public static void cleanPool(Pool pool) {
        int x = pool.getCleanlinessLevel();
        pool.setCleanlinessLevel(x + 2);
    }

    public static String fixName(String name) {
        String trimmedName = name.trim();
        int space = trimmedName.indexOf(" ");
        String str = trimmedName.substring(0, space) + " ";
        String lastName = trimmedName.substring(space);
        lastName = lastName.trim();
        str += lastName;
        return str;
    }
}
