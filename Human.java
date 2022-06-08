package week3.restaurant;

/**
 * Human類別
 */
public class Human {
    /** 姓名 */
    private String name;
    /** 年齡 */
    private int age;
    /** 餐點 */
    private String meal;

    /**
     * 建構子
     * @param name
     * @param age
     * @param meal
     */
    public Human(String name, int age, String meal) {
        this.name = name;
        this.age = age;
        this.meal = meal;
    }

    /**
     * 取得meal
     * @return String meal
     */
    public String getMeal() {
        return meal;
    }
}
