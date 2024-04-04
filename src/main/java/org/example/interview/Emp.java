package org.example.interview;

import org.example.objectClassMethod.EmployeeObject;

public class Emp implements Comparable<Emp> {

    private String name;
    private String phone;
    private int empId;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", empId=" + empId +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Emp(String name, String phone, int empId) {
        this.name = name;
        this.phone = phone;
        this.empId = empId;
    }



    @Override
    public int compareTo(Emp o) {
        /*if(this.empId==o.empId){
            return 0;
        }
        if(this.empId<o.getEmpId())
        {
            return -1;
        } else if (this.empId>o.getEmpId()) {
           return 1;
        }*/
        return this.empId-o.getEmpId();


        }

    }
