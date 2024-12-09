import java.util.Scanner;

public class Repetitions {
    
    static int solve(String s){
        int max = 1;
        int n = s.length();
        int count = 1;
        for(int i=1;i<n;i++){
            if(s.charAt(i) != s.charAt(i-1)) count =1;
            else count++;
            max = Math.max(max,count);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
    }
}
