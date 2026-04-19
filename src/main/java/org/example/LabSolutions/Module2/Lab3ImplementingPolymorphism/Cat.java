package org.example.LabSolutions.Module2.Lab3ImplementingPolymorphism;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }


}
