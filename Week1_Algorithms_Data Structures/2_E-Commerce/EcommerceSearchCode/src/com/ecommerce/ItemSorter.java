import java.util.Comparator;

public class ItemSorter implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        return a.name.compareToIgnoreCase(b.name);
    }
}