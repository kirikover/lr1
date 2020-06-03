package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int n=1;n<=100;n++){
            if(isPrime(n)){
                System.out.println(n);
            }
        }
    }
    public static boolean isPrime(int n){
        for(int i=2; i <(n-1);i++){
            if(n%i==0){
               return false;
            }
        }
        return true;
    }
}
