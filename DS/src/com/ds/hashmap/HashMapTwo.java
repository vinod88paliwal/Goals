package com.ds.hashmap;

public class HashMapTwo<K, V>
{
    private final static int INITICAL_CAPACITY = 10;

    private final static float DEFAULT_LOAD_FACTOR = 0.75f;

    EntryTwo<K, V> table[] = null;

    public HashMapTwo()
    {
        table = new EntryTwo[INITICAL_CAPACITY];
    }

    public void put(K key, V value)
    {
        if (key == null)
            return;
        int index = getHas(key);

        if (table[index] == null)
        {
            table[index] = new EntryTwo<K, V>(key, value, null);
        }
        else
        {
            boolean done = false;

            EntryTwo<K, V> list = table[index];
            while (list.next != null)
            {
                if (list.getKey().equals(key))
                {
                    list.setValue(value);
                    done = true;
                    return;
                }
                list = list.next;

            }
            if (!done)
                list.next = new EntryTwo<K, V>(key, value, null);
        }

    }

    private int getHas(K key)
    {
        int index = key.hashCode();
        return index % 100;
    }

    class EntryTwo<K, V>
    {
        K key;

        V value;

        EntryTwo<K, V> next = null;

        public EntryTwo(K key, V value, EntryTwo<K, V> next)
        {
            this.key = key;
            this.value = value;
            this.next = next;

        }

        public K getKey()
        {
            return key;
        }

        public void setKey(K key)
        {
            this.key = key;
        }

        public V getValue()
        {
            return value;
        }

        public void setValue(V value)
        {
            this.value = value;
        }

        public EntryTwo<K, V> getNext()
        {
            return next;
        }

        public void setNext(EntryTwo<K, V> next)
        {
            this.next = next;
        }

    }

}
