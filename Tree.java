import java.util.*;
import java.util.Stack;
public class Tree{
	static Scanner sc=null;
    static Stack<Integer> a=new Stack<>();
    static Stack<Integer> ar=new Stack<>();
	public static void main(String[] args) {
		sc=new Scanner(System.in);
	    
		Node root=createTree();
		System.out.print("Inorder Traversal via recursive way:->");
		inOrder(root);
		System.out.println();
		System.out.print("Preorder Traversal via recursive way:->");
		preOrder(root);
		System.out.println();
		System.out.print("Postorder Traversal via recursive way:->");
		postOrder(root); 
		System.out.println();
		System.out.print("Preorder Traversal via Iterative way:->");
	    ipreorder(root);
	    System.out.println();
	    System.out.print("Printing data acording to height:");
		height_Data(root,2);
		System.out.println();
	    System.out.print("Levelorder Traversal via Iterative way:->");
	    // levelorder(root);
	    System.out.println();
		int y=count_Node(root);
		System.out.println("Nodes of Binary Tree is:"+y);
		int count_nodes_data=count_Node_Data(root);
		System.out.print("Addition of nodes is:"+count_nodes_data);
		System.out.println();
		
	    System.out.println();	
		int z=count_Height(root);
		System.out.println("Height of Binary Tree is:"+(z-1));
	    
		boolean found=Node_To_Root(root,8);
		System.out.println(found);
		System.out.println(a);	
		boolean foun=node_To_Roots(root,8,6);
        System.out.println(foun);
        System.out.println(ar);

		
	}
	// put value one by one in nodes
	static Node createTree()
	{
		Node root=null;
		System.out.print("Enter Data:");
		int data=sc.nextInt();
		if(data == -1)
		{
			return null; 
		}

		root=new Node(data );
		System.out.println("Enter left for:"+data);
		root.left=createTree();   

		System.out.println("Enter right for:"+data);
		root.right=createTree();   
		return root; 

	}

    // inorder traversal using recursion
	static void inOrder(Node root)
    {
    	if (root == null) {
    		return;
    	} 
    	inOrder(root.left);
    	System.out.print(root.data+" ");
    	inOrder(root.right);
    }
     // preorder traversal using recursion
    static void preOrder(Node root)
    {
    	if (root == null) {
    		return;
    	}
    	System.out.print(root.data+" ");
    	preOrder(root.left);
    	preOrder(root.right);
    }
     // postorder traversal using recursion
    static void postOrder(Node root)
    {
    	if (root == null) 
    	{
    		return;
    	}
    	postOrder(root.left);
    	postOrder(root.right);
        System.out.print(root.data+" ");
    }
    // count number of Nodes
     static int count_Node(Node root)
    {   
    	if (root == null) 
    	{
    		return 0 ;

    	}
    	
    	int x=count_Node(root.left);
    	int y=count_Node(root.right);
        
        return x+y+1;
        
    }
    // count nodes data
     static int count_Node_Data(Node root)
    {   
    	if (root == null) 
    	{
    		return 0 ;

    	}
    	
    	int x=count_Node_Data(root.left);
    	int y=count_Node_Data(root.right);
        
        return x+y+root.data;
        
    }
     // count number of Height
     static int count_Height(Node root)
    {   
    	if (root == null) 
    	{
    		return 0 ;

    	}
    	
    	int x=count_Height(root.left)+1;
    	int y=count_Height(root.right)+1;
        
        return x>y?x:y;
        
    }

    // Way of printing preorder via itertative method

    static void ipreorder(Node root)
    {   
        if (root == null)
        {
    	   return;
        }
        Stack<Node> s=new Stack<Node>();     
        s.push(root);
    	while(s.empty() == false)
    	{
           Node point=s.peek();
           System.out.print(point.data +" ");
           s.pop();
           if (point.right!=null) 
           {
           	s.push(point.right);
           }
           if (point.left!=null) 
           {
           	s.push(point.left);

           }
          
           
    	}
    	
    }
    // print data according to height
       static void height_Data(Node root,int key){
       	if (root==null|| key<-1) {
       		return;
       	}
    	if(key==0){
    		System.out.print(root.data+" ");
    	}
    	height_Data(root.left,key-1);
    	height_Data(root.right,key-1);
    }
    // Way of printing level order via itertative method
    // static void levelorder(Node root)
    // {   
    //     if (root == null)
    //     {
    // 	   return;
    //     }
    //     Queue<Node> s=new LinkedList<Node>();  
    //     Stack<Integer> st=new Stack<>(); 
    //     Stack<Integer> sts=new Stack<>();
    //     s.add(root);
    // 	while(s.isEmpty() == false)
    // 	{  
    // 	   	// int siz=s.size();
    // 	   	st.push(s.size());
    // 	   	for(int i=0;i<s.size();i++)
    // 	   	{
             
    //         Node  del=s.remove(); 

    //         if (del.left!=null) 
    //        {
    //        	s.add(del.left);
    //        }
    //         if (del.right!=null) 
    //        {
    //        	s.add(del.right);
    //        }
    //        // System.out.print(del.data +" ");   for printing levelorder data
    //     }  
    //   }   
    //     // boolean xs=st.empty();
    //     // System.out.println(xs);

    //     int p=st.peek();
    // 	int x=p;
    //     sts.push(x);

    //     while(st.empty()==false)
    //     {
    //     	st.pop();
    //     	int z=st.peek();
    //     	int y=sts.peek();
    //     	if(z>=y) 
    //     	{
    //     		sts.push(z);
    //     	}
    //     }
    //     int t=sts.peek();
    //     System.out.println(t);
    // }

    // print node to root data
    
    public static boolean Node_To_Root(Node root,int x){
    	
    	if(root==null)
    		return false;
    	if(root.data==x){
    		a.push(root.data);
    		return true;
    	}
    	boolean t=Node_To_Root(root.left,x);
    	if(t) {
    		a.push(root.data);
    		return true;
    	}
        boolean z=Node_To_Root(root.right,x);
    	if(z) {
    		a.push(root.data);
    		return true;
    	}
    	return false;
    }
     public static boolean Node_To_Root(Node root,int x){
    	
    	if(root==null)
    		return false;
    	if(root.data==x){
    		a.push(root.data);
    		return true;
    	}
    	boolean t=Node_To_Root(root.left,x);
    	if(t) {
    		a.push(root.data);
    		return true;
    	}
        boolean z=Node_To_Root(root.right,x);
    	if(z) {
    		a.push(root.data);
    		return true;
    	}
    	return false;
    }

   
   
}
// class Node for create a node for keeping data and pointing right and left node
class Node
{
	Node left,right;
	int data;
	
	

	public Node(int data)
	{
        this.data=data;
        
	}
	
}
// cd desktop/java/java program 