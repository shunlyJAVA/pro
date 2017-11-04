package org.shunly.entity;

public class Job {

    private int id;
    private int type;
    private String picture;
    private String profession;
    private String professionInfo;
    private int level;
    private int difficult;
    private String growingCircle;
    private String scarcity;
    private String salary1;
    private String salary2;
    private String salary3;
    private String tips;

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", type=" + type +
                ", picture='" + picture + '\'' +
                ", profession='" + profession + '\'' +
                ", professionInfo='" + professionInfo + '\'' +
                ", level=" + level +
                ", difficult=" + difficult +
                ", growingCircle='" + growingCircle + '\'' +
                ", scarcity='" + scarcity + '\'' +
                ", salary1='" + salary1 + '\'' +
                ", salary2='" + salary2 + '\'' +
                ", salary3='" + salary3 + '\'' +
                ", tips='" + tips + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfessionInfo() {
        return professionInfo;
    }

    public void setProfessionInfo(String professionInfo) {
        this.professionInfo = professionInfo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public String getGrowingCircle() {
        return growingCircle;
    }

    public void setGrowingCircle(String growingCircle) {
        this.growingCircle = growingCircle;
    }

    public String getScarcity() {
        return scarcity;
    }

    public void setScarcity(String scarcity) {
        this.scarcity = scarcity;
    }

    public String getSalary1() {
        return salary1;
    }

    public void setSalary1(String salary1) {
        this.salary1 = salary1;
    }

    public String getSalary2() {
        return salary2;
    }

    public void setSalary2(String salary2) {
        this.salary2 = salary2;
    }

    public String getSalary3() {
        return salary3;
    }

    public void setSalary3(String salary3) {
        this.salary3 = salary3;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
