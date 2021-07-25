package com.hnkien;

import java.util.Stack;

public class Parser {

    static boolean isBalanced(String s) {
        Stack<Character> myStack = new Stack<>();
        int n = s.length();
        if (n == 0) return  true;
        for (int i = 0; i < n; i++) {
            char a = s.charAt(i);
            if ((a == '{') || (a == '(')) {
                myStack.push(a);
            }
            else if (a == '}') {
                if (myStack.isEmpty()) return false;
                if (myStack.pop() != '{') {
                    return false;
                }
            } else if (a == ')') {
                if (myStack.isEmpty()) return false;
                if (myStack.pop() != '(') {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (myStack.isEmpty()) return true;
        else return false;
    }

    public static void runTest() {
        Parser parser = new Parser();
        System.out.println(parser.isBalanced(""));
        System.out.println(parser.isBalanced("((()))"));
        System.out.println(parser.isBalanced("{}()"));
        System.out.println(parser.isBalanced("((()))"));
        System.out.println(parser.isBalanced("({}{})"));
        System.out.println(parser.isBalanced("({)})"));
        System.out.println(parser.isBalanced("}{"));
        System.out.println(parser.isBalanced(")("));
        System.out.println(parser.isBalanced(")()"));
        System.out.println(parser.isBalanced("({)}"));
    }
}
