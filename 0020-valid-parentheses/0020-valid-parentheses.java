class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray())
        {
            if((c=='{')||(c=='[')||c=='(')
            stack.push(c);
            else {
            if(stack.isEmpty())
            return false;
            char k = stack.pop();
            if ((c == ')' && k != '(') ||
                    (c == '}' && k != '{') ||
                    (c == ']' && k != '[')) {
                    return false;
            
        
        }
            }
        }
        if(stack.isEmpty())
        return true;
        else
        return false;
    
        }
    }
