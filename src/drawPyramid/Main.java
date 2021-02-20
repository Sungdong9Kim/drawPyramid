package drawPyramid;

public class Main {
	public static void main(String[] args) {
		ShapePrinter printer = new ShapePrinter();
		
		printer.printPyramid(3);
		System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);	
        
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(15);
		
		
	}

}
