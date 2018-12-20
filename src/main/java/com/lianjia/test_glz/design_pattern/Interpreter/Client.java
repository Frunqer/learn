package com.lianjia.test_glz.design_pattern.Interpreter;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午5:15 2018/11/28
 * @Modified By:
 */
public class Client {

    /**
     * 构建解析树
     * @return
     */
    public static Expression buildInterpreterTree() {
        //Literal
        Expression terminal1 = new TerminalExpression("A");
        Expression terminal2 = new TerminalExpression("B");
        Expression terminal3 = new TerminalExpression("C");
        Expression terminal4 = new TerminalExpression("D");
        // B C
        Expression alternation1 = new OrExpression(terminal2,terminal3);
        // A Or (B C)
        Expression alternation2 = new OrExpression(terminal1,alternation1);
        // D And (A Or (B C))
        return new AndExpression(terminal4,alternation2);
    }

    public static void main(String[] args) {
        Expression define = buildInterpreterTree();
        String context1 =  "D A";
        String context2 =  "A B";
        System.out.println(define.interpret(context1));
        System.out.println(define.interpret(context2));
    }
}
