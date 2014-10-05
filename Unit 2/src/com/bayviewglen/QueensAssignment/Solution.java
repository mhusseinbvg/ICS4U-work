package com.bayviewglen.QueensAssignment;

import java.util.Stack;

public class Solution {
	int queenNumber;
	int boardSize;
	Queen[] queens;
	Stack<Queen> queenStack = new Stack<Queen>();

	public Solution(int numOfStuff){
		queenNumber = numOfStuff;
		boardSize = numOfStuff;
		queens = new Queen[numOfStuff];


	}

	public boolean checkForSolution(){
		if(checkHorizontal() && checkVertical() && checkDiagonal())
			return true;
		else
			return false;
	}

	public boolean checkHorizontal(){
		return true;
	}

	public boolean checkVertical(){
		return true;
	}

	public boolean checkDiagonal(){
		return true;
	}

}
