
package com.javaspring.demo.spring.model;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Student {

    private Object mAttachment;
    private String mFirstName;
    private Long mId;
    private Long mScore;
    private String mStudentNumber;

    private Student(){

    }

    public Student(Object mAttachment, String mFirstName, Long mId, Long mScore, String mStudentNumber) {
        this.mAttachment = mAttachment;
        this.mFirstName = mFirstName;
        this.mId = mId;
        this.mScore = mScore;
        this.mStudentNumber = mStudentNumber;
    }

    public Object getAttachment() {
        return mAttachment;
    }

    public void setAttachment(Object attachment) {
        mAttachment = attachment;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Long getScore() {
        return mScore;
    }

    public void setScore(Long score) {
        mScore = score;
    }

    public String getStudentNumber() {
        return mStudentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        mStudentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "mAttachment=" + mAttachment +
                ", mFirstName='" + mFirstName + '\'' +
                ", mId=" + mId +
                ", mScore=" + mScore +
                ", mStudentNumber='" + mStudentNumber + '\'' +
                '}';
    }
}
