package day15;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String valores = "";            
            int cal = 0;
            int count = 0;
            int somador = 1;
            
            do {
            	if (cal == 0) {
					cal = a + (b * somador);
				} else {
					int mult = b * somador;					
					cal += mult;
					
				}
            	somador += somador;
            	count++;
            	
            	if (valores.length() > 0) {
                    valores += " " + cal;
                } else {
                    valores += cal;
                }
            	
			} while (count < n);
            
            System.out.println(valores);
        }
        in.close();
    }
}
