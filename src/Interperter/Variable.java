package Interperter;

/**
 * @Title 封装变量的类
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Variable extends AbstractExpression{
//   声明储存变量的成员变量
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getvalue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
