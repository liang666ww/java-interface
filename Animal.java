package 猫和狗接口实现;

public abstract class Animal {
    private String name;
    private int age;

    //无参构造方法
    public Animal() {
    }
    //有参构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}
