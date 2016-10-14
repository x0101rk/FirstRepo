package hackerrank;

public class TreeNode {

private TreeNode leftChild, rightChild;
    
    public TreeNode(TreeNode leftChild, TreeNode rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    public TreeNode getLeftChild() {
        return this.leftChild;
    }
    
    public TreeNode getRightChild() {
        return this.rightChild;
    }
}
