package lab.model;

import lab.interfaces.Mantainable;
import lab.interfaces.Tunable;

public class Guitar extends StringedInstrument implements Mantainable, Tunable {
    private String guitarType;

    public Guitar(){
        super("Unknown String instrument",1900,5);
        this.guitarType = "Unknown guitar type";
    }

    public Guitar(String name, int year, int numberOfStrings, String guitarType) {
        super(name, year, numberOfStrings);
        this.guitarType = guitarType;
    }

    @Override
    public String play() {
        return "Guitar sound";
    }

    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails();
    }

    @Override
    public String clean() {
        return "Cleaning the guitar";
    }

    @Override
    public String inspect() {
        return "Inspecting the guitar, this guitar is a  "+this.guitarType;
    }

    @Override
    public String tune() {
        return "Tuning the guitar";
    }

    @Override
    public String adjustPitch(boolean up) {
        return (up) ? "Guitar Pitched up" : "Guitar Pitched down";
    }
}
