package controller;

public class Chia {
	public static void main(String[] args) {
		System.out.println("chiennv3434");

	}

	public void creatPullrequest() {
		System.out.println("creat pull request");
	}

	public void hackerRaNK() {
		int a =65;
		int b = 3;
		int n = 5;
		int h = 0;
		for (int i = 0; i < 5; i++) {
			int g = 0;
			if (i == 0)
				g = a + i * b;
			for (int j = 1; j <= n; j++) {
				if (i == j) {
					g = a + j * b;
					System.out.println(g + h);
					h = g;
				}
			}
		}
	}
}
