package chrono.ibmcourse.OOPs.Module2.DesigningInterfacesAndAbstractClasses.lab.model;

public abstract class Instrument {

    private String name;
    protected int year;

    public Instrument() {
        this.name = "Unknown";
        this.year = 1900;
    }
    public Instrument(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public abstract  String play();

    public String getInstrumentDetails(){
        return "Instrument name: "+this.name+" Instrument year "+this.year;
    }



}
