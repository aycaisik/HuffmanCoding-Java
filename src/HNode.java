
import java.util.Comparator;

public class HNode {
    int data;
    char ch;
    HNode left;
    HNode right;
}
class MyComparator implements Comparator<HNode> {
    public int compare(HNode x, HNode y) {

        return x.data - y.data;
    }
}
