package ListClass;

public class MyList<T> {
    private T[] genericArray;
    private int capacity;

    public MyList(){
        setCapacity(10);
        setGenericArray(new Object[getCapacity()]);
    }

    public MyList(int capacity){
        setCapacity(capacity);
        setGenericArray(new Object[getCapacity()]);
    }
    public void add(T data){
        checkCapacity(1);
        getGenericArray()[size()] = data;
    }

    public void checkCapacity(int number){
        if (number > (getCapacity() - size())){
            doubleCapacity();
            checkCapacity(number);
        }
    }

    public int size(){
        int counter = 0;
        for (int i = 0; i < getCapacity(); i++){
            if (getGenericArray()[i] != null){
                counter++;
            }
        }
        return counter;
    }

    public void doubleCapacity(){
        T[] tempArray = getGenericArray();

        setCapacity(getCapacity() * 2);
        setGenericArray(new Object[getCapacity()]);

        int i = 0;
        for(T item : tempArray){
            getGenericArray()[i] = item;
            i++;
        }
    }

    public T get(int index){
        if (getGenericArray()[index] == null){
            return null;
        }
        T value = getGenericArray()[index];
        return value;
    }

    public void remove(int index){
        if (getGenericArray()[index] != null){
            getGenericArray()[index] = null;

            int i = 0;
            for(i = index + 1; i == size(); i++){
                getGenericArray()[i - 1] = getGenericArray()[i];
            }
        }
    }

    public void set(int index, T data){
        if (getGenericArray()[index] != null){
            getGenericArray()[index] = data;
        }
    }

    @Override
    public String toString() {
        String list = "[";
        boolean firstItem = true;

        for (T item : getGenericArray()) {
            if (item != null) {
                if (!firstItem) {
                    list += ", ";
                } else {
                    firstItem = false;
                }
                list += item;
            } else {
                break;
            }
        }
        list += "]";

        return list;
    }

    public int findIndex(T data){
        int index = -1;
        for (T i : getGenericArray()){
            index++;
            if (i == data){
                return index;
            }
        }
        return -1;
    }

    public int findLastIndex(T data){
        int index = -1;
        int lastIndex = -1;

        for (T i : getGenericArray()){
            index++;
            if (i == data){
                lastIndex = index;
            }
        }
        return lastIndex;
    }

    public boolean isEmpty(){
        boolean isEmpty = true;

        for(T i : getGenericArray()){
            if (i != null){
                isEmpty = false;
                break;
            }
        }
        return isEmpty;
    }

    public T[] toArray(){
        T[] newArray = (T[]) new Object[size()];
        for (int i = 0; i < size(); i++){
            newArray[i] = getGenericArray()[i];
        }
        return newArray;
    }

    public void clear(){
        for (int i = 0; i < size(); i++){
            getGenericArray()[i] = null;
        }
    }

    public MyList<T> subList(int start,int finish){
        if(start>=0 && finish>=0){
            if(start<=this.getCapacity() && finish<=this.getCapacity()){
                int size = finish - start + 1;

                MyList<T> myList = new MyList<>(size);
                for(int i = start; i <= finish; i++){
                    myList.add(get(i));
                }
                return myList;
            }
        }return null;
    }

    public boolean contains(T data){
        boolean isContains = false;
        for (int i = 0; i <= size(); i++){
            if(getGenericArray()[i] == data){
                isContains = true;
            }
        }return isContains;
    }



    public T[] getGenericArray() {
        return genericArray;
    }

    public void setGenericArray(Object[] genericArray) {
        this.genericArray = (T[]) genericArray;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
