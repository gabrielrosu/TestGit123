package curs7.tema7;

public class Teacher {
    public String getCourse() {
        return course;
    }

    public int getExperianceYears() {
        return experianceYears;
    }

    public String getSchedule() {
        return schedule;
    }

    private String course;
    private int experianceYears;
    private String schedule;

    public Teacher(String course, int experianceYears, String schedule){
        this.course = course;
        this.experianceYears = experianceYears;
        this.schedule = schedule;
    }
}
