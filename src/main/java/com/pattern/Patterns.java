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
			for (int j = 0; j < (n - i - 1); j++) {
				System.out.print(" ");
			}
//			star
			for (int j = 1; j <= (2 * i + 1); j++) {
				System.out.print("*");
			}
//			space
			for (int j = 1; j < (n - i - 1); j++) {
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
			for (int j = 1; j <= (2 * n - (2 * i + 1)); j++) {
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

	void patterns12(int n) {

		for (int i = 1; i <= (2 * n) - 1; i++) {
//			star
			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= (n - (i - n)); j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	void patterns13(int n) {
		int v = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(v);
				v = 1 - v;
			}
			System.out.println();
		}

	}

	void patterns14(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 1; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	void patterns15(int n) {
		int v = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(v + " ");
				v++;
			}
			System.out.println();
		}

	}

	void patterns16(int n) {
		for (int i = 1; i <= n; i++) {
			char v = 65;
			for (int j = 1; j <= i; j++) {
				System.out.print(v);
				v++;
			}
			System.out.println();
		}

	}

	void patterns17(int n) {
		for (int i = 0; i < n; i++) {
			char v = 65;
			for (int j = 0; j < (n - i); j++) {
				System.out.print(v);
				v++;
			}
			System.out.println();
		}

	}

	void patterns18(int n) {
		char v = 64;
		for (int i = 1; i <= n; i++) {
			v++;
			for (int j = 1; j <= i; j++) {
				System.out.print(v);
			}
			System.out.println();
		}

	}

	void patterns19(int n) {
		for (int i = 0; i < n; i++) {
			char v = 65;
//			space
			for (int j = 1; j < (n - i); j++) {
				System.out.print(" ");
			}

//			char
			for (int j = 0; j < (2 * i) + 1; j++) {
				System.out.print(v);
				if (j < i) {
					v++;
				} else {
					v--;
				}
			}

			System.out.println();
		}

	}

	void patterns20(int n) {
		for (int i = 1; i <= n; i++) {
			char v = (char) (65 + n - i + 1);
			for (int j = 1; j <= i; j++) {
				System.out.print(v);
				v++;
			}
			System.out.println();
		}

	}

	void patterns21(int n) {
		for (int i = 0; i < 2 * n; i++) {
//			star
			if (i < n) {
				for (int j = 0; j < (n - i); j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j <= (i - n); j++) {
					System.out.print("*");
				}
			}
//			space
			if (i < n) {
				for (int j = 0; j < 2 * i; j++) {
					System.out.print(" ");
				}
			} else {
				for (int j = 0; j < 2 * n - 2 * (i - n + 1); j++) {
					System.out.print(" ");
				}
			}
//			star
			if (i < n) {
				for (int j = 0; j < (n - i); j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j <= (i - n); j++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}

	}

	void patterns22(int n) {
		for (int i = 1; i <= n; i++) {
			char v = (char) (65 + n - i + 1);
			for (int j = 1; j <= i; j++) {
				System.out.print(v);
				v++;
			}
			System.out.println();
		}

	}

	void patterns23(int n) {
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new Patterns().patterns23(5);
	}
}
