import java.util.Set;

public interface ReadableMap  <K, V>{

    /**
     * @param key, as K parameter
     * @return V;
     * @throws UnknownKeyException, f no value is assigned
     * */
      V getOrThrow (K key) throws UnknownKeyException;

      /**
       * @return value of type ImmutableMap<K,V></>*/
     ImmutableMap<K, V> asImmutableMap();
      Set<K> keysAsSet();
}
