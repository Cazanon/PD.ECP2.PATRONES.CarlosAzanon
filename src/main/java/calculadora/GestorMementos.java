package calculadora;

import java.util.HashMap;
import java.util.Map;

public class GestorMementos {
    private Map<String, Comando> comandos = new HashMap<>();

    public void add(Comando comando) {
        this.comandos.put(comando.name(), comando);
    }

    public void execute(String key) {
        this.comandos.get(key).execute();
    }

    public String[] keys() {
        return this.comandos.keySet().toArray(new String[0]);
    }
}
