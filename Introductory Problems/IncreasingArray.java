import java.util.ArrayList;
import java.util.Scanner;

public class IncreasingArray {
    
    static long solve(ArrayList<Integer> arr){
        int n = arr.size();
        long count = 0;
        for(int i=1;i<n;i++){
            if(arr.get(i)<arr.get(i-1)){
                count += (arr.get(i-1)-arr.get(i));
                arr.set(i,arr.get(i)+(arr.get(i-1)-arr.get(i)));
            } 
            
        }

        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            arr.add(a);
        }

        System.out.println(solve(arr));
    }
}
