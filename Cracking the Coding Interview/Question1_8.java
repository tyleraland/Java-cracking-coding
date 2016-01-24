import java.util.Arrays;
import java.util.*;
import java.util.Set;
public class Question1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 15, n = 15;
		int[][] matrix = new int[m][n];
		initMatrix(matrix, m, n);
		printMatrix(matrix, m, n);
		zeroMatrix(matrix, m, n);
		printMatrix(matrix, m, n);
		
	}
	public static void initMatrix(int[][] matrix, int m, int n){
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				if (i == 4 && j == 5){
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = i + j;
				}
			}
		}
	}
	public static void printMatrix(int[][] matrix, int m, int n){
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void zeroMatrix(int[][] matrix, int m, int n){
		// Java's Set is an interface, not a valid data type.
		// Choose between HashSet, HashLinkedList, HashTree ...
		HashSet<Integer> rows = new HashSet<Integer>();
		HashSet<Integer> cols = new HashSet<Integer>();

		// Rrecord all 0 rows, 0 cols
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				if (matrix[i][j] == 0){
					rows.add(i);
					cols.add(j);
				}
			}
		}
		// For each row and each column in the matrix, zero it out
		for (Integer row : rows){
			for (int j = 0; j < n; j++){
				matrix[row][j] = 0;
			}
		}
		for (Integer col : cols){
			for (int i = 0; i < m; i++){
				matrix[i][col] = 0;
			}
		}
	}
}

	
