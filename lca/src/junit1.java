import org.junit.Assert;
import org.junit.Test;




class Node {
	int data;
	Node left, right;

	Node(int value) {
		data = value;
		left = right = null;
	}
}


	class junit1 {

		@Test
		public void testbasic_case() {

			BT_NoParentPtr_Solution1 sample = new BT_NoParentPtr_Solution1();
			sample.root = new Node(1);

			Assert.assertEquals("Test one node Tree", sample.findLCA(1, 1), 1);

		}

	}

