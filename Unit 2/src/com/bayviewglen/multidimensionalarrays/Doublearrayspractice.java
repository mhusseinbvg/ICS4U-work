package com.bayviewglen.multidimensionalarrays;

public class Doublearrayspractice {




	public static void main(String[] args) {
		int[][] arr = {
				{10, 11, 12, 13},
				{14, 15, 16, 17},
				{18, 19, 20, 21},
				{22, 23, 24, 25},
				{26, 27, 28, 29}
		};
		display(arr);
		System.out.println();
		System.out.println();
		switchColumns(0,2,arr);
		display(arr);
		System.out.println();
		System.out.println();
		switchColumns(0,2,arr);
		display(arr);
	}

	public static void switchColumns(int col1, int col2, int[][] arr){		
		for (int i=0; i<arr[0].length; ++i){
			int temp = arr[i][col1];
			arr[i][col1] = arr[i][col2];
			arr[i][col2] = temp;
		}
	}

	public static void display(int[][] arr){
		for (int i=0; i<arr.length; ++i){
			for (int j=0; j<arr[i].length; ++j){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}



