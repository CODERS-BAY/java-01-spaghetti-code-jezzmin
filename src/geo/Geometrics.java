package geo;

public class Geometrics {
    private static double x = 10.0;
    private static double y = 5.0;
    private static double z = 3.0;

    public static void main(String[] args) {
        // area ... Fläche
        System.out.println("Square area");
        System.out.println("x * x = " + multiply(x, x));

        // perimeter ... Umfang
        System.out.println("Square perimeter");
        System.out.println("4 * x = " + multiply(4, x));

        System.out.println("Rectangle area");
        System.out.println("x * y = " + multiply(x, y));

        System.out.println("Rectangle perimeter");
        System.out.println("x + y = " + addition(x, y));

        System.out.println("We can also calculate some volumes");
        /*
         * z is our height y is our radius
         */
        System.out.println("Zone of a sphere");

        System.out.println(zoneOfSphere(z, y, x));

        System.out.println("Sphere with cylinder");
        System.out.println(sphereWithCylinder(z, x));

        System.out.println("Ungula");
        System.out.println(ungula(x, z));
    }

    public static double multiply(double length, double width) {
        return length * width;
    }

    public static double addition(double length, double width) {
        return length + width;

    }

    public static double zoneOfSphere(double height, double radius, double x) {
        return (Math.PI * height * (3 * Math.pow(radius, 2) + 3 * Math.pow(x, 2) + Math.pow(height, 2))) / 6;
    }

    public static double sphereWithCylinder(double height, double radius) {
        return Math.PI * Math.pow(height, radius) / 6;
    }

    public static double ungula(double length, double radius) {
        return 2 * length * radius / 3;
    }
}
