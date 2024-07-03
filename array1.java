// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class arrayUtil {
    
    // print an Array
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    // remove Even elements in an array
    public static int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] ans = new int[oddCount];
        int x = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                ans[x] =  arr[i];
                // System.out.print(ans[x]+" ");
                x++;
            }
        }
        // System.out.println();
        return ans;
    }
    
    
    // reverse an array
    public static void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    
    // findMinimum element 
    public static int findMin(int[] arr){
        if(arr==null || arr.length==0){
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        // int[] result = removeEven(arr);
        // printArray(result);
        // reverseArray(arr, 0, arr.length-1);
        // printArray(arr);
        System.out.println(findMin(arr));
    }
}
