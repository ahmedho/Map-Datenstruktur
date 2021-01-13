public class Launcher {
    public static void main(String[] args){
        MutableMap<String, Integer> map = new MutableMap<>();
        putEntries(map);
        printEntries(map);
        ImmutableMap<String, Integer> immutableMap = map.asImmutableMap();
        printEntries(immutableMap);
    }
    public static void putEntries (WritableMap<String, Integer> writableMap){
        writableMap.put("sizeInMB", 42);
        writableMap.put("version", 4);
        writableMap.put("yearOfRelease", 2015);
    }

    public static void printEntries(ReadableMap<String, Integer> readableMap){
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : readableMap.keysAsSet()){
            stringBuilder.setLength(0);
            stringBuilder = new StringBuilder();
            stringBuilder.append(key);
            stringBuilder.append(": ");
            try {
                stringBuilder.append(readableMap.getOrThrow(key));
                System.out.println(stringBuilder.toString());
            } catch (UnknownKeyException e){
                System.out.println("UnknownKeyException!!!");
            }
        }
    }
}
