public class BinaryTree {
	private String data;
	private BinaryTree leftChild;
	private BinaryTree rightChild;

	public BinaryTree(String d, BinaryTree left, BinaryTree right){
		this.data = d;
		this.leftChild = left;
		this.rightChild = right;
	}

	public BinaryTree(String d){
		this(d, null, null);
	}

	public boolean hasSameContentAs(BinaryTree other){
		/*
		This is possibly the worst recursive function I have ever written.
		*/
		if (this.leftChild == null && other.leftChild == null && this.rightChild == null && other.rightChild == null && this.data.equals(other.data)){
			return true;
		} else if ((this.leftChild != null && other.leftChild == null) || (this.leftChild == null && other.leftChild != null) || !this.data.equals(other.data)) {
			return false;
		} else if ((this.rightChild != null && other.rightChild == null) || (this.rightChild == null && other.rightChild != null) || !this.data.equals(other.data)) {
			return false;
		} else if (this.leftChild == null && other.leftChild == null && this.data.equals(other.data)) {
			return this.rightChild.hasSameContentAs(other.rightChild);
		} else if (this.rightChild == null && other.rightChild == null && this.data.equals(other.data)) {
			return this.leftChild.hasSameContentAs(other.leftChild);
		} else {
			return this.leftChild.hasSameContentAs(other.leftChild) && this.rightChild.hasSameContentAs(other.rightChild);
		}
	}

	public int numberOfLeaves(){
		if (this.leftChild == null && this.rightChild == null) {
			return 1;
		} else if (this.leftChild == null) {
			return this.rightChild.numberOfLeaves();
		} else if (this.rightChild == null){
			return this.leftChild.numberOfLeaves(); 
		} else {
			return this.leftChild.numberOfLeaves() + this.rightChild.numberOfLeaves();
		}
	}
}