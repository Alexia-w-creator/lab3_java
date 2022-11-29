import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        LinkedList<String> list = new LinkedList<>();

        Timer time = new Timer(arr, list);
        System.out.println("Method\t"+"Count\t"+"ArrayList(ms)\t"+"LinkedList(ms)");

        time.addTimerAp();
        time.sizeTimerAp();
        time.getTimerAp();
        time.containsTimerAp();
        time.setTimerAp();
        time.deleteTimerAp();
    }
}