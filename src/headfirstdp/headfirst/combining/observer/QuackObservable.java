package headfirstdp.headfirst.combining.observer;

interface QuackObservable {
    void registerObserver(Observer observer);

    void notifyObservers();
}
