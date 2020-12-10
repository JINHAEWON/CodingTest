  public int solution(int n, int[][] costs) {
			int answer = 0;
			PriorityQueue<int[]> LandLinkedCost = new PriorityQueue<int[]>(
					new Comparator<int[]>() {
						public int compare(int[] a, int[] b) {
							return a[2]>b[2]?1:(a[2]==b[2]?0:-1);
						}
					});
			AscendingCosts(costs,costs.length,LandLinkedCost);
			
			int[][] CheckConnect = new int[n][n];
			for(int i=0;i<n;i++) {
				CheckConnect[i][i]=1;
			}
			
			int i2=0;
			while(!AllLandConnected(CheckConnect,n)) {
				int[] NewLineForLandToLand = LandLinkedCost.poll();
				if(NoConnected(NewLineForLandToLand,CheckConnect)) {
					NewConnection(CheckConnect, NewLineForLandToLand,n);
					answer+=NewLineForLandToLand[2];
				}
			}
			return answer;
		}
		

	  void NewConnection(int[][] CheckConnect, int[] NewLineForLandToLand,int LandNumber) {
			int StopoverLand = NewLineForLandToLand[0];
			int StartLand = NewLineForLandToLand[1];
	
			CheckConnect[StartLand][StopoverLand] = 1;
			CheckConnect[StopoverLand][StartLand] = 1;
	
			for (int i = 0; i < LandNumber; i++)
				for (int j = 0; j < LandNumber; j++) {
					if (i != j) {
						for (int k = 0; k < LandNumber; k++) {
							if (j != k)
								if (CheckConnect[i][j] == 1 && CheckConnect[j][k] == 1) {
									CheckConnect[i][k] = 1;
									CheckConnect[k][i] = 1;
								}
						}
					}
				}
	    }
	  boolean NoConnected(int[] NewLineForLandToLand,int[][] CheckConnect) {
			if(CheckConnect[NewLineForLandToLand[0]][NewLineForLandToLand[1]]!=1)
				return true;
			return false;
		}

	  boolean AllLandConnected(int[][] CheckConnect,int LandNumber) {
			for(int i=0;i<LandNumber;i++) {
				for(int j=0;j<LandNumber;j++) {
					if(CheckConnect[i][j]!=1) 
						return false;
				}
			}
			return true;
		}
		
	  void AscendingCosts(int[][] costs, int LandNumber, PriorityQueue<int[]> LandLinkedCost) {		  
		  for(int i=0; i<LandNumber;i++) {
				LandLinkedCost.add(costs[i]);
			}
		}
