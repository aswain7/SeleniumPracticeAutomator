package org.example;

public class Reverse_a_number {
    public static void main(String[] args) {
        int a =349;
        int rev=0;
        int temp=a;
        while(temp!=0){
            rev=(rev*10)+(temp%10);
            temp=temp/10;

        }
        System.out.println(rev);

    }

}
