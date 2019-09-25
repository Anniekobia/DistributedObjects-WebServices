
package com.javaspring.demo.spring.model;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Company {

    private Long mId;
    private String mName;

    private Company(){

    }

    public Company(Long mId, String mName) {
        this.mId = mId;
        this.mName = mName;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Override
    public String toString() {
        return "Company{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                '}';
    }
}
