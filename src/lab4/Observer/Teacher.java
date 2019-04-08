package lab4.Observer;

public class Teacher implements ObservedSubject {
    private Observer[] observers = new Observer[10];
    private int size = 0;


    @Override
    public void register(Observer obj) {
        observers[size] = obj;
        size++;
    }

    @Override
    public void unregister(Observer obj) {
        for (int i = 0; i < size; i++) {
            if (observers[i] == obj) {
                deleteObserver(i);
                break;
            }
        }
    }

    @Override
    public void notifyObserver(String message) {
        for (int i = 0; i < size; i++) {
            observers[i].update(message);
        }
    }

    private void deleteObserver(int position) {
        for (int i = position; i < size - 1; i++) {
            observers[i] = observers[i + 1];
        }
        observers[size] = null;
        size--;
    }
}
