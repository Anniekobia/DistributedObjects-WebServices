
package com.javaspring.demo.spring.model;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class StudentDetails {

    private String mFirstName;
    private String mStudentNumber;

    private StudentDetails(){

    }

    public StudentDetails(String mFirstName, String mStudentNumber) {
        this.mFirstName = mFirstName;
        this.mStudentNumber = mStudentNumber;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public String getStudentNumber() {
        return mStudentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        mStudentNumber = studentNumber;
    }

}
