package com.leonious;

public class Main {

    public static void main(String[] args) {

        int count =0;
        for( int i=10; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is Prime Number");
                if(count == 3){
                    System.out.println("Exiting  for Loop!");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n==1){
            return false;
        }
        for(int i=2; i <= n/2; i++ ) {
            System.out.println("Looping" + i);
            if(n % i == 0){
                return false;
            }
            break;
        }
        return true;
    }
}
