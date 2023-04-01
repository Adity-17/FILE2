package day8_2darray_strings;

import java.util.Scanner;

//wap to define  3*4 matrix and take input from user 
public class TwoDarrayExample2 {

	public static void main(String[] args) {
		 
		int r[][]= new int[2][2];
		
		//r[0][0]=10;
		//r[0][1]=20;
		//r[0][2]=33;
		
		Scanner s= new Scanner(System.in);
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				
				{
				 System.out.println("enter number");
				 r[i][j]= s.nextInt();
				}
				}
	   for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				
				{
				 System.out.print ( "  "+ r[i][j]);
				 
				}
			System.out.println();
				}	
		
		
		
		
		
		}

	}

 
