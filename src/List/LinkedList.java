package List;

public class LinkedList {


    public static void linkedListMethod(){

        for (int i = 0; i < 1000; i++) {
            java.util.LinkedList<String> regions = new java.util.LinkedList<>();
            regions.add("Baki");
            regions.add("Quba");
            regions.add("Samaxi");
            regions.add("Agcabedi");
            regions.add("Xankendi");


            regions.get(0);
            regions.get(1);
            regions.get(2);
            regions.get(3);
            regions.get(4);

            regions.remove("Baki");
            regions.remove("Quba");
            regions.remove("Samaxi");
            regions.remove("Agcabedi");
            regions.remove("Xankendi");


        }

    }

}
