package hashmaps.implementcustomhashmap;


import java.util.LinkedList;

class CustomHashMap<K, V> {
    private static final int CAPACITY = 10; // Number of buckets
    private LinkedList<Entry<K, V>>[] buckets;

    public CustomHashMap() {
        buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    // Hash function to get bucket index
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % CAPACITY);
    }

    // Put key-value pair in HashMap
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing key
                return;
            }
        }

        bucket.add(new Entry<>(key, value)); // Insert new key-value pair
    }

    // Get value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null; // Key not found
    }

    // Remove key-value pair
    public void remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entry<K, V>> bucket = buckets[index];

        bucket.removeIf(entry -> entry.key.equals(key));
    }

    // Entry class to store key-value pairs
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(11, "Mango"); // Collision with 1 (since 11 % 10 == 1)

        System.out.println("Key 1: " + map.get(1)); // Output: Apple
        System.out.println("Key 2: " + map.get(2)); // Output: Banana
        System.out.println("Key 11: " + map.get(11)); // Output: Mango

        map.remove(1);
        System.out.println("Key 1 after removal: " + map.get(1)); // Output: null
    }
}


