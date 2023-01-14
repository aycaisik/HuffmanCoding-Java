
import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {


        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charfreq = {5, 9, 12, 13, 16, 45};
        int n = 6;
        LinkedList<HNode> llist = new LinkedList<HNode>();

        for (int i = 0; i < n; i++) {

            HNode node = new HNode();

            node.ch = charArray[i];
            node.data = charfreq[i];

            node.left = null;
            node.right = null;

            llist.add(node);
        }



        HNode root = null;
        while (llist.size() > 1) {

            HNode x = llist.peek();
            llist.poll(); //nodeye eşitledikten sonra sildik

            HNode y = llist.peek();
            llist.poll();

            HNode f = new HNode();

            f.data = x.data + y.data; // dataların toplamına eşitledik
            f.ch = '-';


            f.left = x;
            f.right = y;

            root = f;
            llist.add(f);
        }

        Huffman.printCode(root, "");
    }
}


