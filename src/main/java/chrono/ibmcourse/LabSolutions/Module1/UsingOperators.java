package chrono.ibmcourse.LabSolutions.Module1;

public class UsingOperators {
    public UsingOperators() {
    }

    private int[] numbersArray = {1,2,3,4,5,6,7,8,9,10};

    public void operateAray(){


        for(int i = 0; i<numbersArray.length; i+=2){

            int numberA = numbersArray[i];
            int numberB = numbersArray[i+1];

            System.out.println(i);


            switch(i){
                case 0:
                    System.out.println(numberA+"+"+numberB+" = "+(numberA+numberB));
                break;
                case 2:
                    System.out.println(numberA+"-"+numberB+" = " +(numberA-numberB));
                break;
                case 4:
                    System.out.println(numberA+"*"+numberB+" = " +(numberA*numberB));
                break;
                case 6:
                    System.out.println(numberA+"/"+numberB+" = " +(numberA/numberB));
                break;
                case 8:
                    System.out.println(numberA+"%"+numberB+" = " +(numberA%numberB));
                break;
            }

        }



    }

    public void checkArrayElements(){
        String comparisonResult;
        for(int i = 0; i<this.numbersArray.length-1; i++){
            comparisonResult = (numbersArray[i] > numbersArray[i+1]) ?  "Greater than" :  ( (numbersArray[i] < numbersArray[i+1]) ? "Less than" : "Equal to");
            System.out.println(numbersArray[i]+" is "+comparisonResult+" "+numbersArray[i+1]);
        }

    }



}
