
package com.javaspring.demo.spring.model;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Appointment {

    private Boolean mConfirmed;
    private Long mId;
    private Student mStudent;
    private Teacher mTeacher;

    public Appointment(Boolean mConfirmed, Long mId, Student mStudent, Teacher mTeacher) {
        this.mConfirmed = mConfirmed;
        this.mId = mId;
        this.mStudent = mStudent;
        this.mTeacher = mTeacher;
    }
    private Appointment(){

    }

    public Boolean getConfirmed() {
        return mConfirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        mConfirmed = confirmed;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Student getStudent() {
        return mStudent;
    }

    public void setStudent(Student student) {
        mStudent = student;
    }

    public Teacher getTeacher() {
        return mTeacher;
    }

    public void setTeacher(Teacher teacher) {
        mTeacher = teacher;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "mConfirmed=" + mConfirmed +
                ", mId=" + mId +
                ", mStudent=" + mStudent +
                ", mTeacher=" + mTeacher +
                '}';
    }
}
