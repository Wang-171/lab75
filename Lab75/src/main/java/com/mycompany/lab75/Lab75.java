
package com.mycompany.lab75;


public class Lab75 {

        private String studentId;
    private String name;
    private int age;

    public Lab75(String studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }


    public String getStudentId() { return studentId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public void updateName(String newName) { this.name = newName; }

}
