import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Prog42 {
    public static void main(String[] args) {
        Comparator<String> lengthComparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                int length = Integer.compare(s1.length(), s2.length());
                 if (length == 0) {
                return s1.compareTo(s2);
                }
                return length;
            }
        };
        Set<String> tree = new TreeSet<>(lengthComparator);
        tree.add("apple");
        tree.add("banana");
        tree.add("dragon fruit");
        tree.add("kiwi");
        tree.add("grape");
        tree.add("orange");
        tree.add("mango");
        System.out.println("TreeSet sorted by length:");
        for (String fruit : tree) {
            System.out.println(fruit);
        }
    }
}

