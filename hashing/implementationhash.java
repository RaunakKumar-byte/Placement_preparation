import java.util.*;


public class implementationhash{
      static class HashMap<K, V>{
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;//no of nodes
        private int N;//no of buckets or size of array

        private LinkedList<Node> buckets[];//N

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
      private int hashFunction(K key){
        int hc=key.hashCode();
        return Math.abs(hc) % N;

      }
      private int searchinLL (K key, int bi){
        LinkedList<Node> ll=buckets[bi];

        int di=0;
        for(int i=0;i<ll.size();i++){
            Node node=ll.get(i);
            if(node.key==key){
                return di;
            }
            di++;

        }
        return -1;

      }
      private void rehash(){
        LinkedList<Node> oldBuck[]=buckets;
        buckets=new LinkedList[N*2];
        N=2*N;
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
            for(int j=0;j<ll.size;j++){
                Node node=ll.remove();
                put(node.key,node.value);
            }

        }

        //nodes-> add new bucket
      }

        public void put(K key, V value){//0(lamda)-> o(1)
               int bi=hashFunction(key);
               int di=searchinLL(key);

               if(di != -1){
                Node node=bucket[bi].get(di);
                node.value=value;
               }else{
                bucket[bi].add(new Node(key, value));
                n++;
               }




               double lambda=(double)n/N;
               if(lambda > 2.0){
                rehash();
               }
        }

        public boolean containskey(K key){//o(1)
             int bi=hashFunction(key);
               int di=searchinLL(key);

               if(di != -1){
                return true;
               }else{
                return false;
               }
        }

        public void remove(K key){//o(1)
             int bi=hashFunction(key);
               int di=searchinLL(key);

               if(di != -1){
                Node node=bucket[bi].remove(di);
                n--;
                return node.value;
                
               }else{
                return null;
               }
        }

        public void get(K key){//o(1)
             int bi=hashFunction(key);
               int di=searchinLL(key);

               if(di != -1){
                Node node=bucket[bi].get(di);
                return node.value;
               }else{
                return null;
               }
        }


        public void ArrayList<K> keySet(){
            ArrayList<K> keys=new  ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node: ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

      }


    public static void main(String[] args){

    }
}