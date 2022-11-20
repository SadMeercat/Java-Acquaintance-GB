class Task1
{
	public static void main(String[] args) {
		Tree tree = new Tree();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		tree.root.left.left = new Node(4);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(6);
		
		tree.root.left.left.left = new Node(7);
		tree.root.left.left.right = new Node(9);
		tree.root.right.right.left = new Node(11);
		tree.root.right.right.right = new Node(20);
		
		System.out.println("Обход:");
		tree.travel(tree.root);
	}
}

class Node{
    int value;
    Node left;
    Node right;
    
    public Node(int value){
        this.value = value;
        left = right = null;
    }
}

class Tree{
    Node root;
    
    Tree(int value){
        root = new Node(value);
    }
    
    Tree(){
        root = null;
    }
    
    public void travel(Node node){
        if(node != null){
            travel(node.left);
            travel(node.right);
            System.out.println(node.value);
        }
    }
}

