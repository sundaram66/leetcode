public class Solution {
    public int countNumbersWithUniqueDigits(int n) {

			int[] a = new int[n+1] ;

			if(n == 0) { return 1; }
			if(n == 1) { return 10; }
			if(n == 2) { return 91; }

			a[0] = 1;
			a[1]=9;
			a[2]=81;
			int rep=3,mul=8;
			while(rep <= n ) {
				int curr=a[rep-1];
				curr *= mul--;
				a[rep] = curr;
				rep++;
			}

			int result = 0;
			for(int i=0;i<=n;i++) {
				result += a[i];
			}
			return result;

		
    }
}