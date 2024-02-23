package List;

public class Main {

    public static void checkTime(){

        long startTime2 = System.nanoTime();
        LinkedList.linkedListMethod();
        long endTime2   = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;


        long startTime = System.nanoTime();
        ArrayList.arrayListMethod();
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;


        System.out.println("ArrayList - " + totalTime);
        System.out.println("LinkedList - " + totalTime2);
    }
    public static void main(String args[]) {
        checkTime();
    }
}