// chatgpt input Design & implement a class called Point that represents a location in the Cartesian plane in java
//where in the code does it implement the rotate(double angle)
//setX(double x), setY(double y), setPoint(double x, double y),shiftX(double n), shiftY(double n)
//distance(Point p2),rotate(double angle), x′=xcos(θ)−ysin(θ)
//y′=xsin(θ)+ycos(θ)
//copied and pasted the uml and told it to revise the code once again with the uml listed 
package org.example;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void shiftX(double n) {
        this.x += n;
    }
    public void shiftY(double n) {
        this.y += n;
    }
    public double distance(Point otherPoint) {
        double dx = this.x - otherPoint.getX();
        double dy = this.y - otherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public void rotate(double angle) {
        double cosAngle = Math.cos(angle);
        double sinAngle = Math.sin(angle);
        double newX = this.x * cosAngle - this.y * sinAngle;
        double newY = this.x * sinAngle + this.y * cosAngle;
        this.x = newX;
        this.y = newY;
    }
    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }

    public static void main(String[] args) {
        System.out.println("Project 1 : Point Tester\n");

        Point point1 = new Point(3.0, 1.0);
        Point point2 = new Point(6.0, 5.0);

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        double distance = point1.distance(point2);
        System.out.println("\nDistance: " + distance);

        double rotationAngle = Math.PI / 2;
        point1.rotate(rotationAngle);
        System.out.println("\nRotated a " + rotationAngle + ": " + point1);

        double shiftAmount = 4.47213595499958;
        point1.shiftX(shiftAmount);
        System.out.println("Shifted b " + shiftAmount + " away from original position: " + point1);
    }
}
