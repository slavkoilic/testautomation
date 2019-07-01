package chapter6;

public class HomeAreaCalculator {

    public static void main(String args[]){

        /**********
         * rectangle 1
         */

        Rectangle room1 = new Rectangle();
        room1.setWidth(5);
        room1.setLength(5);
        double room1Perimeter = room1.calculatePerimeter();
        System.out.println("Room 1 perimeter: " + room1Perimeter);

        /**
         * rectangle 2
         */

        Rectangle room2 = new Rectangle(6,6);
        double room2Perimeter = room2.calculatePerimeter();
        System.out.println("Room 2 perimeter: " + room2Perimeter);
    }
}
