/**
 * receives two generic type parameters. The first type parameter, K,
 * represents the type of keys, the second, V, represents the type of values.
 * */

public class Entry <K,V>{
    K key;
    V value;

    /**
     * constructor
     * which initializes the two attributes accordingly
     * */
    Entry (K key,V value){
        this.key = key;
        this.value = value;
    }
    /**
     * getter for both attributes
     * @return key
     * @return value
     * */
    public K getKey(){
        return this.key;
    }
    public V getValue(){
        return this.value;
    }
}
