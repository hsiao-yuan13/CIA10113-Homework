package hw2;

public class Homework2 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		
		int y = 0;
		for (int x = 1; x <= 1000; x++) {
			if (x % 2 == 0) {
				y += x;
			}
		}
		System.out.println(y);
	System.out.println("------------------");
	
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		
		int j = 1;
		for (int i = 1; i <= 10; i++) {
			j *= i;
		}
		System.out.println(j);
	System.out.println("------------------");
	
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		
		int m = 0;
		int n = 1;
		while (m <= 9) {
			m++;
			n *= m;
		}
		System.out.println(n);
	System.out.println("------------------");
	
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100

		int b = 0;
		for (int a = 1; a <= 10; a++) {
			b++;
			System.out.println(a * b);
		}
	System.out.println("------------------");
		
//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
	
		for (int c = 1; c <= 49; c++) {
			if (c / 10 != 4 && c % 4 != 0) {
				System.out.print(c + " ");
			}
		}
		System.out.println();
	System.out.println("------------------");
	
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		
    	int d = 11;
    
    	for (int e = 0; e < 10; e++) {
         d--;
         
         	for (int f = 1; f <= d; f++) {
         		System.out.print(f + " ");
         	}
         	System.out.println();
    	}
	System.out.println("------------------");
		
//		• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		char k = 'A';
		for (int g = 0; g < 6; g++) {

			for (int h = 0; h <= g; h++) {
     		System.out.print(k);
     	}
     	System.out.println();
     	k++;
	}
	
	}
}
