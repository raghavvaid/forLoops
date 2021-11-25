package com.company;

public class forLoops {

    //addEvens

    public static int addEvens(int n){
        int sum = 0;
        for (int x = 2; x<=n; x +=2){
            sum += x;
        }
        return sum;
    }

    //printSquaresBack

    public static void printSquaresBack(int n){
        for (int i=n; i>=1; i--){
            System.out.print(i*i);
            if (i - 1 >= 1) {
                System.out.print(", ");
            }
        }
    }

    //sillyNumbers

    public static void sillyNumbers() {
        for (int n = 0; n <= 2; n++) {
            for (int i = 0; i <= 9; i++) {
                System.out.print(i);
                System.out.print(i);
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //sillyNumbers2

    public static void sillyNumbers2(){
        for (int n = 1; n<= 4; n++){
            for (int i = 9; i>=1; i--){
                for (int x = i; x>=1; x--){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

    //dollarsAndStars

    public static void dollarsAndStars(){
        for (int i = 7; i >=0; i--){
            for (int s = 6; s>=i; s--){
                System.out.print("**");
            }
            for (int x = i; x>=0; x--){
                System.out.print("$");
            }
            for (int n = 0; n<=i; n++){
                System.out.print("**");
            }
            for (int x = i; x>=0; x--){
                System.out.print("$");
            }
            for (int s = 6; s>=i; s--){
                System.out.print("**");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(addEvens(4));
        System.out.println(addEvens(6));
        System.out.println(addEvens(10));
        System.out.println(" ");
        printSquaresBack(13);
        System.out.println(" ");
        System.out.println(" ");
        sillyNumbers();
        System.out.println(" ");
        sillyNumbers2();
        System.out.println(" ");
        dollarsAndStars();
    }
}
