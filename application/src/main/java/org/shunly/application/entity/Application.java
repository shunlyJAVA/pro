package org.shunly.application.entity;

public class Application {

    private int id;
    private String name;
    private int qq;
    private String position;
    private long time;
    private String college;
    private int onlineId;
    private String url;
    private String ambition;
    private String senior;
    private String info;

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qq=" + qq +
                ", position='" + position + '\'' +
                ", time=" + time +
                ", college='" + college + '\'' +
                ", onlineId=" + onlineId +
                ", url='" + url + '\'' +
                ", ambition='" + ambition + '\'' +
                ", senior='" + senior + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getOnlineId() {
        return onlineId;
    }

    public void setOnlineId(int onlineId) {
        this.onlineId = onlineId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAmbition() {
        return ambition;
    }

    public void setAmbition(String ambition) {
        this.ambition = ambition;
    }

    public String getSenior() {
        return senior;
    }

    public void setSenior(String senior) {
        this.senior = senior;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
