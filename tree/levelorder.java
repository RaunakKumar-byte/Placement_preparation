public class levelorder{

     static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
     }

     static class binary_tree{

        static int idx=-1;
        public static  Node BuildTree(int[] nodes){
            idx++;
          if(nodes[idx]==-1){
            return null;
          }
          Node newNode=new Node(nodes[idx]);
          newNode.left=BuildTree(nodes);
          newNode.right=BuildTree(nodes);
        }
        return newNode;
     }

    public static void main(String[] args){

          int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
          binary_tree tree= new binary_tree();
          Node root=tree.BuildTree(nodes);

    }
}