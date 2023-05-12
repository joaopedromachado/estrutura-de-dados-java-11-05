package pilhas;

import java.util.Stack;

public class Pilha {
    public static Stack<String> pilhas = new Stack<>();
    public static Stack<Character> characters = new Stack<>();

    public static void main(String[] args) {
        pilhas.push("João");
        pilhas.push("Joana");
        pilhas.push("Matheus");
        pilhas.pop();

        System.out.println(pilhas.peek());
        isEmpty();
        getPilha();

        System.out.println(checkingParentheses("(2+2) / 2")); // true
        System.out.println(checkingParentheses("(2+2) / (2")); // false
        System.out.println(checkingParentheses("(2+2) / (2( * 2")); // false

    }

    static boolean checkingParentheses(String expression){
        char c;

        for(int i = 0 ; i < expression.length() ; i++){
            c = expression.charAt(i);
            if (c == '('){
                characters.push(c);
            } else if (c == ')'){
                if (characters.isEmpty() || characters.peek() != '('){
                    return false;
                } else {
                    characters.pop();
                }
            }
        }
        return characters.isEmpty();
    }

    static void getPilha(){
        pilhas.forEach(pilha -> System.out.println(pilha));
    }

    static boolean isEmpty(){
        return characters.size() == 0;
    }
}
