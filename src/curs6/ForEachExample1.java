package curs6;

public class ForEachExample1 {
    public static void main(String[] args) {
        int[] number = {10, 20, 30, 40};

        for (int i =0; i<number.length; i++){
            System.out.println("Clasic For : " + number[i]);
        }

        for (int num : number){
            System.out.println("ForEach For : " + num);
        }

        String[] cities = {"Iasi", "Cluj", "Arad", "Oradea"};
        for (String oras : cities){
            if(oras.equals("Arad")){
                continue;
            }
            System.out.println(oras);
        }
    }
}
