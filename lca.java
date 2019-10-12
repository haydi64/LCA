//Hayden Ivatts
//LCA project
//Software Engineering

// Java Program for Lowest Common Ancestor in a Binary Tree
// A O(n) solution to find LCA of two given values n1 and n2
package HaydenPackage;
import java.util.*;



// A Binary Tree node
class Node {
	int data;
	Node left, right;

	Node(int value) {
		data = value;
		left = right = null;
	}



	// Driver code
	public static void main(String[] args)
	{
		BT_NoParentPtr_Solution1 tree = new BT_NoParentPtr_Solution1();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.println("LCA(4, 5): " + tree.findLCA(4,5));
		System.out.println("LCA(4, 6): " + tree.findLCA(4,6));
		System.out.println("LCA(3, 4): " + tree.findLCA(3,4));
		System.out.println("LCA(2, 4): " + tree.findLCA(2,4));

	}
}
