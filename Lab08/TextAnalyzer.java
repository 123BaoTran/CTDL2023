package Lab08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class TextAnalyzer {
   // <word, its positions>
private Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
//load words in the text file given by fileName and store them into map by using add method in Task 2.1.
// Using BufferedReader as in file TextFileUtils.java
public void load(String fileName) throws IOException {

   BufferedReader r = new BufferedReader(new FileReader(fileName));
   String line = null;
   int index = 1;
   while(true){
    line = r.readLine(); //null
    if(line == null) break;
    StringTokenizer token = new StringTokenizer(line," ");
    while(token.hasMoreTokens()){
        String word = token.nextToken();
        if(!token.hasMoreTokens())
        add(word, - index);
        else
        add(word,index);
        index ++;
    
    }
   } 
   System.out.println(map);
   r.close();

   }
private void add(String word, int position) {
    if(map.containsKey(word)){
        ArrayList<Integer> values= map.get(word);
        values.add(position);
    }else{
        ArrayList<Integer> values = new ArrayList<>();
        values.add(position);
        map.put(word, values);

}
}
public void displayWords() { 
    TreeMap<String,ArrayList<Integer>> re = new TreeMap<>(new Comparator<String>() {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
        
    });
    re.putAll(map);
    System.out.println(re);
}
public void displayText() { 
    Map<Integer,String> tmp = new HashMap<>();
    Iterator<Map.Entry<String,ArrayList<Integer>>> iter = map.entrySet().iterator();
    while (iter.hasNext()){
        Map.Entry<String,ArrayList<Integer>> next = iter.next();
        String key = next.getKey();
        ArrayList<Integer> values = next.getValue();
        for(int index:values){
            tmp.put(index, key);
        }
    }
    Set<Integer> keys = tmp.keySet();
    for(int k : keys){
        if(k<0)
        System.out.println(tmp.get(k) + "\n");
        else
        System.out.println(tmp.get(k) + " ");
        
    }
}
public String mostFrequentWord() { 
    String re = null;
    int max =  0;
    Set<String> keys = map.keySet();
    for(String key: keys){
        ArrayList<Integer> values = map.get(key);
        if(values.size() > max){
            max = values.size();
            re = key;
        }
    }
    return re; 
}
}





