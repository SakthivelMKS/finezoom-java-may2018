package com.finezoom.basics.array;

public class ArrayDiagnoal {

	
		public static void main(String args[]) throws Exception 
		{
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		print(a,3,3);
		}
		
		
		static void print(int[][] a,int rowmax,int colmax){
			int row=0;
			for(int i=0;i< colmax;i++)
				printdiag(a,row,i,rowmax,colmax);
			int col=colmax-1;
			for(int i=1;i< rowmax;i++)
				printdiag(a,i,col,rowmax,colmax);
			
		}
		
		static void printdiag(int[][] a,int row,int col,int rowmax,int colmax)
		{
			System.out.println();
			while(row<rowmax && col >=0)
			{
				System.out.print(a[row][col]);
				row++;
				col--;
			}
			return;
		}

	}


