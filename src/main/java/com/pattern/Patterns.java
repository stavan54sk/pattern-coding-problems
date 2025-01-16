package com.pattern;

/**
 * Hello world!
 *
 */
public class Patterns 
{
	
	void patterns1(int n){
		
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		
	}
    public static void main( String[] args )
    {
        new Patterns().patterns1(5);
    }
}
