package datastr;

public class BinarySearchTree {
/* Author : Vijayaragavan
 * Date	  : 15-03-2014
 * */
	int data;
	BinarySearchTree leftNode;
	BinarySearchTree rightNode;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinarySearchTree getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(BinarySearchTree leftNode) {
		this.leftNode = leftNode;
	}
	public BinarySearchTree getRightNode() {
		return rightNode;
	}
	public void setRightNode(BinarySearchTree rightNode) {
		this.rightNode = rightNode;
	}
	public BinarySearchTree(int data) {
		super();
		this.data = data;
	}
	public BinarySearchTree search(BinarySearchTree root, int data){
		BinarySearchTree currNode = root;
		if (currNode==null) return null;
		else{
			if(currNode.getData() < data) {
			return search(currNode.getLeftNode(), data);
			}
			else if(currNode.data == data) return root;
			else return search(currNode.getRightNode(),data); 
		}
		
		//return currNode;
	}
	public BinarySearchTree searchNonrecursive(BinarySearchTree root, int data) {
		BinarySearchTree currNode = root;
		
		if(currNode == null ) return null;
		else {
			while(currNode!=null) {
				if(currNode.getData() > data) currNode=currNode.getLeftNode();
				else if(currNode.getData() == data) return currNode;
				else if(currNode.getData() < data ) currNode= currNode.getRightNode(); 
			}
		return null;
		}
	}
	public BinarySearchTree findMinNonRecurse(BinarySearchTree root) {
		BinarySearchTree currNode = root;
		while(currNode.getLeftNode()!=null) currNode = currNode.getLeftNode();
		
		return currNode;
		
	}
	
	public BinarySearchTree findMin (BinarySearchTree root) {
		 BinarySearchTree currNode = root;
		 if(currNode ==null )return null;
		 if(currNode.getLeftNode()!=null) return findMin(currNode.getLeftNode());
		 else
			 return currNode;
	}
	
	public BinarySearchTree findMax (BinarySearchTree rootNode) {
		if(rootNode==null) return null;
		else if(rootNode.getRightNode()!=null) return findMax(rootNode.getRightNode());
		else 
			return rootNode;
	}
	public BinarySearchTree findMaxNonRecurse(BinarySearchTree rootNode) {
		if(rootNode ==null) return null;
		while(rootNode.getRightNode()!=null) rootNode = rootNode.getRightNode();
		return rootNode;
	}
	public BinarySearchTree inOrderPredecessor (BinarySearchTree element) {
		if (element ==null ) return null;
		if(element.getLeftNode()!=null) {
			return findMax(element.getLeftNode());
		}else
			return null;/*To be changed to parent of the element later*/
	}
	public BinarySearchTree inOrderSucessor (BinarySearchTree element) {
		if (element ==null ) return null;
		if(element.getRightNode()!=null) {
			return findMin(element.getRightNode());
		}else
			return null; /*To be changed to parent of the element later*/
	}
	public BinarySearchTree insert(int data, BinarySearchTree root) {
		if(root ==null) {
			root = new BinarySearchTree(data);
			root.setRightNode(null);
			root.setLeftNode(null);
			return root;
		}
		else {
			if (data <root.getData()) {
				return insert(data, root.getLeftNode());
			}
			else if(data>root.getData())  return insert(data,root.getRightNode());
		}
		return root;
	}
	
}
