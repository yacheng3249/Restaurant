package week3.restaurant;

/**
 * 用linkedList實作一個Queue
 */
public class LinkedListQueue {

    /**
     * Node類別
     */
    private static class Node {
        /**
         * Human資料
         */
        private Human data;
        /**
         * 下一個Node的記憶體位置
         */
        private Node next;

        /**
         * 無參數建構子
         */
        public Node() {
        }

        /**
         * 有顧客資料的建構子
         *
         * @param data
         */
        public Node(Human data) {
            this.data = data;
        }

        /**
         * Human getter
         *
         * @return Human
         */
        public Human getData() {
            return data;
        }
    }

    /**
     * 最初的節點
     */
    private Node root;
    /**
     * 計算root後所有的節點數量
     */
    private int count;
    /**
     * 最後的節點
     */
    private Node lastNode;

    /**
     * 建構子
     */
    public LinkedListQueue() {
        root = new Node();
        count = 0;
        lastNode = root;
    }

    /**
     * 新贈Human在鏈結串列的尾端
     * @param data
     */
    public void add(Human data) {
        /* 效率較差
        Node temp = root;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        count++;
        */

        //有效率的寫法
        lastNode.next = new Node(data);
        lastNode = lastNode.next;
        count++;
    }

    /**
     * 移除鏈結串列最前端有資料的節點回傳
     * @return Human
     */
    public Human remove() {
        Node firstData;
        if (root != lastNode) {
            firstData = root.next;
        } else {
            return null;
        }
        root.next = root.next.next;
        count--;
        return firstData.getData();
    }

    /**
     * 插入Human到第i格中
     * @param index
     * @param data
     */
    public void insert(int index, Human data) {
        if (index < 0 || index > count){
            return;
        }
        if (index == count) {
            add(data);
        } else {
            Node temp = root;
            //temp設為index前面的Node
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            //取得原本index的Node做保留
            Node indexOldNode = temp.next;
            //創建新的Node並讓temp接上
            Node indexNewNode = new Node(data);
            temp.next = indexNewNode;
            //接著讓新Node接上index的舊Node
            indexNewNode.next = indexOldNode;
        }
        count++;
    }

    /**
     * 刪除指定元素
     * @param index
     */
    public void delete ( int index){
        if (index < 0 || index >= count) {
            return;
        } else {
            LinkedListQueue.Node temp = root;
            //temp設為index前面的Node
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    /**
     * 判斷隊伍是否為空
     */
    public boolean isEmpty() {
        return root.next == null;
    }
}
