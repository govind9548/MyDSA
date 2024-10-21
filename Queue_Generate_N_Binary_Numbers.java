import java.util.*;

public class BinaryNumberGenerator {

    public static String[] generateN_BinaryNumbers(int n) {
        String[] result = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1")
        for (int i = 0; i < n; i++) {
            result[i] = q.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 10; 
        String[] binaryNumbers = generateN_BinaryNumbers(n);
        for (String binary : binaryNumbers) {
            System.out.println(binary);
        }
    }
}
