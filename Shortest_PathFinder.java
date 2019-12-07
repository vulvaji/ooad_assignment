package com.ooad.proj;

import java.util.*;

public class Shortest_PathFinder {
	
	public int getInputFromUser(){
		int default_square_position = 0;
		
		try{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			int square_position = input.nextInt();
			return square_position;
			}catch(Exception InputMismatchException){
				return default_square_position = 0;
			}
	}	
	
	public int spiral_memory_generator(int squarePosition){		
		if(squarePosition > 0 ){				
			System.out.println("You entered " + squarePosition);
			int x, y, dx, dy, step, dxtmp;
			x = y = dx = step =0;
			dy = -1;
					
			for(;;) {
				
				step += 1;			
				if(squarePosition == step) {
					int shortest_path_Steps = Math.abs(x) + Math.abs(y);
					System.out.println("Shortest Steps : "+ shortest_path_Steps);
					return shortest_path_Steps;
				}
				if(x == y || x < 0 && x == -y || x > 0 && x == 1 - y) {
					dxtmp = dx;
					dx = -dy;
					dy = dxtmp;
				}
				x += dx;
				y += dy;			
			}
	        }else{
	        	System.out.println("You have entered Invalid Entry [Ex. 0 or Negative numbers or Invalid Alpha numerical characters].");
	    		return 0;
	    	}
		
		}
	
}

