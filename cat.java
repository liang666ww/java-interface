package 猫和狗接口实现;

public class cat extends Animal implements jumpping {
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }


    //重写多态中的抽象方法
    @Override
        public void eat() {
            System.out.println("猫吃鱼");

    }


    //重写接口中的抽象方法
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
