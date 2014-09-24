package com.bayviewglen.multidimensionalarrays;

public class MultiplechoiceTest {

	public static void main(String[] args) {
		char[] answers = {'C','A','E','D','B','E','B','D','A','B'};
		char[][] studentTestAnswers = {
				{'A','A','A','A','A','A','A','A','A','A'},
				{'A','B','A','A','A','A','A','A','A','A'},
				{'A','A','C','A','A','A','A','A','A','A'},
				{'A','D','A','A','A','A','A','A','A','A'},
				{'A','E','B','A','A','A','A','A','A','A'},
				{'A','A','A','A','B','A','B','A','B','E'},
				{'C','A','A','A','A','A','A','A','C','E'},
				{'A','D','A','B','A','A','A','E','A','Z'}
				
		};
		
		
		int studentCorrectScore = 0;
		for(int i = 0; i < studentTestAnswers.length; ++ i){
			for(int r = 0; r < studentTestAnswers[0].length; ++r){
				if(studentTestAnswers[i][r] == (answers[r])){
					studentCorrectScore++;
				}
			}
			System.out.println("Student " + i +"'s test score is " + studentCorrectScore);
			studentCorrectScore = 0;
		}

	}

}
