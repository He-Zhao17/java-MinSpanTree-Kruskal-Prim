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
        size++;
        MHNode[] old = heapArr;
        heapArr = new MHNode[size];
        for (int i = 0; i < size - 1; i++) {
            heapArr[i] = old[i];
        }
        heapArr[size - 1] = new MHNode(nodeId, priority);

        // up
        int pointer = size - 1;
        while ((pointer - 1) / 2 >= 0) { // fater Node >= 0
            if (heapArr[pointer].cost < heapArr[(pointer - 1) / 2].cost) {
                MHNode temp = heapArr[pointer];
                heapArr[pointer] = heapArr[(pointer - 1) / 2];
                heapArr[(pointer - 1) / 2] = temp;
            }
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
