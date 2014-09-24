package com.bayviewglen.multidimensionalarrays;

public class RaggedArrayPractice {

	public static void main(String[] args) {
		int add = 0;
		int[][] ragged = {
				{1,2,3,4,5},
				{1,2,3,4},
				{1,2,3},
				{1,2},
				{1}
		};
		for(int i = 0; i < ragged.length; ++i){
			for(int j = 0; j <ragged[i].length; ++ j)
				add += ragged[i][j];
		}
		System.out.println(add);

	}

}
