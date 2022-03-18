package Interperter;

/**
 * @Title 加法表达式
 * @Time 2022年3月6日 20:25:32
 * @Author：yjh
 */
public class Plus extends AbstractExpression{
    private AbstractExpression left;
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context)+right.interpret(context);
    }

    @Override
    public String toString() {
        return "("+left.toString()+"+"+right.toString()+")";
    }
}
