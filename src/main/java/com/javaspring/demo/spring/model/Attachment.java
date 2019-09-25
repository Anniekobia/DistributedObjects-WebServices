
package com.javaspring.demo.spring.model;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Attachment {

    private Company mCompany;
    private Department mDepartment;
    private Long mId;
    private Boolean mRejected;

    private Attachment(){

    }

    public Attachment(Company mCompany, Department mDepartment, Long mId, Boolean mRejected) {
        this.mCompany = mCompany;
        this.mDepartment = mDepartment;
        this.mId = mId;
        this.mRejected = mRejected;
    }

    public Company getCompany() {
        return mCompany;
    }

    public void setCompany(Company company) {
        mCompany = company;
    }

    public Department getDepartment() {
        return mDepartment;
    }

    public void setDepartment(Department department) {
        mDepartment = department;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getRejected() {
        return mRejected;
    }

    public void setRejected(Boolean rejected) {
        mRejected = rejected;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "mCompany=" + mCompany +
                ", mDepartment=" + mDepartment +
                ", mId=" + mId +
                ", mRejected=" + mRejected +
                '}';
    }
}
