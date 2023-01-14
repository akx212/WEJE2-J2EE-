package com.jspiders.designpattern;

public class App {
	public static void main(String[] args) 
	{
		int [][] a = { {1,1,1} , {2,2,2} , {3,3,3} };
		int [][] b= { {1,1,1} , {2,2,2} , {3,3,3} };
		int [][] mul= new int [3][3];

		for (int i=0; i< a.length ;i++ )
		{
			for (int j=0; j < a[i].length ;j++ )
			{
				for (int k=0; k < a[i].length ; k++ )
				{
					mul [i][j] += a [i][k] * b [k][i];
				}	
			}	
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(mul[i][j] + " "); 
			}
			System.out.println();
		}
	}
}
