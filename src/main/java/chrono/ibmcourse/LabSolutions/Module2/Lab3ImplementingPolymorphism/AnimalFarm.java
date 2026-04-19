package chrono.ibmcourse.LabSolutions.Module2.Lab3ImplementingPolymorphism;

public class AnimalFarm {
    public static void main(){
        Animal animal1 = new Dog("Sami");
        Animal animal2 = new Cat("Hershery");
        Animal animal3 = new Cow("Molly");
        System.out.println("animal1 sound " + animal1.makeSound());
        System.out.println("animal2 sound " + animal2.makeSound());
        System.out.println("animal3 sound " + animal3.makeSound());
        animal1.setFood("Steek");
        animal2.setFood("Fish");
        animal3.setFood("Grass");
        System.out.println(animal1.toString());
        System.out.println(animal2.toString());
        System.out.println(animal3.toString());


    }
}
