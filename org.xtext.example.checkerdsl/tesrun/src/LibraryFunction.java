import java.util.ArrayList;

@SuppressWarnings("all")
public class LibraryFunction {
	public int sum(ArrayList arr){
		int ret = 0;
		for (int i=0; i<arr.size(); i++){
			ret += (int)arr.get(i);
		}
		return ret;
	}
}
