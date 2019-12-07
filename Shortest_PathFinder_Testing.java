package com.ooad.proj;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class Shortest_PathFinder_Testing {
	
	private Shortest_PathFinder shortest_pathfinder;
	@Rule public TestName name = new TestName();
	
	@Before
	public void setUp(){		
		shortest_pathfinder  = new Shortest_PathFinder();
	}

	@Test
	public void testMemoryGenerator() {
		assertNotNull(shortest_pathfinder);
	}
	
	@Test
	public void testTestValueGivenInExample_1(){
		int TestValueGivenInExample = 1;
		int expected_shorteststeps = 0;		
		
		System.out.println("Started executing "+name.getMethodName()+"     *************" );		
		assertEquals(expected_shorteststeps, shortest_pathfinder.spiral_memory_generator(TestValueGivenInExample));
		System.out.println("Execution completed for "+name.getMethodName()+"     *************" + "\r\n");		
	}

	@Test
	public void testTestValueGivenInExample_12(){
		int TestValueGivenInExample = 12;
		int expected_shorteststeps = 3;	
		
		System.out.println("Started executing "+name.getMethodName()+"     *************" );
		assertEquals(expected_shorteststeps, shortest_pathfinder.spiral_memory_generator(TestValueGivenInExample));
		System.out.println("Execution completed for "+name.getMethodName()+"     *************" + "\r\n");		
	}
	
	
	@Test
	public void testTestValueGivenInExample_23(){
		int TestValueGivenInExample = 23;
		int expected_shorteststeps = 2;	
		
		System.out.println("Started executing "+name.getMethodName()+"     *************" );
		assertEquals(expected_shorteststeps, shortest_pathfinder.spiral_memory_generator(TestValueGivenInExample));
		System.out.println("Execution completed for "+name.getMethodName()+"     *************" + "\r\n");		
	}
		
	@Test
	public void testTestValueGivenInExample_1024(){
		int TestValueGivenInExample = 1024;
		int expected_shorteststeps = 31;
		
		System.out.println("Started executing "+name.getMethodName()+"     *************" );
		assertEquals(expected_shorteststeps, shortest_pathfinder.spiral_memory_generator(TestValueGivenInExample));
		System.out.println("Execution completed for "+name.getMethodName()+"     *************" + "\r\n");		
	}
	
	@Test
	public void testMaxValue_2000(){
		int TestMaxValue = 2000;
		int expected_shorteststeps = 25;
		
		
		System.out.println("Started executing "+name.getMethodName()+"     *************" );
		assertEquals(expected_shorteststeps, shortest_pathfinder.spiral_memory_generator(TestMaxValue));
		System.out.println("Execution completed for "+name.getMethodName()+"     *************" + "\r\n");		
	}
	
	@Test
	public void testNegative(){
		int TestNegativeValue = -1;
				
		System.out.println("Started executing "+name.getMethodName()+"     *************" );
		shortest_pathfinder.spiral_memory_generator(TestNegativeValue);
		System.out.println("Execution completed for "+name.getMethodName()+"     *************" + "\r\n");		
	}
	
	@Test
	public void testIntAsAString(){
		int TestIntAsAString = Integer.valueOf("23");
		int expected_shorteststeps = 2;		
		
		System.out.println("Started executing "+name.getMethodName()+"     *************" );
		assertEquals(expected_shorteststeps, shortest_pathfinder.spiral_memory_generator(TestIntAsAString));
		System.out.println("Execution completed for "+name.getMethodName()+"     *************" + "\r\n");		
	}
	
	
	
	@Test()
	public void testFindsteps_forUserdefinedValidValue(){
		System.out.println("*************     Started executing "+name.getMethodName()+"     *************" );
		System.out.println("Please enter the valid Number here : [Ex. 2134]");
		int user_input = shortest_pathfinder.getInputFromUser();	
	
		assertNotNull(shortest_pathfinder.spiral_memory_generator(user_input));
		System.out.println("*************     Execution completed for "+name.getMethodName()+"     *************" + "\r\n");
	}

	@Test()
	public void testFindsteps_forUserdefinedInvalidValue(){
		System.out.println("*************     Started executing "+name.getMethodName()+"     *************" );
		System.out.println("Please enter the Invalid Number here : [Ex. -12 / dfsdf / 0 ]");
		int user_input = shortest_pathfinder.getInputFromUser();
		
		assertNotNull(shortest_pathfinder.spiral_memory_generator(user_input));
		System.out.println("*************     Execution completed for "+name.getMethodName()+"     *************" + "\r\n");
	}
}
