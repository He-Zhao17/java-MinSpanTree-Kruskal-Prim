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

    }

    public void insert (int nodeId, int priority) {

    }

    public int removeMin() {

    }

    public void reduceKey (int nodeId, int newPriority) {

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
