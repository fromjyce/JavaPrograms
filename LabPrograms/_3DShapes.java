/*Create an abstract class 3DShape and other shapes extend it */

abstract class TDShape {
    // Abstract method to calculate the volume of the 3D shape
    public abstract double calculateVolume();
}

class Sphere extends TDShape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cuboid extends TDShape {
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length * width * height;
    }
}

public class _3DShapes {
    public static void main(String[] args) {
        TDShape sphere = new Sphere(3.0);
        TDShape cuboid = new Cuboid(4.0, 2.0, 5.0);

        System.out.println("Volume of the sphere: " + sphere.calculateVolume());
        System.out.println("Volume of the cuboid: " + cuboid.calculateVolume());
    }
}

