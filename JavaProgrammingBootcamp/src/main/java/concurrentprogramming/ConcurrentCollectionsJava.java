package concurrentprogramming;

import java.util.List;
import java.util.concurrent.*;

public class ConcurrentCollectionsJava {

    public static void main(String[] args) {

        ConcurrentMap<String, String> sprachenMap = new ConcurrentHashMap<>();

        sprachenMap.put("gaesigua", "Deutsch");
        sprachenMap.put("tin", "Java");

        for (String key: sprachenMap.keySet()){

            System.out.println(key + " prefers " + sprachenMap.get(key));
        }

        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        try{
            queue.put("Message Eins");
            String message = queue.take();

            System.out.println("Message taken: " + message);

        } catch (InterruptedException e) {

            Thread.currentThread().interrupt();
        }

        ConcurrentNavigableMap<String, String> map = new ConcurrentSkipListMap<>();

        map.put("C", "Couch");
        map.put("A", "Apfel");
        map.put("B", "Banane");

        map.descendingMap().forEach((key,value)-> System.out.println(key + " -> " + value) );

        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Eins");
        list.add("Zwei");

        for (String zahl: list){
            System.out.println(zahl);
        }
    }
}
