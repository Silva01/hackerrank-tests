package day11;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array2D {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(calcular(arr));
        scanner.close();
    }

    private static int calcular(int[][] matriz) {
        int max = -100;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int linha1 = matriz[i][j] + matriz[i][j + 1] + matriz[i][j + 2];
                int linha2 = matriz[i + 1][j + 1];
                int linha3 = matriz[i + 2][j] + matriz[i + 2][j + 1] + matriz[i + 2][j + 2];
                int sum = linha1 + linha2 + linha3;

                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    private static List<Integer[]> criarConjuntos(int[][] valores) {
        List<Integer[]> conjuntos = new ArrayList<>();
        int cont =0;

        for (int i = 0; i < valores.length; i++) {

        }


        return conjuntos;
    }
}
