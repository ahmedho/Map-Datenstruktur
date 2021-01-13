import java.util.HashSet;
import java.util.Set;

abstract class AbstractReadableMap <K, V >implements ReadableMap<K, V>{

    protected Entry<K, V>[] entries;
    /**
     * constructor
     * which receives a parameter of the type Entry <K, V> [], copies this array
     * and assign the copied array to the attribut
     * */
    AbstractReadableMap (Entry<K, V>[] entries){
        this.entries = GenericArrayHelper.copyArray(entries);
    }
    /**
     * Another constructor can be implemented without parameters
     * which initializes the attribute with an array of length 10
     * */
    AbstractReadableMap (){
        entries =GenericArrayHelper.newEntryArrayOfSize(10);
    }

    /**
     * If an array entry which is not null and whose key corresponds to the key parameter,
     *  @return the value of this array entry.
     *  If you do not nd such an array entry,
     *  @throw UnknownKeyException
     *  */
    @Override
    public V getOrThrow (K key)throws UnknownKeyException{
        for (Entry<K,V> obj : entries){
            if (key.equals(obj.getKey())&& obj.getValue() != null){
                return obj.getValue();
            }
        }
        throw new UnknownKeyException();
    }
    /**
     * @return map
     * */
    @Override
    public ImmutableMap<K, V> asImmutableMap(){
        ImmutableMap<K, V> map = new ImmutableMap<K, V>(entries);
        return map;
    }
    /**
     * create a new HashSet and insert all the keys of the current map there,
     * @return set, the created HashSet.
     * */
    @Override
    public Set<K> keysAsSet(){
        Set<K> set = new HashSet<K>();
        for (Entry<K, V> entry : entries){
            if (entry != null){
                set.add(entry.getKey());
            }
        }
        return set;
    }

}
