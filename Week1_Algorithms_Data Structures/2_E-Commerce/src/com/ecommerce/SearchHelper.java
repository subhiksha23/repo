public class SearchHelper {
    public static int searchLinear(Item[] items, String keyName) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equalsIgnoreCase(keyName)) {
                System.out.println("Product ID: " + items[i].id);
                System.out.println("Category: " + items[i].type);
                return i;
            }
        }
        return -1;
    }

    public static int searchBinary(Item[] items, String keyName) {
        int start = 0;
        int end = items.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int cmp = items[mid].name.compareToIgnoreCase(keyName);
            if (cmp == 0) {
                System.out.println("Product ID: " + items[mid].id);
                System.out.println("Category: " + items[mid].type);
                return mid;
            } else if (cmp < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
