package week3.restaurant;

public class Main {
    public static void main(String[] args) {
        /** 創建Input */
        Input dataInput = new Input();
        /** Human數量 */
        final int HUMAN_NUMBER = 10;

        /** 創建ArrayQueue */
        ArrayQueue humanQueue1 = new ArrayQueue();

        System.out.println("使用ArrayQueue");

        /** 隨機產生10個Human並加入humanQueue1 */
        for (int i = 0; i < HUMAN_NUMBER; i++) {
            humanQueue1.add(new Human(dataInput.getString(), dataInput.getNumber(), dataInput.getMeal()));
        }
        /** 印出廚房要準備餐點 */
        while (!humanQueue1.isEmpty()) {
            System.out.println(humanQueue1.remove().getMeal());
        }

        System.out.println("..........................");

        /** 創建LinkedListQueue */
        LinkedListQueue humanQueue2 = new LinkedListQueue();

        System.out.println("使用LinkedListQueue");

        /** 隨機產生10個Human並加入humanQueue2 */
        for (int i = 0; i < HUMAN_NUMBER; i++) {
            humanQueue2.add(new Human(dataInput.getString(), dataInput.getNumber(), dataInput.getMeal()));
        }

        /** 印出廚房要準備餐點 */
        while (!humanQueue2.isEmpty()) {
            System.out.println(humanQueue2.remove().getMeal());
        }
    }
}
