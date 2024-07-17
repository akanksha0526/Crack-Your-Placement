//Stack 
class Solution {
    public int calculate(String s) {
        int len = s.length();
        if(s==null || len==0) return 0;
        Stack<Integer> stk = new Stack<Integer>();
        int num = 0;
        char op = '+';
        for(int i = 0; i < len ; i++){
            if(Character.isDigit(s.charAt(i))) num = num*10 + (s.charAt(i)-'0');

            if(!Character.isDigit(s.charAt(i)) && (' ' != s.charAt(i)) || (i == len-1)){
                 if(op=='-'){
                stk.push(-num);
            }
            if(op=='+'){
                stk.push(num);
            }
            if(op=='*'){
                stk.push(stk.pop()*num);
            }
            if(op=='/'){
                stk.push(stk.pop()/num);
            }
            op = s.charAt(i);
            num = 0;
            }
        }
         int sum = 0;
        while(!stk.isEmpty()){
            sum += stk.pop();
        }
        return sum;

    }
}
