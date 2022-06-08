package week3.restaurant;

import java.util.Random;

/**
 * 輸入類別
 */
public class Input {
    /**
     * 創建Random
     */
    Random randomData = new Random();

    /**
     * 隨機產生數字
     * @return 數字
     */
    public int getNumber() {
        final int MAX_NUM = 201;
        int num = randomData.nextInt(MAX_NUM);
        return num;
    }

    /**
     * 隨機產生字串
     * @return 字串
     */
    public String getString() {
        //字串長度
        final int STRING_LENGTH = 5;
        //字母總數
        final int ENGLISH_LETTERS = 26;
        //字母小寫開始ASCII數
        final int ENGLISH_ASCII_NUM = 97;
        char[] text = new char[STRING_LENGTH];
        for (int i = 0; i < STRING_LENGTH; i++) {
            int letter = randomData.nextInt(ENGLISH_LETTERS) + ENGLISH_ASCII_NUM;
            text[i] = (char) letter;
        }
        return new String(text);
    }

    /**
     * 隨機產生餐點
     * @return 餐點
     */
    public String getMeal() {
        String[] meals = {"Chicken Meal", "Beef Meal", "Seafood Meal", "Lamb Meal", "Children Meal", "Today's Special Meal"};
        int randomIndex = randomData.nextInt(meals.length);
        return meals[randomIndex];
    }
}
