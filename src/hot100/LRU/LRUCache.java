package hot100.LRU;

import com.sun.javafx.image.IntPixelGetter;

import javax.security.auth.login.CredentialNotFoundException;
import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @Author: XF-DD
 * @Date: 20/08/15 20:32
 */
public class LRUCache {

    class Entry{
        Integer key;
        Integer value;
        Entry pre;
        Entry next;
    }

    Entry head;
    Entry tail;
    int size;
    HashMap<Integer,Entry> map;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        size = capacity;
        head = new Entry();
        tail = new Entry();
        head.next = tail;
        tail.pre = head;
    }

    private void removeEntry(Entry entry){
        entry.pre.next = entry.next;
        entry.next.pre = entry.pre;
    }

    private void addEntry(Entry entry){
        tail.pre.next = entry;
        entry.pre = tail.pre;
        entry.next = tail;
        tail.pre = entry;
    }

    public int get(int key) {
        if(map.get(key) == null){
            return -1;
        }
        Entry entry = map.get(key);
        removeEntry(entry);
        addEntry(entry);
        return entry.value;
    }

    public void put(int key, int value) {
        Entry entry = new Entry();
        entry.key = key;
        entry.value = value;

        Entry oldEntry = map.get(key);
        if(oldEntry != null){
            removeEntry(oldEntry);
            oldEntry.value = value;
            addEntry(oldEntry);
        }

        if(map.size() == size){
            map.remove(head.next.key);
            removeEntry(head.next);
        }
        map.put(key,entry);
        addEntry(entry);
    }

}
