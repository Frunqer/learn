package com.lianjia.test_glz.design_pattern.Interpreter;

import java.util.StringTokenizer;

/**
 * @Author: guiliangzhou
 * @Description:
 * @Date: Created in 下午3:39 2018/11/28
 * @Modified By:
 */
public class TerminalExpression extends Expression{

    public String literal = null;

    public TerminalExpression(String str) {
        literal = str;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s.equals(literal)) {
               return true;
            }
        }
        return false;
    }
}
