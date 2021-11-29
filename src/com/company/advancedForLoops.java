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


    public static void main(String[] args) {
        eights();
        System.out.println(" ");
        alternate(6);
        System.out.println(" ");
    }
}
