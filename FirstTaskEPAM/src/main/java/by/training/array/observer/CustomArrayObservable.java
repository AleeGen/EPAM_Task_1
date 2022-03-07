package by.training.array.observer;

public interface CustomArrayObservable<CustomArrayObserver> {
    void attach(CustomArrayObserver observer);

    void detach(CustomArrayObserver observer);

    void notifyObservers();
}
