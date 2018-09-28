package com.ds.hashmap;

public class HashMapOne<K, V>
{
    private Entry<K, V>[] table;

    private int capacity = 4;

    static class Entry<K, V>
    {
        K key;

        V value;

        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next)
        {
            this.key = key;
            this.value = value;
            this.next = next;
        }
        
        public int hashCode() {
            return (key==null   ? 0 : key.hashCode()) ^
                   (value==null ? 0 : value.hashCode());
        }


    }

    public HashMapOne()
    {
        table = new Entry[capacity];
    }

    public void put(K key, V value)
    {
        if (key == null)
            return;

        int hash = key.hashCode();

        Entry<K, V> newEntry = new Entry<K, V>(key, value, null);

        if (table[hash] == null)
        {
            table[hash] = newEntry;
        }
        else
        {
            Entry<K, V> previous = null;
            Entry<K, V> current = table[hash];

            while (current != null)
            {
                if (current.key.equals(key))
                {
                    if (previous == null)
                    {
                        newEntry.next = current.next;
                        table[hash] = newEntry;
                        return;
                    }
                    newEntry.next = current.next;
                    previous.next = newEntry;
                    return;

                }

                previous = current;
                current = current.next;

            }
            previous.next = newEntry;

        }

    }
    
    private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }
    
    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
