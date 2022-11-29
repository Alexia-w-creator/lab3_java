import java.util.ArrayList;
import java.util.LinkedList;

import org.apache.commons.lang3.time.StopWatch;

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
        int i = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(i = 0; i <60000; i++) {arr.add("i");}
        stopWatch.stop();
        System.out.print("add    \t"+i+"      \t"+ stopWatch.getTime());

        stopWatch.reset();
        stopWatch.start();
        for(i = 0; i <60000; i++) {list.add("i");}
        stopWatch.stop();
        System.out.println("            \t"+stopWatch.getTime());
    }

    public void deleteTimer()
    {
        int i = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(i = 0; i <60000; i++) {arr.remove("i");}
        stopWatch.stop();
        System.out.print("remove \t"+i+"      \t"+ stopWatch.getTime());

        stopWatch.reset();
        stopWatch.start();
        for(i = 0; i <60000; i++) {list.remove("i");}
        stopWatch.stop();
        System.out.println("        \t"+stopWatch.getTime());
    }

    public void getTimer()
    {
        int i = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(i = 0; i <60000; i++) {arr.get(i);}
        stopWatch.stop();
        System.out.print("get    \t"+i+"      \t"+ stopWatch.getTime());

        stopWatch.reset();
        stopWatch.start();
        for(i = 0; i <60000; i++) {list.get(i);}
        stopWatch.stop();
        System.out.println("            \t"+stopWatch.getTime());
    }

    public void setTimer()
    {
        int i = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(i = 0; i <60000; i++) {arr.set(i, "i+1");}
        stopWatch.stop();
        System.out.print("set    \t"+i+"      \t"+ stopWatch.getTime());

        stopWatch.reset();
        stopWatch.start();
        for(i = 0; i <60000; i++) {list.set(i, "i+1");}
        stopWatch.stop();
        System.out.println("            \t"+stopWatch.getTime());
    }

    public void containsTimer()
    {
        int i = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(i = 0; i <60000; i++) {arr.contains("i");}
        stopWatch.stop();
        System.out.print("contains"+i+"      \t"+ stopWatch.getTime());

        stopWatch.reset();
        stopWatch.start();
        for(i = 0; i <60000; i++) {list.contains("i");}
        stopWatch.stop();
        System.out.println("            \t"+stopWatch.getTime());
    }

    public void sizeTimer()
    {
        int i = 0;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(i = 0; i <60000; i++) {arr.size();}
        stopWatch.stop();
        System.out.print("size   \t"+i+"      \t"+ stopWatch.getTime());

        stopWatch.reset();
        stopWatch.start();
        for(i = 0; i <60000; i++) {list.size();}
        stopWatch.stop();
        System.out.println("            \t"+stopWatch.getTime());
    }
}
