package week3.restaurant;

/**
 * 用array實作一個Queue
 */
public class ArrayQueue {
    /** 最初humanArray的長度 */
    private int INITIAL_ARRAY_SIZE = 5;
    /** queue的容器 */
    private Human[] humanArray = new Human[INITIAL_ARRAY_SIZE];
    /**
     * 隊伍裡第一個人前面的索引
     * humanArray為空因此front=-1
     */
    private int front = -1;
    /**
     * 隊伍裡最後一人的索引
     * humanArray為空因此rear=-1
     */
    private int rear = -1;

    /**
     * 新增Human到humanArray裡
     */
    public void add(Human data) {
        if (rear == humanArray.length - 1) {
            doubleArray();
        }
        humanArray[++rear] = data;
    }

    /**
     * 從humanArray取出一個Human
     */
    public Human remove() {
        if (isEmpty()) {
            return null;
        }
        return humanArray[++front];
    }

    /**
     * 插入Human到humanArray的第i格中
     */
    public void insert(int index, Human data) {
        //將index後的人都往後移一格並從最後一人開始移
        for (int i = ++rear; i > index; i--) {
            if (rear == humanArray.length - 1) {
                doubleArray();
            }
            humanArray[i] = humanArray[i - 1];
        }
        //在指定index裡插入指定Human
        humanArray[index] = data;
    }

    /**
     * 判斷隊伍是否為空
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 加長humanArray空間
     */
    private void doubleArray() {
        Human[] newArray = new Human[humanArray.length * 2];
        for (int i = 0; i < humanArray.length; i++) {
            newArray[i] = humanArray[i];
        }
        humanArray = newArray;
    }
}
