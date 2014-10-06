package com.bayviewglen.QueensAssignment;

import java.util.Stack;

public class addQueen {

	//method that adds queens

	public static void AddQueen(int indexX,int indexY,String[][] Arr,Stack<String> queenQue){
		Arr[indexY][indexX]= "Q";
		queenQue.push("row " + Integer.toString(indexY) + " " + "colum " + Integer.toString(indexX));
	}

	public static void printBoard(int n,String[][] Arr){
		for(int c = 0; c < n; c ++){
			System.out.println();
			for (int r = 0; r < n; r++){
				System.out.print(Arr[c][r]);
				System.out.print(" ");
			}
		}

	}




}


