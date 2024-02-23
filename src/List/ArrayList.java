package List;

public class ArrayList {
    public static void arrayListMethod(){

        for (int i = 0; i < 1000; i++) {
            java.util.ArrayList<String> regions = new java.util.ArrayList<>();
            regions.add("Baki");
            regions.add("Quba");
            regions.add("Samaxi");
            regions.add("Agcabedi");
            regions.add("Xankendi");

//            regions.get(0);
//            regions.get(1);
//            regions.get(2);
//            regions.get(3);
//            regions.get(4);

            regions.remove("Baki");
            regions.remove("Quba");
            regions.remove("Samaxi");
            regions.remove("Agcabedi");
            regions.remove("Xankendi");

        }

    }
}
