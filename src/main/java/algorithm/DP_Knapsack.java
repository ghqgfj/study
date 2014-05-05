package algorithm;

public class DP_Knapsack {
	class Stuff {
		public int weight;
		public int value;

		public Stuff(int w, int v) {
			weight = w;
			value = v;
		}
	}

	public final static int Box = 20;
	Stuff stuffs[] = { new Stuff(1, 5), new Stuff(3, 4), new Stuff(3, 10),
			new Stuff(5, 12), new Stuff(6, 7), new Stuff(2, 5),
			new Stuff(10, 10), new Stuff(2, 16), new Stuff(1, 4),
			new Stuff(5, 4), new Stuff(6, 9) };
	public int f[][] = new int[11][20];

	public int max(int one, int two) {
		return one > two ? one : two;
	}

	public int getMaxValue(int count, int w) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j <w; j++) {
				if(j>=stuffs[i].weight&&j!=0&&i!=0){
					f[i][j]=max(f[i-1][j],f[i-1][j-1]+stuffs[i].value);
				}else if(i!=0){
					f[i][j]=f[i-1][j];
				}else{
					f[i][j]=0;
				}				
			}

		}
		return f[count-1][w-1];
	}

	public static void main(String args[]) {
		DP_Knapsack dp=new DP_Knapsack();
		System.out.println(dp.getMaxValue(11,5));		
	}
}
