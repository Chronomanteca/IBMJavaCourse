package chrono.ibmcourse.LabSolutions.Module2.Lab3ImplementingPolymorphism;

public class Cow extends Animal{

    public Cow(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Moo";
    }
}
