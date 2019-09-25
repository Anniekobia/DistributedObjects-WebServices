package com.javaspring.demo.spring.model;

public class Department {
    private Long mId;
    private String mName;
    private Company company;

    private Department(){

    }
    public Department(Long mId, String mName, Company company) {
        this.mId = mId;
        this.mName = mName;
        this.company = company;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Department{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", company=" + company +
                '}';
    }
}
