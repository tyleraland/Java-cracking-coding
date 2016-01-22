import java.util.*;
import java.math.*;
public class Question1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=20, n=20;
		int[][] matrix = new int[m][n];
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				matrix[i][j] = Math.abs(i - j);
			}
		}
		// Print matrix
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println();
		}
		rotateMatrix(matrix, m, n);
		System.out.println("");
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println();
		}
	}
	
	public static void rotateMatrix(int[][] matrix, int m, int n){
		for (int x = 0; x < Math.ceil((float)m / 2); x++){
			for (int y = 0; y < Math.ceil((float)n / 2); y++){
				rotateCell(matrix, m, n, x, y);
			}

		}
		
	}
	public static void rotateCell(int[][] matrix, int m, int n, int inx, int iny){
		int temp = matrix[inx][iny];
		
	//	System.out.println("inx: " + inx + ", iny: " + iny);
	//	System.out.println("m: " + m + ", n: " + n);
		matrix[inx][iny] = matrix[inx][n-1-iny];
		matrix[inx][n-1-iny] = matrix[m-1-inx][n-1-iny];
		matrix[m-1-inx][n-1-iny] = matrix[m-1-inx][iny];
		matrix[m-1-inx][iny] = temp;	
	}

}
