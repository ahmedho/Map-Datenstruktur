public interface WritableMap <K, V> extends ReadableMap <K, V> {
    /***
     *@param key, K-parameter key
     *@param value, V-parameter value
     */
    void put(K key, V value);
}

