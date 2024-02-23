package Practise;


public class medianTwoArrays {
    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int[] arrayLast = new int[array1.length + array2.length];


        System.out.println(findMedian(arrayLast));
    }

    public static double findMedian(int[] arrayLast){
        int length = arrayLast.length;
        int center = arrayLast.length / 2;
        double median;

        if (length % 2 == 0) {
            median = (center - 1) + (center) / 2.0;
        } else {
            median = center;
        }
        return median;
    }

}