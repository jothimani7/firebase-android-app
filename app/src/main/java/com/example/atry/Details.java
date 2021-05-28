package com.example.atry;

public class Details {

    String Type;
    String Industry;
    String Founder;
    String Founded;
    String Head;
    String Area;
    String Emp;
    String Web;
    public Details(){

    }

    public Details(String type, String industry, String founder, String founded, String head, String area, String emp, String web) {
        Type = type;
        Industry = industry;
        Founder = founder;
        Founded = founded;
        Head = head;
        Area = area;
        Emp = emp;
        Web = web;
    }

    public String getType() {
        return Type;
    }

    public String getIndustry() {
        return Industry;
    }

    public String getFounder() {
        return Founder;
    }

    public String getFounded() {
        return Founded;
    }

    public String getHead() {
        return Head;
    }

    public String getArea() {
        return Area;
    }

    public String getEmp() {
        return Emp;
    }

    public String getWeb() {
        return Web;
    }
}
