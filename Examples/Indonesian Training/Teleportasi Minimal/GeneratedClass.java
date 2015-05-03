import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("all")
public class GeneratedClass {
  private Scanner sc;
  
  private BufferedReader buf;
  
  private FileReader fr;
  
  private File fl;
  
  private FileWriter fw;
  
  private BufferedWriter writer;
  
  private int current_subtask;
  
  private int current_testcase;
  
  private int num_tc;
  
  private int max_testcase;
  
  private int current_mr;
  
  private int num_mr;
  
  private int num_subtask;
  
  private static boolean is_valid;
  
  private static int cur_lines;
  
  public static void die(final String message) {
    System.out.println(message);
    is_valid = false;
    //System.exit(0);
  }
  
  public int intReader(final String token) {
    int ret = 0;
    try {
    	ret = Integer.parseInt(token);
    } catch (Exception e){
    	GeneratedClass.die("not int");
    }
    return ret;
  }
  
  public long longReader(final String token) {
    long ret = 0;
    try {
    	ret = Long.parseLong(token);
    } catch (Exception e){
    	GeneratedClass.die("not long");
    }
    return ret;
  }
  
  public float floatReader(final String token) {
    float ret = 0;
    try {
    	ret = Float.parseFloat(token);
    } catch (Exception e){
    	GeneratedClass.die("not float");
    }
    return ret;
  }
  
  public double doubleReader(final String token) {
    double ret = 0;
    try {
    	ret = Double.parseDouble(token);
    } catch (Exception e){
    	GeneratedClass.die("not double");
    }
    return ret;
  }
  
  public boolean booleanReader(final String token) {
    boolean ret = false;
    try {
    	ret = Boolean.parseBoolean(token);
    } catch (Exception e){
    	GeneratedClass.die("not boolean");
    }
    return ret;
  }
  
  public char charReader(final String token) {
    char ret = ' ';
    if (token.length() == 1){
    	ret = token.charAt(0);
    } else {
    	GeneratedClass.die("not char");
    }
    return ret;
  }
  
  public String stringReader(final String token) {
    return token;
  }
  
  public boolean validateN(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 2000)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private int n;
  
  private int n_2;
  
  public int getN() {
    return this.n;
  }
  
  public void setN(final int n) {
    this.n = n;
  }
  
  public int getN_2() {
    return this.n_2;
  }
  
  public void setN_2(final int n_2) {
    this.n_2 = n_2;
  }
  
  public void readN(final String token) {
    n = intReader(token);
    if (!validateN(n,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeN() {
    try {
    	writer.write(""+(int)n);
    } catch (Exception e){}
  }
  
  public void writeN_2() {
    try {
    	writer.write(""+(int)n_2);
    } catch (Exception e){}
  }
  
  public boolean validateD(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 120)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private int d;
  
  private int d_2;
  
  public int getD() {
    return this.d;
  }
  
  public void setD(final int d) {
    this.d = d;
  }
  
  public int getD_2() {
    return this.d_2;
  }
  
  public void setD_2(final int d_2) {
    this.d_2 = d_2;
  }
  
  public void readD(final String token) {
    d = intReader(token);
    if (!validateD(d,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeD() {
    try {
    	writer.write(""+(int)d);
    } catch (Exception e){}
  }
  
  public void writeD_2() {
    try {
    	writer.write(""+(int)d_2);
    } catch (Exception e){}
  }
  
  public boolean validateF(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((0 <= value && value <= 1000)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private ArrayList f;
  
  private ArrayList f_2;
  
  public ArrayList getF() {
    return this.f;
  }
  
  public void setF(final ArrayList f) {
    this.f = f;
  }
  
  public int getF(final int id1) {
    return (int)f.get(id1);
  }
  
  public void setF(final int id1, final Object val) {
    f.set(id1,val);
  }
  
  public int getF_2(final int id1) {
    return (int)f_2.get(id1);
  }
  
  public void setF_2(final int id1, final Object val) {
    f_2.set(id1,val);
  }
  
  public void readF(final String[] tokens) {
    f = new ArrayList();
    for (int i=0; i<tokens.length; i++){
    	f.add(intReader(tokens[i]));
    	if (!validateF((int)f.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readF(final String token, final int idx) {
    f.set(idx,intReader(token));
	if (!validateF((int)f.get(idx),current_subtask)){
		GeneratedClass.die("value not in valid range");
	}
  }
  
  public void writeF() {
    try {
    	for (int i=0; i<f.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)f.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeF(final int idx) {
    try {
    	writer.write(""+(int)f.get(idx));
    } catch (Exception e){}
  }
  
  public void writeF_2() {
    try {
    	for (int i=0; i<f_2.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)f_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeF_2(final int idx) {
    try {
    	writer.write(""+(int)f_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validateStep(final int value, final int subtask) {
    return true;
  }
  
  private ArrayList step;
  
  private ArrayList step_2;
  
  public ArrayList getStep() {
    return this.step;
  }
  
  public void setStep(final ArrayList step) {
    this.step = step;
  }
  
  public int getStep(final int id1) {
    return (int)step.get(id1);
  }
  
  public void setStep(final int id1, final Object val) {
    step.set(id1,val);
  }
  
  public int getStep_2(final int id1) {
    return (int)step_2.get(id1);
  }
  
  public void setStep_2(final int id1, final Object val) {
    step_2.set(id1,val);
  }
  
  public void readStep(final String[] tokens) {
    step = new ArrayList();
    for (int i=0; i<tokens.length; i++){
    	step.add(intReader(tokens[i]));
    	if (!validateStep((int)step.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readStep(final String token, final int idx) {
    step.set(idx,intReader(token));
  }
  
  public void writeStep() {
    try {
    	for (int i=0; i<step.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)step.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeStep(final int idx) {
    try {
    	writer.write(""+(int)step.get(idx));
    } catch (Exception e){}
  }
  
  public void writeStep_2() {
    try {
    	for (int i=0; i<step_2.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)step_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeStep_2(final int idx) {
    try {
    	writer.write(""+(int)step_2.get(idx));
    } catch (Exception e){}
  }
  
  public void printScore() {
    System.out.println("Subtask : 1, Score : 100");
  }
  
  /**
   * input format
   */
  public void readInput(final int num) {
    int sz = 0;
    GeneratedClass.is_valid = true;
    String line;
    String[] tokens;
    try{
    BufferedReader reader = new BufferedReader(new FileReader(new File("tc/Subtask"+current_subtask+"/in/"+num+"/"+current_testcase+".in")));
    sz = 2;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readN(tokens[0]);
    readD(tokens[1]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
	sz = 1;
	f = new ArrayList();
    for (int i=0; i<n; i++){
		f.add((Object)0);
		if ((line = reader.readLine()) != null){
			line = line.trim();
			line = line.replaceAll("\\s+", " ");
			tokens = line.split(" ");
			if (tokens.length == sz || sz < 0){
				readF(tokens[0],i);
			} else {
				GeneratedClass.die("number of elements in lines not match");
			}
		} else {
			GeneratedClass.die("number of lines not match");
		}
    }
    if (reader.readLine() != null){
    GeneratedClass.die("number of lines not match");
    }
    reader.close();
    } catch (Exception e){}
    System.out.println("Finish read input "+num+"/"+current_testcase+".in");
  }
  
  /**
   * input format
   */
  public void writeInput(final int mr, final int tc) {
    try {
    File wfile = new File("tc/Subtask"+current_subtask+"/in/"+mr+"/"+tc+".in");
    if(!wfile.exists()) wfile.createNewFile();
    fw = new FileWriter(wfile);
    writer = new BufferedWriter(fw);
    writeN_2();
    writer.write(" ");
    writeD_2();
    writer.write(System.lineSeparator());
    for (int i=0; i<n; i++){
    writeF_2(i);
    writer.write(System.lineSeparator());
    }
    writer.close();
    } catch(Exception e){}
    System.out.println("Finish write input "+mr+"/"+tc+".in");
  }
  
  /**
   * output format
   */
  public void readOutput(final int num) {
    int sz = 0;
    String line;
    String[] tokens;
    try{
    BufferedReader reader = new BufferedReader(new FileReader(new File("tc/Subtask"+current_subtask+"/out/"+num+"/"+current_testcase+".out")));
    sz = -1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readStep(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    if (reader.readLine() != null){
    GeneratedClass.die("number of lines not match");
    }
    reader.close();
    } catch (Exception e){}
    System.out.println("Finish read output "+num+"/"+current_testcase+".out");
    if (GeneratedClass.is_valid){
    if (num == 0){
    mr_start();
    current_mr = 0;
    for (int i=1; i<=num_mr; i++){
    readInput(i);
    readOutput(i);
    }
    current_testcase++;
    if (current_testcase <= max_testcase){
    readInput(0);
    readOutput(0);
    }
    } else {
    initMRVar();
    num_tc++;
    System.out.println("Add new test case "+num_tc);
    if (num_tc <= max_testcase){
    writeInput(0,num_tc);
    writeOutput(0,num_tc);
    }
    }
    }
  }
  
  /**
   * output format
   */
  public void writeOutput(final int mr, final int tc) {
    try {
    File wfile = new File("tc/Subtask"+current_subtask+"/out/"+mr+"/"+tc+".out");
    if(!wfile.exists()) wfile.createNewFile();
    fw = new FileWriter(wfile);
    writer = new BufferedWriter(fw);
    writeStep_2();
    writer.close();
    } catch(Exception e){}
    System.out.println("Finish write output "+mr+"/"+tc+".out");
  }
  
  public void mr_followup_1() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(1,100);
    f_2 = LibraryFunction.plus(f,cc);
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_1() {
    initMRVar();
  }
  
  public void mr_followup_2() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(1,100);
    f_2 = LibraryFunction.multiply(f,cc);
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_2() {
    initMRVar();
  }
  
  public void mr_followup_3() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int st = LibraryFunction.size(step);
    int l;
    do {
    	l = LibraryFunction.random(1,st);
    } while (!(1<=l && l<=st));
    l--;
    int cc = LibraryFunction.random(1,100);
    setF_2(l,getF(l)-cc);
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_3() {
    initMRVar();
  }
  
  public void mr_followup_4() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int l;
    do {
    	l = LibraryFunction.random(1,n);
    } while (LibraryFunction.contain(step,l));
    int cc = LibraryFunction.random(1,100);
    setF_2(l,getF(l)+cc);
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_4() {
    initMRVar();
  }
  
  public void mr_followup_5() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    f_2 = LibraryFunction.reverse(f);
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_5() {
    initMRVar();
  }
  
  public void initMRVar() {
    n_2 = n;
    d_2 = d;
    f_2 = new ArrayList(f);
    step_2 = new ArrayList(step);
  }
  
  public void mr_start() {
    mr_followup_1();
    mr_followup_2();
    mr_followup_3();
    mr_followup_4();
    mr_followup_5();
  }
  
  public void init(final int tc, final int max_tc) {
    sc = new Scanner(System.in);
    current_subtask = 1;
    current_testcase = 1;
    num_tc = tc;
    max_testcase = max_tc;
    current_mr = 0;
    num_mr = 5;
    num_subtask = 1;
    GeneratedClass.cur_lines = 1;
    //readInput(0);
    //readOutput(0);
  }
}
