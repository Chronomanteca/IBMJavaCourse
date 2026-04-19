package chrono.ibmcourse.LabSolutions.Module2.Lab3ImplementingPolymorphism;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof";
    }
}
