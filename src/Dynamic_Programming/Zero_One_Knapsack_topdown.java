package Dynamic_Programming;

import java.util.Scanner;

public class Zero_One_Knapsack_topdown {
    /*
    1. You are given a number n, representing the count of items.
            2. You are given n numbers, representing the values of n items.
            3. You are given n numbers, representing the weights of n items.
            3. You are given a number "cap", which is the capacity of a bag you've.
            4. You are required to calculate and print the maximum value that can be created in the bag without
    overflowing it's capacity.

    Note -> Each item can be taken 0 or 1 number of times. You are not allowed to put the same item
    again and again.

            Constraints
1 <= n <= 20
            0 <= v1, v2, .. n elements <= 50
            0 < w1, w2, .. n elements <= 10
            0 < cap <= 10

    Format
            Input
    A number n
    v1 v2 .. n number of elements
    w1 w2 .. n number of elements
    A number cap

            Output
    A number representing the maximum value that can be created in the bag without overflowing it's capacity

    Example
    Sample Input

        5
        15 14 10 45 30
        2 5 1 3 4
        7

    Sample Output
          75
*/
    public static int[][] dp ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int values[] = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        int weights[] = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        int capacity=sc.nextInt();
        initalizedp(n+1,capacity+1);
        knapsack(values,weights,capacity,n);

    }
    static void initalizedp(int n,int capacity){
        dp= new int[n][capacity];
        for (int i = 0; i < n; i++) {

            dp[i][0]=0;

        }
        for (int j = 0; j < capacity; j++) {
            dp[0][j]=0;
        }
    }

    static void knapsack(int[] values,int[] weights,int capacity,int size){
//        if(size==0||capacity==0){
//            return 0;
//        }
//        if(dp[size][capacity]!=-1){
//            return dp[size][capacity];
//        }

//        for (int i = 0; i < size + 1; i++) {
//            for (int j = 0; j < capacity + 1; j++) {
//                System.out.print(dp[i][j]);
//            }
//            System.out.println();
//        }
        for (int i = 1; i < size+1; i++) {
            for (int j = 1; j < capacity+1; j++) {
                if(weights[i-1]<=j){
                    dp[i][j]= Math.max(values[i-1]+dp[i-1][j-weights[i-1]],dp[i-1][j]);

                }
                else  dp[i][j]=dp[i-1][j];
            }

        }
        System.out.println(dp[size][capacity]);

    }
}
