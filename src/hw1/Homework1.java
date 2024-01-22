package hw1;

public class Homework1 {
	public static void main(String[] args) {
//	請設計一隻Java程式,計算12,6這兩個數值的和與積
	int x = 12, y = 6;
	int sum = x + y, product = x * y;
	System.out.println("12與6的和為" + sum);
	System.out.println("12與6的積為" + product);
	System.out.println("===========");
	
	
//	• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	int n=200;
	final int dozen = 12;
	int quotient = n / dozen, remainder = n % dozen;
	System.out.println("200顆蛋為" + quotient + "打" + remainder + "顆");
	System.out.println("===========");
	
//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
	int z = 256559, sec = z % 60, min = z / 60 % 60, hr = z / 60 / 60 % 24, day = z / 60 / 60 / 24;
	System.out.println(day + "天" + hr + "小時" + min + "分" + sec + "秒");
	System.out.println("===========");
	
//	• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
	final double p = 3.1415;
	double r = 5;
	double area = Math.pow(r, 2) * p, c = r * 2 * p;
	System.out.println("圓面積為" + area);
	System.out.println("圓周長為" + c );
	System.out.println("===========");
	
//	• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//	金加利息共有多少錢 (用複利計算,公式請自行google)
	double PV = 1500000, i = 0.02, m = 10;
	double FV = PV *  Math.pow(1 + i, m);
	System.out.println(FV + "元");
	System.out.println("===========");
	
//	• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因
	System.out.println(5 + 5); //5為數值，5+5=10
	System.out.println(5 + '5'); //'5'為Unicode編碼，'5'的Unicode編碼為0035，換算成十進位為3*16+5=53，5為數值，5+53=58
	System.out.println(5 + "5"); //5+"5" 為字串相加
	
	}
}
