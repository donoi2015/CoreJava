package headfirstdp.designpatterns.ind9Combined1p501.observe;

public interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers();
}
