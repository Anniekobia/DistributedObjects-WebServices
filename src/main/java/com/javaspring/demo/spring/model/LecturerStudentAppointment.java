
package com.javaspring.demo.spring.model;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class LecturerStudentAppointment {

    private String mStudentId;
    private String mTeacherId;

    private LecturerStudentAppointment(){

    }

    public LecturerStudentAppointment(String mStudentId, String mTeacherId) {
        this.mStudentId = mStudentId;
        this.mTeacherId = mTeacherId;
    }

    public String getStudentId() {
        return mStudentId;
    }

    public void setStudentId(String studentId) {
        mStudentId = studentId;
    }

    public String getTeacherId() {
        return mTeacherId;
    }

    public void setTeacherId(String teacherId) {
        mTeacherId = teacherId;
    }

    @Override
    public String toString() {
        return "LecturerStudentAppointment{" +
                "mStudentId='" + mStudentId + '\'' +
                ", mTeacherId='" + mTeacherId + '\'' +
                '}';
    }
}
