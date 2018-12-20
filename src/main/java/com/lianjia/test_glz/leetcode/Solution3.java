package com.lianjia.test_glz.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @Author: guiliangzhou
 * @Description: Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * Example The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @Date: Created in 下午2:41 2017/11/21
 * @Modified By:
 */
public class Solution3 {

    public static boolean isValid(String str){
        boolean flag = true;
        if(null == str || str.length()< 2){
            flag = false;
            return flag;
        }
        Stack<Character> stack = new Stack<Character>();
        String prefix = "({[";
        String suffix = ")}]";
        List<String> valid = Arrays.asList("{}","()","[]");
        for(int i = 0,n=str.length();i < n;i++){
            Character s = str.charAt(i);
            if(prefix.contains(s.toString())){
                stack.push(s);
            } else if(stack.isEmpty()){
                flag = false;
                return flag;
            } else if(suffix.contains(s.toString()) && valid.contains(stack.peek().toString()+s)){
                stack.pop();
            } else {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String param = "(){}[]";
        System.out.println(isValid(param));
    }
}
