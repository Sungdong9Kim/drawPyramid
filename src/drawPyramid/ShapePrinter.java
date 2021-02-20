package drawPyramid;

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

}
