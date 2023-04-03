/*Sample Input
2
8 3
12 -1 -7 8 -15 30 16 28
 8 4
12 -1 -7 8 -15 30 16 28
Sample Output
-1 -1 -7 -15 -15 0 
-1 -1 -7 -15 -15 */


import java.util.*;
public class Main {
    public static int[] FNNWK(Main qu , int n , int k) throws Exception{
		int ind = 0;
		int[] ans = new int[n-k+1];
		for(int i = 0 ; i<(n-k+1) ; i++){
			while(ind>=i && ind<(i+k)){
				if(qu.getFront()<0) ans[i] = qu.getFront();
				else{
					ind++;
					qu.deQueue();
				}
			}
		}
		return ans;
        
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		Main qu = new Main();
        int test = sc.nextInt();
        for(int i = 0 ; i<test ; i++){
            int size = sc.nextInt();
            int ws = sc.nextInt();
            for(int j = 0 ; j<size  ;j++){  qu.enQueue(sc.nextInt());}
            int[] ans = FNNWK(qu , size , ws);
			for(int k = 0 ;  k<ans.length ; k++) System.out.print(ans[i] + " ");
        }
        sc.close();
    }

	protected int size;

	protected int front;
	protected int[] data;

	public Main() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Main(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enQueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("Main is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int deQueue() throws Exception {
		if (this.size == 0) {
			throw new Exception("Main is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("Main is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}}