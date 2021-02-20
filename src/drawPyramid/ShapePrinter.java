package drawPyramid;

import java.util.Iterator;

public class ShapePrinter {
	public void printPyramid(int height) {
		
		for(int i = 1; i <= height; i++) {
			
			for(int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k < 2*i; k++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}
	/*
	public void printFloydsPyramid(int heigt) {
		int printNum = 1;
		for(int i = 1; i <= heigt; i++) {				
			
			for(int j = 1; j <= i; j++) {
				int maxLeng = (heigt * (heigt + 1) / 2);
				//int maxLeng = String.valueof(heigt * (heigt + 1) / 2).length();
				
				if(((int)(Math.log10(maxLeng)+1)) > 1) {
					int leng = ((int)(Math.log10(maxLeng)+1)) - ((int)(Math.log10(printNum)+1));
					for(int k = 1; k <= leng; k++)
						System.out.print(" ");					
				}
				
				System.out.print(printNum+" ");
				printNum++;
			}
			System.out.println();
		}
	}*/
	
	
	public void printFloydsPyramid(int height) {
		

		// 숫자 자리 구하기 (5)
		int length = String.valueOf(height * (height + 1) / 2).length();
		
		// 인쇄될 수 (6)
		int number = 1;
		
		// 반복문 1 - 행을 바꾸는 반복문 (1)
		for(int row = 1; row <= height; row++) {
			
			
			// 한 행에서 인쇄될 내용을 담는 문자열 선언 (3)
			String line = "";
			
			// 반복문 2 - 한 행에서 열을 바꾸는 반복문 (2)
			for (int col = 1; col <= row; col++) {
				
				// 반복문 3 - 한 열 안에서 자리수를 맞추는 반복문 (7)
				for (int i = String.valueOf(number).length(); i < length; i++) {
					line += " ";
				}
				// 실제 인쇄될 수를 문자열에 더하고 한 칸 띄워주기(8)
				line += number+ " ";
				number++;
			}
			
			System.out.println(line);
		}
	}
	 

}
