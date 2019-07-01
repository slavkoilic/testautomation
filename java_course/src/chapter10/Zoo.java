package chapter10;

public class Zoo {

    public static void main(String args[]){

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();
        feed(sasha);

        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);

        ((Cat) sasha).scratch();
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here's the DOG food");
        }

        if(animal instanceof Cat){
            System.out.println("Here's the CAT food");
        }

    }
}
