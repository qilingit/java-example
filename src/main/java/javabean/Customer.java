package javabean;

/**
 * JavaBean是一种Java语言写成的可重用组件。
 *
 * 所谓JavaBean，是指符合以下标准的Java类：
 *
 * - 类是公共的。
 * - 有一个无参的公共的构造器
 * - 有属性，且有对应的get、set方法
 * - Getter, Setter 可以用Lombok中的annotation 代替
 */
//@Getter
//@Setter
//@NoArgsConstructor
public class Customer {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
