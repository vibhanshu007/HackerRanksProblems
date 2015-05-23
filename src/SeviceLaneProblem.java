import java.util.Scanner;


public class SeviceLaneProblem {
	public static void main(String[] args) {
		System.out.println("vibhanshu");
		Scanner in = new Scanner(System.in);  //take  User input
		int n = in.nextInt();
		int t = in.nextInt();

		int a1[] = new int[n];
		int a2[] = new int[n];

		int min1=0;
		int min2=0;

		int val;

		for (int i = 0; i < n; i++) {
			val = in.nextInt();

			if (val== 1){
				a1[min1++]=i;
			}
			else if(val==2) {
				a2[min2++]=i;
			}
		}
		int stop ,start;
		for(int i=0;i<t;t++){
			start = in.nextInt();
			stop = in.nextInt();

			if (find(a1,min1,start,stop)==1)
				System.out.println(1);

			else if (find (a2,min2,start,stop)==1)
				System.out.println(2);

			else 
				System.out.println(3);

		}

	}
	public static int find(int [] a, int max, int start, int stop){
		if(max<=0)
			return 0;

		int low = 0;
		int high = max-1;

		int mid;
		int possibleAns = -1;

		while(low<=high){
			mid = (low+high)/2; 
			if((a[mid] == stop) || (a[mid]>=start && a[mid]<stop)){
				return 1;
			} else if (a[mid] < start){
				low = mid+1;
			} else if (a[mid] > stop){
				high = mid-1;
			}

		}

		return 0;

	}
}
