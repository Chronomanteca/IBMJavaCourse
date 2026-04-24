package chrono.ibmcourse.LabSolutions.Module3.Lab1CreateSimpleToDoListUsingArrayList.controller;

import chrono.ibmcourse.LabSolutions.Module3.Lab1CreateSimpleToDoListUsingArrayList.Exceptions.StudentInfoNotValidException;
import chrono.ibmcourse.LabSolutions.Module3.Lab1CreateSimpleToDoListUsingArrayList.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentController {

    private ArrayList<Student> studentList;

    private static StudentController instance;

    private StudentController(){
        studentList = new ArrayList();
    }

    public static StudentController getInstance(){
        if(instance == null){
            instance = new StudentController();
        }
        return instance;
    }

    public Student getStudent(int index){
        return studentList.get(index);
    }

    public int studentListSize(){
        return studentList.size();
    }

    // add

    public boolean addStudent(Student student){
        return studentList.add(student);
    }



    //view

    public void showStudentList(){
        if(!studentList.isEmpty()){
            for (Student s : studentList){
                System.out.println(s.toString());
            }
        }
        else {
            System.out.println("List is empty, try adding a student");
        }
    }

    // update

    public void updateStudent(int editIndex, Student student){
        if(studentList.isEmpty())
            throw new StudentInfoNotValidException("Student list is empty, try adding a student");
        if(editIndex < 0)
            throw new StudentInfoNotValidException("Index cannot be negative");
        if(editIndex >= studentList.size())
            throw new StudentInfoNotValidException("Index is higher or equal to the list size");
        studentList.set(editIndex, student);
    }


    // delete

    public void deleteStudent(int index){
        if(index >=0 && index < studentList.size())
            studentList.remove(index);

        System.out.println("Index not valid");

    }

    // sort by age

    public void sortStudentListByAge(){
        if(!studentList.isEmpty()) {
            Collections.sort(studentList, new Comparator<Student>() {
                @Override
                public int compare(Student studentA, Student studentB) {
                    return Integer.compare(studentA.getAge(), studentB.getAge());
                }
            });
        }
        else {
            System.out.println("List is empty, try adding a student");
        }
    }



}
