
// palindrome string
class palindromeString{
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        String s = "madam";
        int n = s.length();
        char charArray[] = s.toCharArray();
        int start = 0;
        int end = n-1;
        
        while(start<end){
            if(charArray[start]!=charArray[end]){
                System.out.println("Not a Palindrome String");
            }
            start++;
            end--;
        }
        System.out.println("Yes, Palindrome String");
    }
}
