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

    @Test
    public void testComplexTree() {
        BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.right.left = new Node(8);
        tree.root.right.right.left.left = new Node(9);
        tree.root.right.right.left.left.right = new Node(10);
        tree.root.right.right.left.left.right.left = new Node(11);
        tree.root.right.right.left.right = new Node(12);

        Assert.assertEquals(8, tree.findLCA(11,12));
    }

    @Test
    public void testLongOneBranchedTree() {
        BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
        tree.root = new Node(1);
        tree.root.right = new Node(2);
        tree.root.right.right = new Node(3);
        tree.root.right.right.right = new Node(4);
        tree.root.right.right.right.right = new Node(5);
        tree.root.right.right.right.right.right = new Node(6);
        tree.root.right.right.right.right.right.right = new Node(7);
        tree.root.right.right.right.right.right.right.right = new Node(8);
        tree.root.right.right.right.right.right.right.right.right = new Node(9);
        tree.root.right.right.right.right.right.right.right.right.right = new Node(10);
        tree.root.right.right.right.right.right.right.right.right.right.right = new Node(11);
        tree.root.right.right.right.right.right.right.right.right.right.right.right = new Node(12);
        Assert.assertEquals(3,tree.findLCA(3,12));
    }

    @Test
    public void testIncorrectTreeCreation() {
        BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
        tree.root = new Node(1);
        tree.root.right = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left.right = new Node(6);
        Assert.assertEquals(-1,tree.findLCA(5,6));
    }

    @Test
    public void testNodesSameValues() {
        BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
        tree.root = new Node(1);
        tree.root.right = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(6);
        tree.root.left.right = new Node(5);
        tree.root.left.left = new Node(6);
        Assert.assertEquals(1,tree.findLCA(6,6));

    }

}