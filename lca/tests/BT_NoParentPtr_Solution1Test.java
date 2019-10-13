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

}