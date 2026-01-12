public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = {
            new Sphere(5.0),
            new Cylinder(5.0, 10.0),
            new Cone(5.0, 15.0)
        };
        
        for (Shape s : shapeArray) {
            System.out.println(s);
        }
    }
}
