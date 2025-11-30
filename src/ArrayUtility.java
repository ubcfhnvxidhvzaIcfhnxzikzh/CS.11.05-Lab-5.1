import java.util.Arrays;

public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        double sum = 0;
        for(int i = 0; i<array.length; i++) {
            sum = sum+ array[i];
        }
        double avg = (sum/array.length);
        return avg;
    }

    public static int minimum(int[] array) {
        int min = array[0];
        for(int i = 0; i<array.length; i++){
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int max = array[0];
        for(int i = 0; i<array.length;i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static int evenCount(int[] array) {
        int even = 0;
        for(int num:array) {
            if (num % 2 == 0) {
                even = even + 1;
            }
        }
        return even;
    }

    public static int[] reverseOne(int[] array) {
        int[] reverse = new int[array.length];
        for(int i = 0; i<array.length; i++) {
            reverse [i] = array[array.length - i-1];
        }
        return reverse;
    }

    public static void reverseTwo(int[] array) {
        for(int i = 0; i<array.length/2; i++) {
            int half = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = half;
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for(int i= 0; i<array.length; i++){
            if(array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for(String i:array) {
            if(i==str){
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for(int i = 0; i<array.length; i++) {
            array[i] = array[i]*2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for(int i = 0; i<array.length; i++){
            array[i] = array[i]*n;
        }
    }

    public static String toString(int[] array) {
        String string = "";
        for(int i=0;i<array.length;i++){
            string = string + array[i] + ", ";
        }
        return string.substring(0,string.length()-2);
    }

    public static boolean twoSum(int[] array, int num) {
        for(int i=0;i<array.length;i++){
            for(int o = i+1; o<array.length;o++){
                if(array[o]+array[i]==num){
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int[] copy = array.clone();
        array[0] = copy[array.length-1];
        for(int i = 1; i<array.length;i++){
            array[i] = copy[i-1];
        }
    }

    public static void shiftLeft(int[] array) {
        int[] copy = array.clone();
        array[array.length-1] = copy[0];
        for(int i = 0; i<array.length-1; i++){
            array[i] = copy[i+1];
        }
    }

    public static void shiftRightNTimes(int[] array, int n) {
        int shift = n%array.length;
        int[] copy = array.clone();
        for (int i=0; i<array.length; i++) {
            array[(i+shift)%array.length] = copy[i];
        }

    }

    public static void shiftLeftNTimes(int[] array, int n) {
        int shift = n%array.length;
        int[] copy = array.clone();
        for (int i=0; i<array.length; i++) {
            array[i] = copy[(i + shift) % array.length];
        }

    }
}
