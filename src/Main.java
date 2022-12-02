
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//burda txtleri cekicem
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charfreq = {5, 9, 12, 13, 16, 45};
        int n = 6;

        LinkedList<HNode> q = new LinkedList<HNode>();

        for (int i = 0; i < n; i++) {

            HNode node = new HNode();

            node.ch = charArray[i];
            node.data = charfreq[i];

            node.left = null;
            node.right = null;

            // add functions adds
            // the huffman node to the queue.
            q.add(node);
        }
        System.out.println(q);


        HNode root = null;
        while (q.size() > 1) {

            // first min extract.
            HNode x = q.peek();
            q.poll();

            // second min extract.
            HNode y = q.peek();
            q.poll();

            // new node f which is equal
            HNode f = new HNode();

            // to the sum of the frequency of the two nodes
            // assigning values to the f node.
            f.data = x.data + y.data;
            f.ch = '-';

            // first extracted node as left child.
            f.left = x;

            // second extracted node as the right child.
            f.right = y;

            // marking the f node as the root node.
            root = f;

            // add this node to the priority-queue.
            q.add(f);
        }

        // print the codes by traversing the tree
        Huffman.printCode(root, "");
    }
}


