public class diameter{

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
 static class info{
    int d;
    int h;

    public info(int d, int h) {
        this.d = d;
        this.h = h;
    }
 }
 public static info diameter_approach(Node root){
    if(root==null){
        return new info(0, 0);
    }
    info linfo=diameter_approach(root.left);
    info rinfo=diameter_approach(root.right);

    int lh = linfo.h;
    int rh = rinfo.h;

 // diameter through the root
    int self_diam = lh + rh + 1;

    int final_dm=Math.max(Math.max(linfo.d, rinfo.d),self_diam);
    int final_height=Math.max(lh,rh)+1;

    return new info(final_dm,final_height);
 }
 public static int height(Node root){
    if(root==null){
        return 0;
    }

    int lh=height(root.left);
    int rh=height(root.right);

    int h=Math.max(lh,rh)+1;

    return h;
}
  public static int diameter(Node root){

    if(root==null){
        return 0;
    }

    int ld=diameter(root.left);
    int lh=height(root.left);
    int rd=diameter(root.right);
    int rh=height(root.right);

    int self_diam=lh+rh+1;

    return Math.max(self_diam, Math.max(ld, rd));
  }
    public static void main(String[] args){
   Node root=new Node(1);
    root.left=new Node(2);
    root.right=new Node(3);
    root.left.left=new Node(4);
    root.left.right=new Node(5);
    root.right.left=new Node(6);
    root.right.right=new Node(7);

    System.out.println(height(root));
       
       info result=diameter_approach(root);
         System.out.println("Height of Tree: " + result.h);
        System.out.println("Diameter of Tree: " + result.d);
    }
}