package test;

/**
 * @author wnn
 * @date 2021/3/23-19:34
 * @descriptuion
 */
public class Test {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        spring.showInfo();
        Season winter = Season.WINTER;
        winter.showInfo();

    }

}
enum Season{
    SPRING("春天","喜欢波波"),
    SUMMER("夏天","喜欢波波"),
    AUTUMN("秋天","喜欢波波"),
    WINTER("冬天","喜欢波波");
    private final String name;
    private final String desc;
    private Season(String name,String desc){
        this.name = name;
        this.desc = desc;
    }

    public void showInfo(){
        System.out.println(this.name+'\t'+this.desc);
    }

}

