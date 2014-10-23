package calculadora;

import java.util.SortedMap;
import java.util.TreeMap;

public class GestorMementos<T>{
    
    private SortedMap<String,T> mementos=new TreeMap<String,T>();

    public void addMemento(String key,T memento) {
        this.mementos.put(this.mementos.size()+": "+key, memento);
    }

    public T getMemento(String key) {
        return this.mementos.get(key);
    }

    public String[] keys() {
        return this.mementos.keySet().toArray(new String[0]);
    }
}
