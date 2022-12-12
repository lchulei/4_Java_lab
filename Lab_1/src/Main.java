public class Main {

    public static void main(String[] args) {
	    Rectangle rectangle = new Rectangle(4, 3);
	    Rectangle rectangle1 = new Rectangle(3, 4);
	    Rectangle rectangle2 = new Rectangle(8, 6);
	    Rectangle rectangle3 = new Rectangle(4, 3);
	    Rectangle rectangle4 = new Rectangle(3, 2);

        System.out.println("Rectangle 1:");
        System.out.println("Length: " + rectangle.getLength() + "\nWidth: " + rectangle.getWidth() +
                "\nPerimeter: " + rectangle.getPerimeter() + "\nSquare: " + rectangle.getSquare() + "\n");
        
        System.out.println("Rectangle 2:");
        System.out.println("Length: " + rectangle1.getLength() + "\nWidth: " + rectangle1.getWidth() +
                "\nPerimeter: " + rectangle1.getPerimeter() + "\nSquare: " + rectangle1.getSquare() + "\n");
        
        System.out.println("Rectangle 3:");
        System.out.println("Length: " + rectangle2.getLength() + "\nWidth: " + rectangle2.getWidth() +
                "\nPerimeter: " + rectangle2.getPerimeter() + "\nSquare: " + rectangle2.getSquare() + "\n");
        
        System.out.println("Rectangle 4:");
        System.out.println("Length: " + rectangle3.getLength() + "\nWidth: " + rectangle3.getWidth() +
                "\nPerimeter: " + rectangle3.getPerimeter() + "\nSquare: " + rectangle3.getSquare() + "\n");
        
        System.out.println("Rectangle 5:");
        System.out.println("Length: " + rectangle4.getLength() + "\nWidth: " + rectangle4.getWidth() +
                "\nPerimeter: " + rectangle4.getPerimeter() + "\nSquare: " + rectangle4.getSquare() + "\n");

		System.out.println("Compare rectangle 1 and rectangle 2: " + rectangle.compareTo(rectangle1));
		System.out.println("Compare rectangle 1 and rectangle 3: " + rectangle.compareTo(rectangle2));
		System.out.println("Compare rectangle 1 and rectangle 5: " + rectangle.compareTo(rectangle4) + "\n");

		System.out.println("Is rectangle 1 ang 5 similar: " + rectangle.isSimilar(rectangle4));
		System.out.println("Is rectangle 1 ang 3 similar: " + rectangle.isSimilar(rectangle2));
    }
}
