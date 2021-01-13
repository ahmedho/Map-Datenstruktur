public class MutableMap <K, V> extends AbstractReadableMap<K, V> implements WritableMap<K, V> {
    /**
     * If an array entry is zero or whose key corresponds to the key parameter,
     * overwrite this array entry with a newly created Entry object which contains the key parameter as the key
     * and the value parameter as the value
     * If not, make a larger array twice the size
     * copy the previous array entries into the new array and assign this new array to the entries attribute
     * @param key, K parameter
     * @param value , V parameter
     * terminate the methode with return;
     * */
    public void put (K key, V value){
        for (int i = 0 ; i < entries.length ; i++)
            if (entries[i] == (null) || entries[i].getKey().equals(key)) {
                Entry<K, V> entry = new Entry<>(key, value);
                entries[i] = entry;
                return;
            } else {
                entries = GenericArrayHelper.copyArrayWithIncreasedSize(entries, 2 * entries.length);
            }
    }
}
