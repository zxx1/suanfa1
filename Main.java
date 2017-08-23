package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int l1 = s1.length();
            int l2 = s2.length();
            int result = 0;
            int[][] dp = new int[l1 + 1][l2 + 1];
            for (int i = 1; i <= l1; i++){
                for (int j = 1; j <= l2; j++){
                    if (s1.charAt(i - 1) == s1.charAt(j - 1)){////表示索引值为i-1对应的值，
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                        result = Math.max(dp[i][j], result);
                    }
                    else{
                        dp[i][j] = 0;
                    }
                }
            }
            System.out.println(result);
        }
        sc.close();
    }
}

