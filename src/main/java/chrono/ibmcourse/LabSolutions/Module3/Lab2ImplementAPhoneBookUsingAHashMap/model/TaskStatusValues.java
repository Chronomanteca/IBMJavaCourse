package chrono.ibmcourse.LabSolutions.Module3.Lab2ImplementAPhoneBookUsingAHashMap.model;

public enum TaskStatusValues {
    DONE(1),
    IN_PROCESS(2),
    FINISHED(3),
    NOT_STARTE(4);

    private final int statusNumber;

    TaskStatusValues(int statusNumber){
        this.statusNumber = statusNumber;
    }

    public int getStatusNumber(){
        return this.statusNumber;
    }

}
