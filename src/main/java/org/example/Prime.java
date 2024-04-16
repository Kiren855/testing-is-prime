package org.example;

public class Prime {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        else if(n == 2) return true;
        else {
            for(int i = 2; i< n;i++){
                if(n % 2 == 0) return false;
            }
        }
        return true;

    }
}
