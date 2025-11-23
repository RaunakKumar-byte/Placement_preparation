public class preorder{
   
   static class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
   }
    static class binary_tree{
        static int idx=-1;

        public static Node BuildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);
            newNode.right=BuildTree(nodes);

            return newNode;
        }
    
   }
   public static void preorder(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.data+" ");
    preorder(root.left);
    preorder(root.right);

   }
   public static void inorder(Node root){
    if(root==null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);

   }
   public static void postorder(Node root){
    if(root==null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
   }
    public static void main(String[] args){
       int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       binary_tree tree=new binary_tree();
       Node root=tree.BuildTree(nodes);
       
       preorder(root);
       System.out.println();
       inorder(root);
        System.out.println();
        postorder(root);
    }
}