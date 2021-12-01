package com.company;

public class advancedForLoops {

    public static void eights(){

        for (int i = 8; i > 1; i-=2){

            for (int n = 8; n > i; n-=2){
                System.out.print(" ");
            }
            for (int s = 1; s <= i; s++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


    public static void alternate(int h){
        for (int i = 1; i <= h; i++){

            if (i % 2 == 0) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            else {
                for (int s = 1; s <= i; s++) {
                    System.out.print(s);
                }
            }
            System.out.println(" ");
        }
    }


    public static void isosceles(int n){
        for(int i=1;i<=n; i++){
            for(int x=n; x>=i+1; x--){
                System.out.print(" ");
            }
            for(int z=1; z<=i; z++){
                System.out.print(z);
            }
            for(int y=i-1; y>=1; y--){
                System.out.print(y);
            }
            System.out.println();

        }
    }

    public static void upSideDown(int n, int p){
        for(int i=n-p+1;i>=0; i--){
            for(int s=n-p; s>=i; s--){
                System.out.print(" ");
            }
            for(int y=i-1; y>=0; y--){
                System.out.print(y+p);
            }
            for(int x=1; x<=i-1; x++){
                System.out.print(x+p);
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        eights();
        System.out.println();
        alternate(6);
        System.out.println();
        isosceles(5);
        System.out.println();
        upSideDown(9,5);
        System.out.println();
        upSideDown(8,6);
    }
}