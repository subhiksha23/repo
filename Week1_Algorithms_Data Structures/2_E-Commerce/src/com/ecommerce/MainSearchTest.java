import java.util.Arrays;

public class MainSearchTest {
    public static void main(String[] args) {
        Item[] items = {
            new Item(101, "Backpack", "Bags"),
            new Item(102, "Earphones", "Electronics"),
            new Item(103, "Notebook", "Stationery"),
            new Item(104, "Sneakers", "Footwear"),
            new Item(105, "Sunglasses", "Accessories")
        };

        System.out.println("---- Linear Search ----");
        int linearIndex = SearchHelper.searchLinear(items, "Notebook");
        if (linearIndex != -1) {
            System.out.println("Found at index: " + linearIndex);
        } else {
            System.out.println("Item not found in linear search.");
        }

        Arrays.sort(items, new ItemSorter());

        System.out.println("\n---- Binary Search ----");
        int binaryIndex = SearchHelper.searchBinary(items, "Notebook");
        if (binaryIndex != -1) {
            System.out.println("Found at index: " + binaryIndex);
        } else {
            System.out.println("Item not found in binary search.");
        }
    }
}
