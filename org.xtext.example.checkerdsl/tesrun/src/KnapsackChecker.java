
public class KnapsackChecker {
	private GeneratedClass in;
	private GeneratedClass out;
	private GeneratedClass ans;
	
	public static void die(final String message) {
		System.out.println(message);
		System.exit(0);
	}
	
	public boolean check(){
		if (!(ans.getTp() == out.getTp())){
			KnapsackChecker.die("");
		}
		/*
		(sum(in.p) where out.y>0 == out.tp)
		(sum(in.w) where out.y>0 <= in.w[i])
		*/
		return true;
	}
	
	public static void main(String[] args) {
		// args[0] = in
		// args[1] = out
		// args[2] = ans
		GeneratedClass in = new GeneratedClass();
		in.init();
		GeneratedClass out = new GeneratedClass();
		out.init();
		GeneratedClass ans = new GeneratedClass();
		ans.init();
		new KnapsackChecker().check();
	}
}
