package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		int minNumber = 1;
		int maxNumber = 100;
		
		Random r = new Random();
		int k;
		int count = 1;
		int sel = 0;
		String msg;
		
		while(true) {
			k = r.nextInt(100) + 1;
			System.out.println("수를 결정하였습니다. 맞추어보세요");
			System.out.println(k);
			while(true) {
				System.out.println(minNumber+"-"+maxNumber);
				System.out.print(count+">>");
				sel = scanner.nextInt();
				
				if(sel==k)
					break;
				else if(sel>k) {
					maxNumber = sel;
					msg = "Down";
				} else {
					minNumber = sel;
					msg = "Up";
				}
				System.out.println(msg);
				count++;
			}
			
			System.out.println("맞았습니다.");
			System.out.print("다시하시겠습니까(y/n)>>");
			String answer = scanner.next();
			if(answer.toLowerCase().equals("n")) break;
		}
		System.out.println("종료");
		scanner.close();
	}

}