
public class MainGenerator {

	public static void main(String[] args) {
		GeneratedClass g = new GeneratedClass();
		int num_tc = 10;
		int idx = 0;
		boolean gen_all = true;
		boolean gen_tc = false;
		boolean gen_oc = false;
		while (idx < args.length){
			if (args[idx].equals("--generate-test-case")){
				gen_tc = true;
				gen_all = false;
				idx++;
				System.out.println("generate all test case");
			} else if (args[idx].equals("--generate-output-checker")){
				gen_oc = true;
				gen_all = false;
				idx++;
				System.out.println("generate output checker");
			} else if (args[idx].equals("--num-test-case")){
				idx++;
				num_tc = Integer.parseInt(args[idx]);
				idx++;
				System.out.println("num test case "+num_tc);
			}
		}
		if (gen_tc){
			g.init(1,num_tc);
		}
		if (gen_oc){
			
		}
		if (gen_all){
			System.out.println("generate all");
			g.init(1,num_tc);
			
		}
	}

}
