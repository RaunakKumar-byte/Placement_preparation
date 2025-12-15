class Solution {
    public int ncr(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int) res;
            }
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int col=0;col<=rowIndex;col++){
            list.add(ncr(rowIndex,col));
        }
        return list;
    }
}


  
//another method 

class Solution {
  
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> list=new ArrayList<>();
        long ans=1;
        
         list.add((int)ans);
        for(int i=1;i<=rowIndex;i++){
            ans=ans*(rowIndex-i+1);
            ans=ans/i;
            list.add((int)ans);
        }
        return list;
    }
}