package es.upm.mssde.pokedex;

public interface MyObservable {
    void addObserver(MyObserver myObserver);
    void removeObserver(MyObserver myObserver);
    void notifyObserversPokemonData();
}