package drawPyramid;

public class Main {
	public static void main(String[] args) {
		ShapePrinter printer = new ShapePrinter();
		
		printer.printPyramid(3);
		System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);	
		
		
	}

}
