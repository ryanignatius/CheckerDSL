import java.io.*;
import java.util.*;

public class OutputChecker {

	private static GeneratedClass g;
	
	public static void pipeStream(InputStream input, OutputStream output) throws IOException
	{
		byte buffer[] = new byte[1024];
		int numRead = 0;

		do
		{
			numRead = input.read(buffer);
			output.write(buffer, 0, numRead);
		} while (input.available() > 0);

		output.flush();
	}
	
	public static void main(String[] args) {
		int subtask = 2;
		int tc = 10;
		int score = 0;
		boolean ok = true;
		if (args.length >= 2) subtask = Integer.parseInt(args[1]);
		if (args.length >= 3) tc = Integer.parseInt(args[2]);
		
		for (int s=1; s<=subtask; s++){
			for (int t=1; t<=tc; t++){
				String inFile = "tc/Subtask"+s+"/in/0/"+t+".in";
				String outFile = "bufferOut.temp";
				String ansFile = "tc/Subtask"+s+"/out/0/"+t+".out";
			
				g = new GeneratedClass();
				
				try {
					FileInputStream fileIn = new FileInputStream(inFile);
					FileOutputStream fileOut = new FileOutputStream(outFile);
					
					OutputStream procIn = null;
					InputStream procOut = null;
					
					Process process = null;
					process = Runtime.getRuntime().exec(args[0]);
					procIn = process.getOutputStream();
					procOut = process.getInputStream();

					pipeStream(fileIn, procIn);
					pipeStream(procOut, fileOut);
					process.destroy();
				} catch (Exception e){};
				
				if (g.output_check(inFile,outFile,ansFile)) System.out.println("Correct");
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
