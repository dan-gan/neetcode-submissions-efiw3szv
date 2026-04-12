class Solution {
    public boolean isValid(String s) {
        Stack<Character> S = new Stack<Character>();
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[')
                S.push(ch);
            if(ch == ')' || ch == '}' || ch == ']'){
                if(S.isEmpty())
                    return false;
                char c = S.pop();
                if(!match(c,ch))
                    return false;
            }
        }
        return(S.isEmpty());
    }
    public boolean match(char a, char b){
        if(a == '(' && b == ')')
            return true;
        else if(a == '[' && b == ']')
            return true;
        else if(a == '{' && b == '}')
            return true;
        else
        return false;
    }
}
