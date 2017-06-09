package headfirstdp.designpatterns.ind0practice.observer;

interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}