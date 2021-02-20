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
		

		// ���� �ڸ� ���ϱ� (5)
		int length = String.valueOf(height * (height + 1) / 2).length();
		
		// �μ�� �� (6)
		int number = 1;
		
		// �ݺ��� 1 - ���� �ٲٴ� �ݺ��� (1)
		for(int row = 1; row <= height; row++) {
			
			
			// �� �࿡�� �μ�� ������ ��� ���ڿ� ���� (3)
			String line = "";
			
			// �ݺ��� 2 - �� �࿡�� ���� �ٲٴ� �ݺ��� (2)
			for (int col = 1; col <= row; col++) {
				
				// �ݺ��� 3 - �� �� �ȿ��� �ڸ����� ���ߴ� �ݺ��� (7)
				for (int i = String.valueOf(number).length(); i < length; i++) {
					line += " ";
				}
				// ���� �μ�� ���� ���ڿ��� ���ϰ� �� ĭ ����ֱ�(8)
				line += number+ " ";
				number++;
			}
			
			System.out.println(line);
		}
	}
	 

}
