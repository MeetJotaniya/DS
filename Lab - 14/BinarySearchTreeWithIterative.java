class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }
}





class BinarySearchTree{
    Node root;

    BinarySearchTree(){
        this.root = null;
    }

    void insert(int data){
        this.root = insertRecord(this.root, data);
    }

    private Node insertRecord(Node root, int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return root;
        }

        Node current = root;

        while(true){
            if(current.data == data) return root;
            else if(current.data > data){
                if(current.left == null){
                    current.left = newNode;
                    return root;
                }
                current = current.left;
            }
            else{
                if(current.right == null){
                    current.right = newNode;
                    return root;
                }
                current = current.right;
            }

        }
    }

}








public class BinarySearchTreeWithIterative{

    public static void printPre(Node current){
		System.out.print(current.data + " ");
		if(current.left != null) printPre(current.left);
		if(current.right != null) printPre(current.right);
	}

	public static void printPost(Node current){
		if(current.left != null) printPost(current.left);
		if(current.right != null) printPost(current.right);
		System.out.print(current.data + " ");
	}

	public static void printIn(Node current){
		if(current.left != null) printIn(current.left);
		System.out.print(current.data + " ");
		if(current.right != null) printIn(current.right);
	}

    public static void main(String[] Args){
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(4);
        bst.insert(20);
        bst.insert(1);
        bst.insert(15);
        bst.insert(5);
        bst.insert(30);
        bst.insert(3);
        printIn(bst.root);
    }
}