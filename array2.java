public class arrayUtil{
    
    // find the second largest element of an array despite of duplicates
    public static int secondMax(int arr[]){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
            // }else if(arr[i]>secondMax && arr[i]<max){
                secondMax = arr[i];
            }
        }
        
        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second maximum value");
        }
        
        return secondMax;
    }
    public static void main(String[] args) {
        // int arr[] = {13,34,2,31,34,33,1};
        // int arr[] = {1};
        // int arr[] = {-1,-2,-5};
        // int arr[] = {};
        int arr[] = {1,1,1,1,1};
        int x = secondMax(arr);
        System.out.println(x);
    }
}





// move all the zeroes at the end of array
public class arrayUtil{
    
    public static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    
    public static int[] moveZeros(int[] arr){
        int n = arr.length;
        if(n==0){
            System.out.println("Empty array");
        }
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        return arr;
    }
    
    public static void main(String[] args) {
        // int arr[] = {1,2,0,6,0,3,0,8,0,0,4,5,6,};
        // int arr[] = {1, 2, 3, 4, 5};
        // int arr[] =  {0, 0, 0, 0, 0};
        // int arr[] =  {0, 0, 1, 2, 3};
        // int arr[] =  {0};
        // int arr[] =  {1};
        int arr[] =  {};
        printArray(arr);
        int ans[] = moveZeros(arr);
        printArray(ans);
        
    }
}
