import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("all")
public class LibraryFunction<T> {
	// static attribute and method
	private static final long MAX_IDX = 10000000;
	private static boolean isSieve = false;
	private static boolean isUsed[];
	private static ArrayList<Long> primesList;
	
	public static void Sieve(){
		primesList = new ArrayList<Long>();
		isUsed = new boolean[(int)MAX_IDX];
		isUsed[0] = false;
		isUsed[1] = false;
		for (int i=2; i<MAX_IDX; i++){
			isUsed[i] = true;
		}
		for (long i=2; i<MAX_IDX; i++){
			if (isUsed[(int)i]){
				primesList.add(new Long(i));
				for (long j=i*i; j<MAX_IDX; j+=i){
					isUsed[(int)j] = false;
				}
			}
		}
		isSieve = true;
	}
	
	public int sum(ArrayList arr, ArrayList<Boolean> cond){
		int ret = 0;
		for (int i=0; i<arr.size(); i++){
			if (cond.get(i)) ret += (int)arr.get(i);
		}
		return ret;
	}
	public int max(ArrayList arr, ArrayList<Boolean> cond){
		int ret = -Integer.MAX_VALUE;
		for (int i=0; i<arr.size(); i++){
			if (cond.get(i) && (int)arr.get(i) > ret) ret = (int)arr.get(i);
		}
		return ret;
	}
	public int min(ArrayList arr, ArrayList<Boolean> cond){
		int ret = Integer.MAX_VALUE;
		for (int i=0; i<arr.size(); i++){
			if (cond.get(i) && (int)arr.get(i) < ret) ret = (int)arr.get(i);
		}
		return ret;
	}
	public boolean prime(int element){
		if (!LibraryFunction.isSieve){
			LibraryFunction.isSieve = true;
			LibraryFunction.Sieve();
		}
		if (element < 0) return false;
		if (element < MAX_IDX){
			return LibraryFunction.isUsed[(int)element];
		} else {
			for (int i=0; i<LibraryFunction.primesList.size(); i++){
				if (element % LibraryFunction.primesList.get(i) == 0) return false;
			}
			return true;
		}
	}
	public ArrayList swap(ArrayList arr, int a, int b){
		int s = arr.size();
		ArrayList ret = new ArrayList();
		for (int i=0; i<s; i++){
			if (i == a) ret.add(arr.get(b));
			else if (i == b) ret.add(arr.get(a));
			else ret.add(arr.get(i));
		}
		return ret;
	}
	public ArrayList select(int num){
		ArrayList ret = new ArrayList();
		int r;
		Random rand = new Random();
		for (int i=0; i<num; i++){
			r = rand.nextInt();
			ret.add(r);
		}
		return ret;
	}
	public int random(int a, int b){
		Random rand = new Random();
		return rand.nextInt(b-a+1)+a;
	}
	public int size(ArrayList arr){
		return arr.size();
	}
	
	public ArrayList permute(ArrayList arr){
		int s = arr.size();
		boolean perm[] = new boolean[s];
		for (int i=0; i<s; i++){
			perm[i] = false;
		}
		ArrayList ret = new ArrayList();
		int r;
		Random rand = new Random();
		for (int i=0; i<s; i++){
			do {
				r = rand.nextInt(s);
			} while (perm[r]);
			perm[r] = true;
			ret.add(arr.get(r));
		}
		return ret;
	}
	
	public ArrayList plus(ArrayList arr, int p){
		int s = arr.size();
		ArrayList ret = new ArrayList();
		for (int i=0; i<s; i++){
			ret.add((Integer)arr.get(i)+p);
		}
		return ret;
	}
	
	public ArrayList multiply(ArrayList arr, int m){
		int s = arr.size();
		ArrayList ret = new ArrayList();
		for (int i=0; i<s; i++){
			ret.add((Integer)arr.get(i)*m);
		}
		return ret;
	}
	
	public ArrayList invert(ArrayList arr){
		int s = arr.size();
		ArrayList ret = new ArrayList();
		for (int i=0; i<s; i++){
			ret.add((Integer)arr.get(i)*(-1));
		}
		return ret;
	}
	
	public ArrayList include(ArrayList arr, T element){
		int s = arr.size();
		ArrayList ret = new ArrayList();
		for (int i=0; i<s; i++){
			ret.add(arr.get(i));
		}
		ret.add(element);
		return ret;
	}
	
	public ArrayList exclude(ArrayList arr, int index){
		int s = arr.size();
		ArrayList ret = new ArrayList();
		for (int i=0; i<s; i++){
			if (index != i) ret.add(arr.get(i));
		}
		return ret;
	}
	
	public Pair<ArrayList,ArrayList> compositional(ArrayList arr){
		int s = arr.size();
		ArrayList ret1 = new ArrayList();
		ArrayList ret2 = new ArrayList();
		int r;
		Random rand = new Random();
		for (int i=0; i<s; i++){
			r = rand.nextInt(2);
			if (r%2==0) ret1.add(arr.get(i));
			else ret2.add(arr.get(i));
		}
		Pair<ArrayList,ArrayList> ret = new Pair<ArrayList,ArrayList>(ret1,ret2);
		return ret;
	}
}