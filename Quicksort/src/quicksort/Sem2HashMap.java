package quicksort;

import java.util.ArrayList;
import java.util.List;

/**
 * The purpose of Sem2HashMap is to...
 *
 * @author kasper
 */
public class Sem2HashMap {

    private KeyValuePair[] internal;

    public Sem2HashMap() {
        internal = new KeyValuePair[3];
    }

    public Address get(String key) {
        if (key.isEmpty()) {
            return null;
        } else {
            int index = key.hashCode() % internal.length;
            index = Math.abs(index);

            return internal[index].value;
        }
    }

    public void put(String key, Address value) {
        int index = key.hashCode() % internal.length;
        index = Math.abs(index);
        KeyValuePair kp = new KeyValuePair(key, value);

        internal[index] = kp;

    }

    public boolean containsKey(String key) {
        int index = key.hashCode() % internal.length;
        index = Math.abs(index);
        return internal[index] != null;
    }

    public int size() {
        int s = 0;
        for (int i = 0; i < internal.length; i++) {
            if (internal[i] != null) {
                s++;
            }
        }
        return s;
    }

    public List<Address> values() {
        ArrayList<Address> all = new ArrayList();
        for (int i = 0; i < internal.length; i++) {
            if (internal[i] != null) {
                all.add(internal[i].value);
            } else {
                return null;
            }
        }
        return all;
    }

    public void collision(String key, Address value) {
        int index = key.hashCode() % internal.length;
        index = Math.abs(index); //hashcode can give negative numbers, hence we use math absolute to get rid of it
        KeyValuePair kp = new KeyValuePair(key, value);
        int max = internal.length;

        if (internal[index] == null) {
            internal[index] = kp;
        } else {
            for (int i = 0; i < max; i++) {
                if (internal[i] == null) {
                    internal[i] = kp;
                    i = max;

                } else {
                    i++;
                }
            }
        }
    }
}
