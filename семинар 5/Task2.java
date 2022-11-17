import java.util.ArrayList;
import java.util.List;

class Task2{

	public static void main(String[] args) {
		Tree2 tree = new Tree2();
		
		tree.root = new Node2(1);
        tree.root.nodes.add(new Node2(2));
        tree.root.nodes.add(new Node2(3));

        tree.root.nodes.get(0).nodes.add(new Node2(4));
        tree.root.nodes.get(1).nodes.add(new Node2(5));
        tree.root.nodes.get(1).nodes.add(new Node2(6));

        tree.root.nodes.get(0).nodes.get(0).nodes.add(new Node2(7));
        tree.root.nodes.get(0).nodes.get(0).nodes.add(new Node2(8));
        tree.root.nodes.get(0).nodes.get(0).nodes.add(new Node2(9));
        tree.root.nodes.get(1).nodes.get(1).nodes.add(new Node2(11));
        tree.root.nodes.get(1).nodes.get(1).nodes.add(new Node2(20));

		
		
		System.out.println("Обход:");
		tree.travel(tree.root);
	}
}

class Node2{
    int value;
    List<Node2> nodes;
    
    public Node2(int value){
        this.value = value;
        nodes = new ArrayList<Node2>();
    }
}

class Tree2{
    Node2 root;
    
    Tree2(int value){
        root = new Node2(value);
    }
    
    Tree2(){
        root = null;
    }
    
    public void travel(Node2 node){
        if(node != null){
            for (int i = 0; i < node.nodes.size(); i++) {
                travel(node.nodes.get(i));
            }
            System.out.println(node.value);
        }
    }
}
