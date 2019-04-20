package Recursive;

/**
 * @program: offer
 * @description: output the nth item of Fibonacci sequence
 * 除了递归想想其他办法
 * @author: Mr.Q
 * @create: 2019-04-18 19:48
 **/
public class Fibonacci {
//    public int Fibonacci(int n) {
//        if (n == 0)
//            return 0;
//        if (n == 1)
//            return 1;
//        if (n == 2)
//            return 2;
//        else
//            return Fibonacci(n-1) + Fibonacci(n-2);
//    }

    public static int fibonacci(int n){
        if(n<2){
            return n;
        }else {
            int[] ans = new int[n];
            ans[0] = 1;
            ans[1] = 2;
            for(int i=2;i<n;i++) {
                ans[i]=ans[i-1]+ans[i-2];
            }
            return ans[n-1];
        }
    }

    public static void main(String[] args){

        System.out.println(fibonacci(2));
    }
}
