package calculadora;

public interface Mementable<T>{
    
    public T crearMemento();
    public void restaurarMemento(T memento);

}
