package org.example.LabSolutions.Module2.Lab3ImplementingPolymorphism;

public class Animal {
    private String name;
    private String food;

    public Animal(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String makeSound(){
        return null;
    }

    @Override
    public String toString() {
        return this.name.concat(" says ").concat(makeSound()).concat(" and eats ").concat(this.food);
    }
}
