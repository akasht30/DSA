package UserBinaryT;



public class MyTree {

	class Node{
		Object data;
		Node left,right;

		Node(Object data){
			this.data=data;
		}
	}
	Node root;
	public boolean add(Comparable data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
			return true;
		}
		Node temp=root;
		while(true)
		{
			if(data.compareTo(temp.data)>0) {
				if(temp.right==null) {
					temp.right=n; 
				}
				else {
					temp=temp.right;
					return true;
				}
			}
			else if(data.compareTo(temp.data)<0){
				if(temp.left==null) {
					temp.left=n;
					
				}
				else {
					temp=temp.left;
					return true;
				}		
			}
			else 
				return false;
		}
	}
	
	public void display() {
		
		System.out.println("Inorder");
		inOrder(root);
		System.out.println("\nPre Order");
		preOrder(root);
		System.out.println("\nPostorder");
		postOrder(root);
	}
	
	private void inOrder(Node rt) {
		if(rt==null) {
			return;
		}
		inOrder(rt.left);
		System.out.print(rt.data+" ");
		inOrder(rt.right);
		
	}
	
	private void preOrder(Node rt) {
		if(rt==null) {
			return;
		}
		System.out.print(rt.data+" ");
		preOrder(rt.left);
		preOrder(rt.right);
		
		
		
	}
	
	private void postOrder(Node rt) {
		if(rt==null) {
			return;
		}
		postOrder(rt.left);
		postOrder(rt.right);
		System.out.print(rt.data+" ");
		
		
	}
	
}

