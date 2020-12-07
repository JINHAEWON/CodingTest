boolean solution(String s) {
	        boolean answer = true;
	        int check = 0;
	        
	        for(int i=0; i<s.length();i++) {
	        
	        	if(s.substring(i, i+1).equals("(")) check++;
	        	if(s.substring(i, i+1).equals(")")) check--;
	        	
	        	if(check < 0) {
	        		answer = false;
	        		break;
	        	}
	        }
	        
	        if(check ==0) answer= true;
	        else answer=false;
	        
	        return answer;
	    }
