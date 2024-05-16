class Solution {
    public String solution(int[] food) {
        StringBuffer buf = new StringBuffer();
        int startLocation = 0;
        
        // 1~3번째 값을 각각 2로 나누고 나눈 몫만큼 양쪽에 삽입됨
        for (int i = 1; i < food.length; i++) {
            int dividedTwo = food[i] / 2;
            String insertString = "";
            
            for (int j = 0; j < dividedTwo; ++j) {
                insertString += Integer.toString(i);
            }
            
            //System.out.println(insertString);
                
            buf.insert(startLocation, insertString);
            buf.insert(buf.length() - startLocation, insertString);
            
            startLocation += dividedTwo;
        }
        buf.insert(buf.length() / 2, "0");
        
        return buf.toString();
    }
}
