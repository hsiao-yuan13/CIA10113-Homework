package hw2;

public class TestNineNine {
	public static void main(String[] args) {
//		請建立一個TestNineNine.java程式，可輸出九九乘法表
//		• 一：使用for迴圈 + while迴圈

		for (int x = 1; x <= 9; x++) {
			int y = 1;
			while (y <= 8) {
				y++;
				System.out.print(x + "*" + y + "=" + x*y + "\t");
			}
			System.out.println();
		}
	System.out.println("----------------------------------");
	
//		• 二：使用for迴圈 + do while迴圈

		for (int m = 1; m <= 9; m++) {
			int n = 0;
			do {
				n++;
				System.out.print(m + "*" + n + "=" + m * n + "\t");
			} while(n <= 8);
			System.out.println();

		}
	System.out.println("-------------------------------------");
		
//		• 三：使用while迴圈 + do while迴圈
		int i = 0;
	while (i <= 8) {
		i++;
		int j = 0;
		do {
			j++;
			System.out.print(i + "*" + j + "=" + i * j + "\t");
		} while(j <=8);
		System.out.println();
	}

	}

}
