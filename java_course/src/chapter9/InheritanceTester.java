package chapter9;

public class InheritanceTester {

    public static void main(String args[]){
        Person person = new Person();
        Employee employee = new Employee();

        Rectangle rectangle = new Rectangle();
        rectangle.print();
        Square square = new Square();
        square.print("square");
        square.print();
    }
}
