public class myArray {

    private int[] arr;
    private int arrayLength = 10;
    private int elements = 0;

    public myArray(){
        arr = new int[arrayLength];
    }

    public int getElements(){
        return elements;
    }

    public int get(int index){
        return arr[index];
    }

    public void add(int x){
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

    private void increaseArrayLength(){
    int length = arr.length;
    int[] arr2 = new int[length+10];


        for (int i = 0; i < (arr.length); i++) {
            arr2[i] = arr[i];
        }

      arr = arr2;



    }
}
