package curs9;

public class CheckExceptionExample {

    public static void main(String[] args) throws InterruptedException {
        testceva();

        }

        public static void testceva() throws InterruptedException {
            String[] week = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};

            for (String day : week) {
                Thread.sleep(3000);
                System.out.println(day);
        }
    }
}
