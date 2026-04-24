package chrono.ibmcourse.LabSolutions.Module3.Lab1CreateSimpleToDoListUsingArrayList.model;

import chrono.ibmcourse.LabSolutions.Module3.Lab1CreateSimpleToDoListUsingArrayList.Exceptions.StudentInfoNotValidException;

public class Student {

    String name;
    String major;
    int age;

    public Student(String name, String major, int age) {

        try{
            if(name.isEmpty() || name.isBlank() || name == null)
                throw new StudentInfoNotValidException("Name is not valid, please do not enter empty characters");
            if(major.isEmpty() || major.isBlank() || major == null)
                throw new StudentInfoNotValidException("Major is not valid, please do not enter empty characters");
            if(age < 0 )
                throw new StudentInfoNotValidException("Age is not valid, negative ages are not accepted");

            this.name = name;
            this.major = major;
            this.age = age;

        }catch(StudentInfoNotValidException e){
            System.out.println(e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank() || name == null)
            throw new StudentInfoNotValidException("Name is not valid, please do not enter empty characters");
        this.name = name;
    }

    public void setMajor(String major) {
        if(major.isEmpty() || major.isBlank() || major == null)
            throw new StudentInfoNotValidException("Name is not valid, please do not enter empty characters");
        this.major = major;
    }

    public void setAge(int age) {
        if(age < 0 )
            throw new StudentInfoNotValidException("Age is not valid, negative ages are not accepted");
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nName: "+this.name+"\nMajor: "+this.major+"\nAge: "+this.age;
    }
}
