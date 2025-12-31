public class pallindrome{
       

       public static boolean pallindrome(String str,int start, int end){
        int n=str.length();
        if(start>=end){
            return true;
        }

        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        return pallindrome(str, start+1, end-1);
       }


    public static void main(String[] args){
      String word = "madam";

        if (pallindrome(word, 0, word.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }  
    }
}