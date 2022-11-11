package hybridarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HybridArray {

    private int hdizi[];
    private int boyut;
    private int kapasite;

    public HybridArray() {
        hdizi = new int[10];
        boyut = 0;
        kapasite = 9;

    }

    public void addLast(int sonekle) {
        hdizi[9] = sonekle;
        boyut++;
    }

    public void addFirst(int ilkekle) {
        hdizi[0] = ilkekle;
        boyut++;
    }

    public void insert(int indx, int num) {
        if (indx > hdizi.length) {
            System.out.println("Bu index dizideki uzunlugu dan buyuktur..");
        } else {
            hdizi[indx] = num;
            boyut++;
        }
    }

    public void removeFirst() {
        hdizi[0] = 0;
        boyut--;
    }

    public void removeLast() {
        hdizi[9] = 0;
        boyut--;

    }

    public void removeAt(int silat) {
        hdizi[silat] = 0;
        boyut--;
    }

    public void get(int index) {
        int x = (int) Array.get(hdizi, index);
        System.out.println(x);
    }

    public void clear() {
        for (int i = 0; i < hdizi.length; i++) {
            hdizi[i] = 0;
        }
    }

    public int boy() {
        return boyut;
    }

    public int kap() {
        return kapasite;
    }

    public void println() {
        System.out.println("Dizinin elemanlar :" + Arrays.toString(hdizi));
    }

}
