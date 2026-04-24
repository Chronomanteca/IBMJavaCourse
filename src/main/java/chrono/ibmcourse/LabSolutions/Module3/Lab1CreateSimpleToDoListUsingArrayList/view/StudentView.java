package chrono.ibmcourse.LabSolutions.Module3.Lab1CreateSimpleToDoListUsingArrayList.view;

import chrono.ibmcourse.LabSolutions.Module3.Lab1CreateSimpleToDoListUsingArrayList.Exceptions.StudentInfoNotValidException;
import chrono.ibmcourse.LabSolutions.Module3.Lab1CreateSimpleToDoListUsingArrayList.controller.StudentController;
import chrono.ibmcourse.LabSolutions.Module3.Lab1CreateSimpleToDoListUsingArrayList.model.Student;

import java.awt.*;
import java.util.Scanner;

public class StudentView {

    private static StudentView instance;
    private StudentController controller;

    private StudentView(){
        controller = StudentController.getInstance();
    }

    public static StudentView getInstance(){
        if(instance == null){
            instance = new StudentView();
        }
        return instance;
    }

    //Menu option 1
    public void addStudentWrapper(Scanner wrapperScanner){
        //Scanner wrapperScanner = new Scanner(System.in);
        System.out.println("Enter student Name");
        String name = wrapperScanner.nextLine();
        System.out.println("Enter studet Major");
        String major = wrapperScanner.nextLine();
        System.out.println("Enter student age");
        int age = Integer.parseInt(wrapperScanner.nextLine());
        controller.addStudent(new Student(name,major,age));
        //wrapperScanner.close();

    }
    //Menu option 2
    public boolean updateStudentWrapper(Scanner wrapperScanner){
        //Scanner wrapperScanner = new Scanner(System.in);

        System.out.println("Enter index to edit");
        int index = Integer.parseInt(wrapperScanner.nextLine());
        if(index < 0)
            throw new StudentInfoNotValidException("Index cannot be negative");
        if(index >= controller.studentListSize())
            throw new StudentInfoNotValidException("Index is higher or equal to the list size");
        Student editStudent = controller.getStudent(index);
        System.out.println("You selected the following student: ");
        System.out.println(editStudent.toString());
        boolean wasUpdated = false;

        System.out.println("Enter an option to edit: \n1 - Change name \n2 - Change name \n3 - Change name \4 - Change all information \n1 - Close menu");
        int editOption = Integer.parseInt(wrapperScanner.nextLine());
        //Load default values
        String name = editStudent.getName();
        String major = editStudent.getMajor();
        int age = editStudent.getAge();
        switch (editOption){
            case 1:
                System.out.println("Enter new student Name");
                name = wrapperScanner.nextLine();
                break;
            case 2:
                System.out.println("Enter new student Major");
                major = wrapperScanner.nextLine();
                break;
            case 3:
                System.out.println("Enter new student age");
                age = Integer.parseInt(wrapperScanner.nextLine());
                break;
            case 4:
                System.out.println("Enter new student Name");
                name = wrapperScanner.nextLine();
                System.out.println("Enter new student Major");
                major = wrapperScanner.nextLine();
                System.out.println("Enter new student age");
                age = Integer.parseInt(wrapperScanner.nextLine());
                break;
            case 5:
                System.out.println("operation cancelled");
                return wasUpdated;
            default:

        }
        //wrapperScanner.close();
        controller.updateStudent(index,new Student(name,major,age));
        wasUpdated = true;
        return wasUpdated;
    }

    //Menu option 3

    public void deleteStudentWrapper(Scanner wrapperScanner){
        //Scanner wrapperScanner = new Scanner(System.in);
        System.out.println("Enter index to remove");
        int index = Integer.parseInt(wrapperScanner.nextLine());
        controller.deleteStudent(index);
        //wrapperScanner.close();

    }

    //Menu option 4
    public void viewStudentWrappper(){
        controller.showStudentList();
    }
    //Menu option 5

    public void sortStudentWrapper(){
        controller.sortStudentListByAge();
    }


    //Menu option 6

    public void menu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{

                System.out.println("Select an option from the menu:");
                System.out.println("1 - Add a Student \n2 - Edit a Student \n3 - Delete a Student \n4 - View Student List \n5 - Sort student list by age \n6 - Exit menu");
                int selectedMenuOption = Integer.parseInt(scanner.nextLine());

                switch (selectedMenuOption){
                    case 1:
                        addStudentWrapper(scanner);
                        break;
                    case 2:
                        updateStudentWrapper(scanner);
                        break;
                    case 3:
                        deleteStudentWrapper(scanner);
                        break;
                    case 4:
                        viewStudentWrappper();
                        break;
                    case 5:
                        sortStudentWrapper();
                        break;
                    case 6:
                        System.out.println("GoodBye");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Please enter an option from the menu");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            } catch (NullPointerException e) {
                System.out.println("This should not have happened");
            } catch (StudentInfoNotValidException e) {
                System.out.println(e.getMessage());
            }
        }
    }





}
