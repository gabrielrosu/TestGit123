package curs7.tema7;

public class Qualification extends  Teacher{
    public Qualification(String course, int experianceYears, String schedule) {
        super(course, experianceYears, schedule);
    }

    public void verify(){
    if (getCourse().equals("Java") && getExperianceYears() == 3 && getSchedule().equals("Afternoon")){
        System.out.println("You qualify to teach at this school!");
    } else {
        System.out.println("You do not qualify!");
        }
    }

    public static void main(String[] args) {
        Qualification qualification = new Qualification("Java", 3, "Afternoon");
        qualification.verify();

        Qualification qualification2 = new Qualification("Javaa", 4, "Afternoon");
        qualification2.verify();
    }
}
