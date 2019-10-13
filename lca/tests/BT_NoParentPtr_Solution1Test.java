import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class BT_NoParentPtr_Solution1Test {

    @Test
    public void treeWithOneNode() {
        BT_NoParentPtr_Solution1 sample = new BT_NoParentPtr_Solution1();
        sample.root = new Node(1);
        Assert.assertEquals("Test one node Tree",1 , sample.findLCA(1, 1));
    }
    @Test
    public void testSimpleTree() {
        BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        Assert.assertEquals(2, tree.findLCA(4,5));
    }

    @Test
    public void testSimpleTreeSameNodeIsLCA() {
        BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        Assert.assertEquals(2, tree.findLCA(2,4));
    }
}