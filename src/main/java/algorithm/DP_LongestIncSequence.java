package algorithm;

public class DP_LongestIncSequence {
	private static int seq[]={5, 3, 4, 8, 6, 7};
	public static void main(String[] args){
		int[] d=new int[6];
		for(int i=0;i<seq.length;i++){
			d[i]=1;
			for(int j=0;j<i;j++){
				if(seq[j]<=seq[i]&&d[j]+1>d[i]){
					d[i]=d[j]+1;
				}
			}
		}
		System.out.println(d[5]);
	}
}
