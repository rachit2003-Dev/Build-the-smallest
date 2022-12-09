class Solution {
    static String buildLowestNumber(String S, int K){
        StringBuilder sb = new StringBuilder();
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<S.length();i++){
            while(!st.isEmpty() && st.peek()>(S.charAt(i)-'0') && K>0){
                st.pop();
                K--;
            }
            if(!st.isEmpty() || S.charAt(i)!='0'){
                st.push(S.charAt(i)-'0');
            }
        }
        while(!st.isEmpty()&&K>0){
            st.pop();
            K--;
        }
        if(st.isEmpty()){
            return "0";
        }
        while(!st.isEmpty()){
            //char temp=(st.pop()+'0');
            sb.append(st.pop());
        }
         String str = sb.reverse().toString();
        return str;
        // code here
    }
}