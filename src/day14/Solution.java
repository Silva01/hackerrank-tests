package day14;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++) {                
                System.out.println(String.format("%-14s %03d ", sc.next(), sc.nextInt()));
            }
            System.out.println("================================");

    }
}

