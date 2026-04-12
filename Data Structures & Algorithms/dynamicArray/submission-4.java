class DynamicArray {
    private Integer[] arr;
    private int capacity;
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        if(capacity > 0)
            arr = new Integer[capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == null){
                arr[i] = n;
                return;
            }
        }
        resize();
        arr[getSize()] = n;
    }

    public int popback() {
        int index = getSize() - 1;
        int v = arr[index];
        arr[index] = null;
        return v;
    }

    private void resize() {
        Integer[] arr2 = new Integer[2*arr.length];
        for(int i = 0; i<arr.length; i++){
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    public int getSize() {
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != null){
                counter++;
            }
            else{
                return counter;
            }
        }
        return counter;
    }

    public int getCapacity() {
        return arr.length;
    }
}
