package com.pattern;

/**
 * Hello world!
 *
 */
public class Patterns {

	void patterns1(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void patterns2(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	void patterns3(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	void patterns4(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	void patterns5(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

	void patterns6(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	void patterns7(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	void patterns8(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
	
	void patterns9(int n) {

		for (int i = 0; i < n; i++) {
//			space
			for (int j = 0; j < (n - i-1); j++) {
				System.out.print(" ");
			}
//			star
			for (int j = 1; j <=(2*i+1); j++) {
				System.out.print("*");
			}
//			space
			for (int j = 1; j < (n - i-1); j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
	
	void patterns10(int n) {

		for (int i = 0; i <= n; i++) {
//			space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
//			star
			for (int j = 1; j <=(2*n-(2*i+1)); j++) {
				System.out.print("*");
			}
//			space
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
	
	void patterns11(int n) {
		
		patterns9(n);
		patterns10(n);

	}
	
	
	

	public static void main(String[] args) {
		new Patterns().patterns11(5);
	}
}
