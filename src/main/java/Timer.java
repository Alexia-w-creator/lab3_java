import java.util.ArrayList;
import java.util.LinkedList;


import java.time.Duration;
import java.time.Instant;

public class Timer {
    private ArrayList<String> arr;
    private LinkedList<String> list;
    public Timer(ArrayList<String> _arr, LinkedList<String> _list){
        arr = _arr;
        list = _list;
    }
    public void addTimer()
    {
        //for(int t = 1000; t <= 1000000; t*=10)
        //{
        int i = 0;
        Instant start = Instant.now();
        for(i = 0; i <60000; i++) {arr.add("i");}
        Instant finish = Instant.now();
        long time = Duration.between(start, finish).toMillis();
        System.out.print("add   \t"+i+"   \t"+time);

        start = Instant.now();
        for(i = 0; i <60000; i++) {list.add("i");}
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.println("        \t"+time);
        //}
    }
    public void deleteTimer()
    {
        int i = 0;
        Instant start = Instant.now();
        for(i = 0; i <60000; i++) {arr.remove("i");}
        Instant finish = Instant.now();
        long time = Duration.between(start, finish).toMillis();
        System.out.print("remove\t"+i+"   \t"+time);

        start = Instant.now();
        for(i = 0; i <60000; i++) {list.remove("i");}
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.println("     \t"+time);
    }
    public void getTimer()
    {
        int i = 0;
        Instant start = Instant.now();
        for(i = 0; i <60000; i++) {arr.get(i);}
        Instant finish = Instant.now();
        long time = Duration.between(start, finish).toMillis();
        System.out.print("get   \t"+i+"   \t"+time);

        start = Instant.now();
        for(i = 0; i <60000; i++) {list.get(i);}
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.println("        \t"+time);
    }

    public void setTimer()
    {
        int i = 0;
        Instant start = Instant.now();
        for(i = 0; i <60000; i++) {arr.set(i, "i+1");}
        Instant finish = Instant.now();
        long time = Duration.between(start, finish).toMillis();
        System.out.print("set   \t"+i+"   \t"+time);

        start = Instant.now();
        for(i = 0; i <60000; i++) {list.set(i, "i+1");}
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.println("        \t"+time);
    }

    public void containsTimer()
    {
        int i = 0;
        Instant start = Instant.now();
        for(i = 0; i <60000; i++) {arr.contains("i");}
        Instant finish = Instant.now();
        long time = Duration.between(start, finish).toMillis();
        System.out.print("contains"+i+"   \t"+time);

        start = Instant.now();
        for(i = 0; i <60000; i++) {list.contains("i");}
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.println("         \t"+time);
    }

    public void sizeTimer()
    {
        int i = 0;
        Instant start = Instant.now();
        for(i = 0; i <60000; i++) {arr.size();}
        Instant finish = Instant.now();
        long time = Duration.between(start, finish).toMillis();
        System.out.print("size  \t"+i+"   \t"+time);

        start = Instant.now();
        for(i = 0; i <60000; i++) {list.size();}
        finish = Instant.now();
        time = Duration.between(start, finish).toMillis();
        System.out.println("        \t"+time);
    }
}
