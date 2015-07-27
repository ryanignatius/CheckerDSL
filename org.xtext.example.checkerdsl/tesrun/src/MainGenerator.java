
public class MainGenerator {

	public static void main(String[] args) {
		GeneratedClass g = new GeneratedClass();
		g.init();
		int num_tc = 10;
		int idx = 0;
		boolean gen_all = true;
		while (idx < args.length){
			if (args[idx].equals("--num-test-case")){
				idx++;
				num_tc = Integer.parseInt(args[idx]);
				idx++;
				System.out.println("num test case "+num_tc);
			}
		}
		if (gen_all){
			System.out.println("generate all");
			g.generate(1,num_tc);
		}
	}

}
