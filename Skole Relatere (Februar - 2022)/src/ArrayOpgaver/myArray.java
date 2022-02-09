package ArrayOpgaver;

import java.util.Arrays;

public class myArray<T>
{

    private Object[] arr;
    private int arrayLength = 10;
    private int elements = 0;
    private int size;

    public myArray(){
        arr = new Object[10];
        size = size+1;
    }

    public int getElements(){
        return elements;
    }

    public T get(int index){
        return (T) arr[index];
    }

    public void add(T x){
        if(elements < arr.length){
            arr[elements] = x;
            elements++;
        }
        else{
            increaseArrayLength();
            arr[elements] = x;
            elements++;
        }
    }

    public void add(int index){}
    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;
        for (int i=index; i < size; i++) {
            arr[index] = arr[index+1];
        }
    return true;
    }


    public void clear(){

    }

    private void increaseArrayLength(){
    int length = arr.length;
    Object[] arr2 = new Object[length+10];


        for (int i = 0; i < (arr.length); i++) {
            arr2[i] = arr[i];
        }

      arr = arr2;



    }


    public String toString() {
        String str;

        str = "[";
        for (int i = 0; i < elements; i++) {
           str = str + arr[i];
           str = ", ";
        }
        str = str + "]";
        return str;
    }
}
