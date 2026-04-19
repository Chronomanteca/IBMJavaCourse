package chrono.ibmcourse.OOPs.Module2.DesigningInterfacesAndAbstractClasses.lab.model;

public class StringedInstrument extends Instrument{

    private int numberOfStrings;

    public StringedInstrument(){
        super();
        this.numberOfStrings = 5;
    }

    public StringedInstrument(String name, int year, int numberOfStrings) {
        super(name, year);
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String play() {
        return "Stringed instrument sound";
    }

    @Override
    public String getInstrumentDetails() {
        return super.getInstrumentDetails()+"/number of strings: "+this.numberOfStrings;
    }
}
