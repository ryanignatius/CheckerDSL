
public class Pair<T,U> {
	private T first;
	private U second;
	
	Pair(T t, U u){
		first = t;
		second = u;
	}
	
	public T getFirst(){
		return first;
	}
	public U getSecond(){
		return second;
	}
	public void setFirst(T t){
		first = t;
	}
	public void setSecond(U u){
		second = u;
	}
}
