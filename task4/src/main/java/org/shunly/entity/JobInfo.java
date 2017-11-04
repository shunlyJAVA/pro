package org.shunly.entity;

public class JobInfo {

    private int type;
    private String profession;
    private String info;

    @Override
    public String toString() {
        return "JobInfo{" +
                "type=" + type +
                ", profession='" + profession + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
