
public class MainGenerator {

	public static void main(String[] args) {
		GeneratedClass g = new GeneratedClass();
		g.init(1,10);
		int idx = 0;
		boolean gen_all = true;
		while (idx < args.length){
			if (args[idx].equals("--generate-test-case")){
				gen_all = false;
				idx++;
				if (args[idx].equals("all")){
					idx++;
					System.out.println("generate all test case");
				} else {
					while (idx < args.length && args[idx].charAt(0) != '-'){
						int subtask = Integer.parseInt(args[idx]);
						idx++;
						System.out.println("generate test case subtask "+subtask);
					}
				}
			} else if (args[idx].equals("--generate-output-checker")){
				gen_all = false;
				idx++;
				System.out.println("generate output checker");
			} else if (args[idx].equals("--num-test-case")){
				idx++;
				int num = Integer.parseInt(args[idx]);
				idx++;
				System.out.println("num test case "+num);
			}
		}
		if (gen_all){
			System.out.println("generate all");
		}
	}

}
