public interface Subject {
    public void registerObserver(observer o);
    public void removeObserver( Observer o);
    public void notufyObservers(double novoCredito);
    
}