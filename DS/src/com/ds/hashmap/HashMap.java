package com.ds.hashmap;

public class HashMap<K, V>
{
    EntryObj<K, V> table[] = null;

    public HashMap()
    {
        table = new EntryObj[100];
    }

    public void put(K key, V value)
    {
        if (key == null)
            return;
        int index = getHashCode(key);
        storeValue(index, key, value);

    }

    private void storeValue(int index, K key, V value)
    {
        EntryObj<K, V> list = table[index];

        if (list == null)
        {
            table[index] = new EntryObj<K, V>(key, value);
        }
        else
        {
            boolean done = false;

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
            {
                list.next = new EntryObj<K, V>(key, value);
            }
        }
    }
    
  public V get(K key)
    {
        if (key == null)
            return null;
        int index = getHashCode(key);
        EntryObj<K, V> list = table[index];
        return getValue(key, list);
    }

    private V getValue(K key, EntryObj<K, V> list)
    {
        if (list == null)
            return null;
        while (list != null)
        {
            if (list.getKey().equals(key))
                return list.getValue();
            list = list.next;
        }
        return null;

    }

    public int getHashCode(K key)
    {
        int has = key.hashCode();
        return has % 100;
    }

}

class EntryObj<K, V>
{
    K key;

    V value;

    EntryObj<K, V> next = null;

    public EntryObj(K key, V value)
    {
        this.key = key;
        this.value = value;
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

    public EntryObj<K, V> getNext()
    {
        return next;
    }

    public void setNext(EntryObj<K, V> next)
    {
        this.next = next;
    }

}