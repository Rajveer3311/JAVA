public class Binary_Search
{  Node root;
	Node q;
   public static void main(String[] args) 
   {
   	Binary_Search tree=new Binary_Search();
   	 // insert nodes in binary search tree
    
   	tree.insert_Node(30);
   	tree.insert_Node(25);
   	tree.insert_Node(95);
   	tree.insert_Node(100);
   	tree.insert_Node(3);
   	System.out.print("Inorder traversal data is:->");
   	tree.inorders();

   }
   
   Binary_Search(){
   	root=null;
   }
    void inorders()
   {
   	inOrder(root);
   }
   void insert_Node(int key)
   {
   	root=insert(root,key);
   }
   Node insert(Node root,int key)
   {
   
   	if(root==null)   
   	{   
   		root=new Node(key);
   		root.left=root.right=null;
   		return root;
   	}
   	if(key<root.data)
   	{
   		
   		root.left=insert(root.left,key);
   		
   		
   	}
   	if(key>root.data)
   	{   
   		
   		root.right=insert(root.right,key);
   		
   	}
   	return root;
   }
     void inOrder(Node root)
    {
    	if (root!=null) 
     {
    	inOrder(root.left);
    	System.out.print(root.data+" ");
    	inOrder(root.right);
     }
    }
    Node delete(Node root,int key)
    {
    	if(key<root.data)
    	
    		root.left=delete(root.left,key);
    	
    	else if(key>root.data)
    	
    		root.right=delete(root.right,key);

    	
    	else
    	{
          if(count_Height(root.left)>count_Height(root.right))
          {
             Node p=inOrder(root.left);
             root.data=p.data;
             root.right=delete(root.right,q.data);

          }
          else
          {
          	 Node p=inOrder(root.right);
             root.data=p.data;
             root.left=delete(root.left,q.data);
          }
    	}

    }
     // count number of Height
     int count_Height(Node root)
    {   
    	if (root == null) 
    	{
    		return 0 ;

    	}
    	
    	int x=count_Height(root.left)+1;
    	int y=count_Height(root.right)+1;
        
        return x>y?x:y;
        
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