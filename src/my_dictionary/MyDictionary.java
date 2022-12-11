package my_dictionary;

import java.util.Arrays;

public class MyDictionary <K,V>{
    private static final int DEFAULT_CAPACITY = 10;
    private int currentCapacity = DEFAULT_CAPACITY;
    private int size = 0;

    private K key;

    private V value;

    public MyDictionary() {
    }

    public MyDictionary(K key, V value) {
        this.key = key;
        this.value = value;
    }

    private MyDictionary<K,V> []  elementData = new  MyDictionary [currentCapacity];

    public MyDictionary <K,V> [] add(K argument1, V argument2) {
        if (currentCapacity == size) increaseCapacity();
        elementData[size] = new MyDictionary(argument1,argument2);
        size++;
        return elementData;
    }

    private void increaseCapacity() {
        currentCapacity += 10;
        elementData = Arrays.copyOf(elementData, currentCapacity);
    }

    public MyDictionary <K,V> getPair(int index) {
        if (index<size)
            return elementData [(index)];
        else throw new IndexOutOfBoundsException("Індекс більше розміру списку");
    }

    public int size() {
        return size;
    }

    public K getKey()        {
        return key;
    }
    public V getValue()      {
        return value;
    }

    @Override
    public String toString() {
        return "key=" + key +
                ", value=" + value;
    }
}
