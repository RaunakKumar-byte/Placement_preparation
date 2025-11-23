    public class largestel{
        
        public static int largest_el(int[] arr){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(max<=arr[i]){
                    max=arr[i];
                }
            }
            return max;
        }


        public static void main (String[] args){
           int arr[]={1,2,4,6,2,8,5};
           int max=largest_el(arr);
           System.out.println(max);
        }
    }