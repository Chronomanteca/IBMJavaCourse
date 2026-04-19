package chrono.ibmcourse.LabSolutions.Module1;

public class DataTypes {


    private char chaVariable;
    public DataTypes(char chaVariable) {
        this.chaVariable = chaVariable;
    }

    public char getChaVariable() {
        return chaVariable;
    }

    public void setChaVariable(char chaVariable) {
        this.chaVariable = chaVariable;
    }

    public void printChar(boolean toInt){

        if(toInt){
            System.out.println((int)this.chaVariable);
        }
        else{
            System.out.println(this.chaVariable);
        }

    }
}
