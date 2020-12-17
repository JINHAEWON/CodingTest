	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> basket = new Stack<Integer>();
		
		for(int target : moves) {
			int addItem = popItem(target-1,board);
			if(addItem !=0) {
				answer += CountBingo(addItem,basket);
			}
		}
		
		return answer;
	}

	public int CountBingo(int addItem,Stack<Integer> basket) {
		int count =0;
		if(basket.size()==0) {
			basket.add(addItem);
			return count;
		}
		
		if(addItem != basket.peek()) {
			basket.add(addItem);
			return count;
		}
		
		if(addItem == basket.peek()) {
			basket.pop();
			count = 2;
		}
		
		
		return count;
	}
	
	public int popItem(int target,int[][] board) {
		int addItem=0;
		for(int i=0; i<board.length;i++) {
			if(board[i][target]!=0) {
				addItem = board[i][target];
				board[i][target]=0;
				break;
			}
		}
		return addItem;
	}
