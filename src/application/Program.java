package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Matrix order: ");
		int n = scan.nextInt();
	
		int[][] mat = new int[n][n];
		
		int neg = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				System.out.println("Insira o valor da posição " + i + "" + j);
				mat[i][j] = scan.nextInt();
				
				if(mat[i][j] < 0) {
					neg++;
				}
			}
		}
		
		System.out.println("Main Diagonal: ");
		for(int i = 0; i < n; i++) {
			System.out.println(mat[i][i] + " ");
		}
		
		System.out.println("Negatives Numbers: " + neg);
		
		scan.close();
	}
}