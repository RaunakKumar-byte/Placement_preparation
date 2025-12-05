public class countnode{
     static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    
     }

     public static int count_Nodes(Node root){
        if(root==null){
            return 0;
        }
        int lNode=count_Nodes(root.left);
        int rNode=count_Nodes(root.right);

        int tt=lNode+rNode+1;
        return tt;
     }
    public static int sum_Nodes(Node root){
        if(root==null){
            return 0;
        }
        int lNode=sum_Nodes(root.left);
        int rNode=sum_Nodes(root.right);

        int tt=lNode+rNode+root.data;
        return tt;
     }


    public static void main(String[] args){

    Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

    System.out.println(count_Nodes(root));
        System.out.println(sum_Nodes(root));


    }
}