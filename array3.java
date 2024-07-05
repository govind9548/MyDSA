// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class arrayUtil{
    // print an Array
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    // Resize an array programm
    public static int[] resize(int arr[], int capacity){
        int[] temp = new int[capacity];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }
    
    // Given an array of n-1 distinct numbers in the range of 1 to n.Find the missing no. in it.
    public static int missingNo(int arr[]){
        int n = arr.length+1;
        int sum = (n*(n+1))/2;
        for(int i=0; i<arr.length; i++){
            sum-=arr[i];  
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        printArray(arr);
        System.out.println("before resize " + arr.length);        
        // arr = resize(arr, arr.length*2);
        // printArray(arr);
        // System.out.println("after resize " + arr.length);
        System.out.println(missingNo(arr));
    }
}
