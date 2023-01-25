package it.develhope.overload;

/**
 * Class that define a shape.
 * There are different shapes according to different constructors.
 */
public class Shape {
        public String shapeName;
        public int numberOfEdges;

        /**
         * Basic constructor method for creating an undefined Shape
         */
        public Shape() {
            System.out.println("Creating a shape object");
            this.shapeName = "Undefined shape";
        }
        // Override of methods
    /**
     * Constructor method for creating a circle
     * @param radius a double representing the circle's radius
     */

    public Shape(double radius) {
            System.out.println("Creating a circle");
            this.shapeName = "Circle";
            this.numberOfEdges = 0;
        }
    /**
     * Constructor method for creating a square
     * @param edges the number of edges
     * @param edgeLength the length of the edge
     */

        public Shape(int edges, double edgeLength) {
            System.out.println("Creating a square");
            this.shapeName = "Square";
            this.numberOfEdges = edges;
        }
    /**
     * Constructor method for creating a rectangle
     * @param edges the number of edges
     * @param e1 double length of the first edge
     * @param e2 double length of the second edge
     */
        public Shape(int edges, double e1, double e2) {
            System.out.println("Creating a rectangle");
            this.shapeName = "Rectangle";
            this.numberOfEdges = edges;
        }

    /**
     * Constructor method for creating a triangle
     * @param edges the number of edges
     * @param e1 double length of the first edge
     * @param e2 double length of the second edge
     * @param e3 double length of the third edge
     */

        public Shape(int edges, double e1, double e2, double e3) {
            System.out.println("Creating a triangle");
            this.shapeName = "Triangle";
            this.numberOfEdges = edges;

        }
    /**
     * Method for getting the shape details.
     * @return an informative String containing the shapeName and the numberOfEdges
     */

    // metodo che deve ritornare una stringa
        public String getShapeDetails(){
            return("Shape Name: "+ shapeName + "  -  " + "Number of edges: " + numberOfEdges);
        }

    }
