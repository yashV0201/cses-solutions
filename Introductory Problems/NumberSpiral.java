import java.util.ArrayList;
import java.util.Scanner;


public class NumberSpiral {
    
    static void solve(ArrayList<ArrayList<Long>> arr){
        for(ArrayList<Long> p : arr){
            long y = p.get(0);
            long x = p.get(1);
            
            long res = 1;
            if(y>=x){
                if(y%2==0)res = (y*y)-x+1;
                else res = ((y-1)*(y-1))+x;
            }
            else{
                if(x%2==0) res = ((x-1)*(x-1))+y;
                else res = (x*x)-y+1;
            }

            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        ArrayList<ArrayList<Long>> arr = new ArrayList<>();
        for(long i =0;i<t;i++){
            long y = sc.nextLong();
            long x = sc.nextLong();
            ArrayList<Long> tem = new ArrayList<>();
            tem.add(y);
            tem.add(x);
            arr.add(tem);
        }

        solve(arr);
    }
}
