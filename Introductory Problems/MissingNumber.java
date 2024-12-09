import java.util.ArrayList;
import java.util.Scanner;

public class MissingNumber {
    static int solve(ArrayList<Integer> a, int N){
        int n = a.size();
        int xor=0;

        for(int i=0;i<n;i++){
            xor ^= a.get(i);
            xor ^= (i+1);
        }
        xor^=(n+1);
        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int a = sc.nextInt();
            arr.add(a);
        }

        System.out.println(solve(arr, n));
    }
}
