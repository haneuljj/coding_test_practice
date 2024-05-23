class Solution {
    public String solution(String code) {
        StringBuffer ret = new StringBuffer();
        boolean mode = false;
        
        for(int i = 0; i < code.length(); ++i){
            String current = String.valueOf(code.charAt(i));
            
            if(current.equals("1"))
                mode = !mode;
            
            if(mode == false) {
                if((i % 2 == 0) && (!current.equals("1"))) ret.append(current);
            }
            
            if(mode == true) {
                if((i % 2 != 0) && (!current.equals("1"))) ret.append(current);
            }
        }
        
        if(ret.length() == 0) ret.append("EMPTY");

        return ret.toString();
    }
}