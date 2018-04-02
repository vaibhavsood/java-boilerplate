import java.util.*;

class Trial {
  public static void main(String[] args) {
    Map<String, Integer> m = new HashMap<>();
    
    m.put("India", 3);
    m.put("Pakistan", 0);
    m.put("United States", 1);
    
    for (String key : m.keySet())
      System.out.println("key:" + key);
    
    for (Integer val : m.values())
      System.out.println("value:" + val);
    
    for (Map.Entry<String, Integer> es : m.entrySet())
      System.out.println("key, value" + es.getKey() + "," + es.getValue());
  }
}