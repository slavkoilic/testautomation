package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        calculator.scanner.close();

        double area = calculator.calculateTotalArea(kitchen, bathroom);

        System.out.println("Total area: " + area);
    }

    public Rectangle getRoom(){

        System.out.println("Please enter the length: ");
        double length = scanner.nextDouble();

        System.out.println("Please enter the width: ");
        double width = scanner.nextDouble();

        return new Rectangle(length,width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();

    }
}
