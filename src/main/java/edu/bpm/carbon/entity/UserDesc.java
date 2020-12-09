package edu.bpm.carbon.entity;


public class UserDesc {

    private int id;

    private String university;

    private String dorm;

    private String lab;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    @Override
    public String toString() {
        return "UserDesc{" +
                "id=" + id +
                ", university='" + university + '\'' +
                ", dorm='" + dorm + '\'' +
                ", lab='" + lab + '\'' +
                '}';
    }
}
