package com.lianjia.test_glz.design_pattern.Interpreter;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午5:09 2018/11/28
 * @Modified By:
 */
public class AndExpression extends Expression {

    private Expression expression1 = null;
    private Expression expression2 = null;

    public AndExpression (Expression expression1,Expression expression2) {
       this.expression1 = expression1;
       this.expression2 = expression2;
    }


    @Override
    public boolean interpret(String str) {
        return expression1.interpret(str) && expression2.interpret(str);
    }
}
