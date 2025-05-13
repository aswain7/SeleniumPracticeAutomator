package org.example.Seleniumpractice;

public class reverse_a_String {
    public static void main(String[] args) {
        String name="Aman"; //namA
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
}
