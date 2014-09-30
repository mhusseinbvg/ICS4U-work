package com.bayviewglen.QueensAssignment;

public class Queen {
	private int row;
	private int column;
	
	public Queen(){
	}
	
	public Queen(int r, int c){
		row = r;
		column = c;
	}
	
	public void changeRow(int r){
		row = r;
	}
	
	public void changeColumn(int c){
		column = c;
	}
	
	public int getRow(){
		return row;
	}
	
	public int getColumn(){
		return column;
	}
}
