package priorityQueue;

/** A priority queue: represented by the min heap.
 *  Used in Prim's algorithm. */
public class MinHeap {
    // FILL IN CODE
    private MHNode[] heapArr;
    private int[] posArr;
    private int size;

    // get & set
    public MHNode[] getHeapArr() {
        return heapArr;
    }
    public int[] getPosArr() {
        return posArr;
    }
    public int size() {
        return size;
    }



    public MinHeap () {
        size = 0;
        heapArr = new MHNode[size];
        posArr = new int[size];
    }

    public void insert (int nodeId, int priority) {
        this.size++;
        MHNode[] old = heapArr;
        heapArr = new MHNode[this.size];
        for (int i = 0; i < this.size - 1; i++) {
            heapArr[i] = old[i];
        }
        heapArr[size - 1] = new MHNode(nodeId, priority);

        // up
        int pointer = this.size - 1;
        while ((pointer - 1) / 2 >= 0 && heapArr[pointer].cost < heapArr[(pointer - 1) / 2].cost) { // fater Node >= 0
            swap(pointer, (pointer - 1) / 2);
            pointer = (pointer - 1) / 2;
        }

        // update posArr
        int max = 0;
        for (MHNode k : heapArr) {
            if (max < k.id) {
                max = k.id;
            }
        }
        posArr = new int[max];
        for (int i = 0; i < this.size; i++) {
            posArr[heapArr[i].id] = i;
        }
    }

    public int removeMin() {

    }

    public void reduceKey (int nodeId, int newPriority) {

    }




    // private functions
    private void swap (int id1, int id2) {
        try {
            MHNode temp = heapArr[id1];
            heapArr[id1] = heapArr[id2];
            heapArr[id2] = temp;
        } catch (Exception ex) {
            ex.getMessage();
        }
    }


    class MHNode {
        public int id;
        public int cost;

        public MHNode(int d, int ost) {
            id = d;
            ost = cost;
        }
    }



}
