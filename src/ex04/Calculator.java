package ex04;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Created by R.Karimov on 10/18/17.
 */
class Calculator {

    int evaluate(final String input) {
        final Deque<String> stack = new ArrayDeque<>();
        final String[] tokens = input.split(" ");
        Collections.addAll(stack, tokens);
        while (stack.size() > 1) {
            int left = parseInt(stack.pop());
            String operator = stack.pop();
            int right= parseInt(stack.pop());

            int result = 0;
            switch (operator) {
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
            }
            stack.push(String.valueOf(result));
        }
        return parseInt(stack.pop());
    }
}
