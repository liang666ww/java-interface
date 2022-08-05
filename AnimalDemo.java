package 猫和狗接口实现;

public class animalDemo {
    public static void main(String[] args) {
//        创建对象，调用方法
        jumpping j = new cat();
        j.jump();
        System.out.println("--------");


//          创建对象，调用方法
        Animal c = new cat();
        c.setName("jiafei");
        c.setAge(10);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        //父承子
        cat cc = (cat) c;
        cc.jump();
        System.out.println("--------");


//        最常用，因为它里面有最多的方法
        cat ccc = new cat();
        ccc.jump();
        ccc.eat();
        ccc.setName("jiafei");
        ccc.setAge(100);
        System.out.println(ccc.getName() + "," + ccc.getAge());

    }
}
