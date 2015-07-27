import java.io.*;
import java.util.*;

public class OutputCheckerMT {

	private static GeneratedClass g;
	private static String exeFile;

	public static void pipeStream(InputStream input, OutputStream output) throws IOException {
		byte buffer[] = new byte[1024];
		int numRead = 0;
		do {
			numRead = input.read(buffer);
			output.write(buffer, 0, numRead);
		} while (input.available() > 0);
		output.flush();
	}

	public static void execute(String inF, String outF){
		try {
			FileInputStream fileIn = new FileInputStream(inF);
			FileOutputStream fileOut = new FileOutputStream(outF);
			OutputStream procIn = null;
			InputStream procOut = null;
			Process process = null;
			process = Runtime.getRuntime().exec(exeFile);
			procIn = process.getOutputStream();
			procOut = process.getInputStream();
			pipeStream(fileIn, procIn);
			pipeStream(procOut, fileOut);
			process.destroy();
		} catch (Exception e){};
	}
	
	public static void main(String[] args) {
		int subtask = 2;
		int tc = 10;
		int score = 0;
		boolean ok = true;
		boolean mr_ok = true;
		exeFile = args[0];
		if (args.length >= 2) subtask = Integer.parseInt(args[1]);
		if (args.length >= 3) tc = Integer.parseInt(args[2]);
		for (int s=1; s<=subtask; s++){
			for (int t=1; t<=tc; t++){
				String inFile = "tc/Subtask"+s+"/in/0/"+t+".in";
				String inFile2 = "bufferIn.temp";
				String outFile = "bufferOut.temp";
				String outFile2 = "bufferOut2.temp";
				g = new GeneratedClass();
				execute(inFile,outFile);
				g.readInput(inFile);
				g.readOutput(outFile);
				mr_ok = true;
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_1();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_2();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_3();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_4();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_5();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_6();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_7();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_8();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_9();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				g.setIs_valid(true);
				g.readInput(inFile);
				g.mr_followup_10();
				g.writeInput(inFile2);
				if (g.getIs_valid()) g.readInput(inFile2);
				if (g.getIs_valid()){
					execute(inFile2,outFile2);
					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }
				}
				if (mr_ok) System.out.println("Correct");
				else {
					ok = false;
					System.out.println("Wrong Answer");
				}
			}
			try {
				InputStream fisOut = new FileInputStream("tc/"+s+".score");
				BufferedReader brOut = new BufferedReader(new InputStreamReader(fisOut));
				String line = brOut.readLine();
				if (ok) score += Integer.parseInt(line);
				brOut.close();
			} catch (Exception e){}
		}
		System.out.println("Score : "+score);
	}
}
