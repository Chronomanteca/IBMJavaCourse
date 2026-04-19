package chrono.ibmcourse.OOPs.Module2.DesigningInterfacesAndAbstractClasses.lab.model;

import chrono.ibmcourse.OOPs.Module2.DesigningInterfacesAndAbstractClasses.lab.interfaces.Mantainable;
import chrono.ibmcourse.OOPs.Module2.DesigningInterfacesAndAbstractClasses.lab.interfaces.Tunable;

public class Piano extends StringedInstrument implements Mantainable, Tunable {
    private boolean isGrand;

    public Piano() {
        super("Unknown string instrument", 1900,5);
        this.isGrand = false;
    }

    public Piano(String name, int year, int numberOfStrings, boolean isGrand) {
        super(name, year, numberOfStrings);
        this.isGrand = isGrand;
    }

    @Override
    public String play() {
        return "Piano sound";
    }

    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails()+((isGrand) ? "Grand" : "Not Grand");
    }

    @Override
    public String clean() {
        return "Cleaning the piano";
    }

    @Override
    public String inspect() {
        return "Inspecting the piano this piano "+(((this.isGrand) ? "is Grand": "is not Grand"));
    }

    @Override
    public String tune() {
        return "Tuning piano";
    }

    @Override
    public String adjustPitch(boolean up) {
        return (up) ? "Piano pitched up" : "Piano pitched down";
    }
}
