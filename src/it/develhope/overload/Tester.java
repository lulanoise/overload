package it.develhope.overload;

/**
 * Tester class with main method.
 * @author Clint Eastwood
 */
public class Tester {

    /**
     * Main method from where the Java program starts.
     * @param args for all the parameters from command line
     */
    public static void main(String[] args) {

        // create the 5 shapes objects

        Shape shape1 = new Shape();
        Shape shape2 = new Shape(0);
        Shape shape3 = new Shape(4,3.0);
        Shape shape4 = new Shape(4,4.0,4.0);
        Shape shape5 = new Shape(3,5.0,5.0,5.0);

        // invoke the getShapeDetails() method for the 5 shapes and assign to respective variables

        String shapeDetails1 = shape1.getShapeDetails();
        String shapeDetails2 = shape2.getShapeDetails();
        String shapeDetails3 = shape3.getShapeDetails();
        String shapeDetails4 = shape4.getShapeDetails();
        String shapeDetails5 = shape5.getShapeDetails();

        // inform the user
        System.out.println(shapeDetails1);
        System.out.println(shapeDetails2);
        System.out.println(shapeDetails3);
        System.out.println(shapeDetails4);
        System.out.println(shapeDetails5);
        
    }
}
