import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class MR2Checker {

	/**
	 * @param args
	 */
	private static GeneratedClass origin;
	private static GeneratedClass current;
	
	public static boolean walk( String path ) {
		boolean ok = true;
		File root = new File( path );
        if (root == null || !root.isDirectory()) {
        	System.out.println("Invalid directory");
        	return false;
        }

        File[] list = root.listFiles();
        for ( File f : list ) {
			System.out.println(f.getName());
			if (!check(f.getPath())){
				ok = false;
				System.out.println("wrong");
			} else System.out.println("ok");
        }
        return ok;
    }
	
	public static boolean check(String path){
		//System.out.println(path);
		String inpath = path.replaceAll("out","in");
		//System.out.println(inpath);
		String oripath = path.replaceAll("2\\\\","0\\\\");
		//System.out.println(oripath);
		String oriinpath = oripath.replaceAll("out","in");
		//System.out.println(oriinpath);
		origin.readInput(oriinpath);
		origin.readOutput(oripath);
		current.readInput(inpath);
		current.readOutput(path);
		
		origin.mr_check_2();
		boolean ok = true;
		if (!(origin.getOlive_2().equals(current.getOlive()))) ok = false;
		return ok;
	}
	
	public static void main(String[] args) {
		origin = new GeneratedClass();
		current = new GeneratedClass();
		origin.init(1,0);
		current.init(1,0);
		System.out.println(walk("../../out/2/"));
	}
}
