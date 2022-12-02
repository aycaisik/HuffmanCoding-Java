public class Huffman {

    public static void printCode(HNode root, String s)
    {

        if (root.left == null && root.right == null && Character.isLetter(root.ch))
        {
            System.out.println(root.ch + ":" + s);
            return;

        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");

    }
}
