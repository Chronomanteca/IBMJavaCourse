package org.example.LabSolutions.Module1;

public class WorkingWithStrings {
    private static String s1 = "Maple Tree";
    private static String s2 = "Maple Tree";
    private static String s3 = new String("Maple Tree");

    public static void labSolution(){
        System.out.println("s1 = s2"+s1 == s2);
        System.out.println("s1 = s3"+s1 == s3);
        System.out.println("s2 = s3"+s2 == s3);
        System.out.println("s1.equals(s2)"+s1.equals(s2));
        System.out.println("s1.equals(s3)"+s1.equals(s3));
        System.out.println("s2.equals(s3)"+s2.equals(s3));
        System.out.println();
        String newSubstring1 = s3.substring(0,5);
        String newSubstring2 = s3.substring(5);
        System.out.println("substring1 = "+newSubstring1+" substring 2 ="+newSubstring2);
        String concatenatedString = newSubstring1.concat(newSubstring2);
        System.out.println("String concatenated = "+concatenatedString);
    }


}
