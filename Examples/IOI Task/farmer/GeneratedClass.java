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
  
  public boolean validateQ(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((0 <= value && value <= 150000)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private int q;
  
  private int q_2;
  
  public int getQ() {
    return this.q;
  }
  
  public void setQ(final int q) {
    this.q = q;
  }
  
  public int getQ_2() {
    return this.q_2;
  }
  
  public void setQ_2(final int q_2) {
    this.q_2 = q_2;
  }
  
  public void readQ(final String token) {
    q = intReader(token);
    if (!validateQ(q,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeQ() {
    try {
    	writer.write(""+(int)q);
    } catch (Exception e){}
  }
  
  public void writeQ_2() {
    try {
    	writer.write(""+(int)q_2);
    } catch (Exception e){}
  }
  
  public boolean validateM(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((0 <= value && value <= 2000)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private int m;
  
  private int m_2;
  
  public int getM() {
    return this.m;
  }
  
  public void setM(final int m) {
    this.m = m;
  }
  
  public int getM_2() {
    return this.m_2;
  }
  
  public void setM_2(final int m_2) {
    this.m_2 = m_2;
  }
  
  public void readM(final String token) {
    m = intReader(token);
    if (!validateM(m,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeM() {
    try {
    	writer.write(""+(int)m);
    } catch (Exception e){}
  }
  
  public void writeM_2() {
    try {
    	writer.write(""+(int)m_2);
    } catch (Exception e){}
  }
  
  public boolean validateS(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((0 <= value && value <= 2000)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private int s;
  
  private int s_2;
  
  public int getS() {
    return this.s;
  }
  
  public void setS(final int s) {
    this.s = s;
  }
  
  public int getS_2() {
    return this.s_2;
  }
  
  public void setS_2(final int s_2) {
    this.s_2 = s_2;
  }
  
  public void readS(final String token) {
    s = intReader(token);
    if (!validateS(s,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeS() {
    try {
    	writer.write(""+(int)s);
    } catch (Exception e){}
  }
  
  public void writeS_2() {
    try {
    	writer.write(""+(int)s_2);
    } catch (Exception e){}
  }
  
  public boolean validateN(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((3 <= value && value <= 150)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private ArrayList n;
  
  private ArrayList n_2;
  
  public ArrayList getN() {
    return this.n;
  }
  
  public void setN(final ArrayList n) {
    this.n = n;
  }
  
  public int getN(final int id1) {
    return (int)n.get(id1);
  }
  
  public void setN(final int id1, final Object val) {
    n.set(id1,val);
  }
  
  public int getN_2(final int id1) {
    return (int)n_2.get(id1);
  }
  
  public void setN_2(final int id1, final Object val) {
    n_2.set(id1,val);
  }
  
  public void readN(final String[] tokens) {
    n = new ArrayList();
    for (int i=0; i<tokens.length; i++){
    	n.add(intReader(tokens[i]));
    	if (!validateN((int)n.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readN(final String token, final int idx) {
    n.set(idx,intReader(token));
    if (!validateN((int)n.get(idx),current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeN() {
    try {
    	for (int i=0; i<n.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)n.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeN(final int idx) {
    try {
    	writer.write(""+(int)n.get(idx));
    } catch (Exception e){}
  }
  
  public void writeN_2() {
    try {
    	for (int i=0; i<n_2.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)n_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeN_2(final int idx) {
    try {
    	writer.write(""+(int)n_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validateR(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((2 <= value && value <= 150)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private ArrayList r;
  
  private ArrayList r_2;
  
  public ArrayList getR() {
    return this.r;
  }
  
  public void setR(final ArrayList r) {
    this.r = r;
  }
  
  public int getR(final int id1) {
    return (int)r.get(id1);
  }
  
  public void setR(final int id1, final Object val) {
    r.set(id1,val);
  }
  
  public int getR_2(final int id1) {
    return (int)r_2.get(id1);
  }
  
  public void setR_2(final int id1, final Object val) {
    r_2.set(id1,val);
  }
  
  public void readR(final String[] tokens) {
    r = new ArrayList();
    for (int i=0; i<tokens.length; i++){
    	r.add(intReader(tokens[i]));
    	if (!validateR((int)r.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readR(final String token, final int idx) {
    r.set(idx,intReader(token));
    if (!validateR((int)r.get(idx),current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeR() {
    try {
    	for (int i=0; i<r.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)r.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeR(final int idx) {
    try {
    	writer.write(""+(int)r.get(idx));
    } catch (Exception e){}
  }
  
  public void writeR_2() {
    try {
    	for (int i=0; i<r_2.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)r_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeR_2(final int idx) {
    try {
    	writer.write(""+(int)r_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validateOlive(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((0 <= value && value <= q)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private int olive;
  
  private int olive_2;
  
  public int getOlive() {
    return this.olive;
  }
  
  public void setOlive(final int olive) {
    this.olive = olive;
  }
  
  public int getOlive_2() {
    return this.olive_2;
  }
  
  public void setOlive_2(final int olive_2) {
    this.olive_2 = olive_2;
  }
  
  public void readOlive(final String token) {
    olive = intReader(token);
    if (!validateOlive(olive,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeOlive() {
    try {
    	writer.write(""+(int)olive);
    } catch (Exception e){}
  }
  
  public void writeOlive_2() {
    try {
    	writer.write(""+(int)olive_2);
    } catch (Exception e){}
  }
  
  public boolean validateYn(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((0 <= value && value <= 1)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private ArrayList yn;
  
  private ArrayList yn_2;
  
  public ArrayList getYn() {
    return this.yn;
  }
  
  public void setYn(final ArrayList yn) {
    this.yn = yn;
  }
  
  public int getYn(final int id1) {
    return (int)yn.get(id1);
  }
  
  public void setYn(final int id1, final Object val) {
    yn.set(id1,val);
  }
  
  public int getYn_2(final int id1) {
    return (int)yn_2.get(id1);
  }
  
  public void setYn_2(final int id1, final Object val) {
    yn_2.set(id1,val);
  }
  
  public void readYn(final String[] tokens) {
    yn = new ArrayList();
    for (int i=0; i<tokens.length; i++){
    	yn.add(intReader(tokens[i]));
    	if (!validateYn((int)yn.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readYn(final String token, final int idx) {
    yn.set(idx,intReader(token));
    if (!validateYn((int)yn.get(idx),current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeYn() {
    try {
    	for (int i=0; i<yn.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)yn.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeYn(final int idx) {
    try {
    	writer.write(""+(int)yn.get(idx));
    } catch (Exception e){}
  }
  
  public void writeYn_2() {
    try {
    	for (int i=0; i<yn_2.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)yn_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeYn_2(final int idx) {
    try {
    	writer.write(""+(int)yn_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validateYr(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((0 <= value && value <= 1)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private ArrayList yr;
  
  private ArrayList yr_2;
  
  public ArrayList getYr() {
    return this.yr;
  }
  
  public void setYr(final ArrayList yr) {
    this.yr = yr;
  }
  
  public int getYr(final int id1) {
    return (int)yr.get(id1);
  }
  
  public void setYr(final int id1, final Object val) {
    yr.set(id1,val);
  }
  
  public int getYr_2(final int id1) {
    return (int)yr_2.get(id1);
  }
  
  public void setYr_2(final int id1, final Object val) {
    yr_2.set(id1,val);
  }
  
  public void readYr(final String[] tokens) {
    yr = new ArrayList();
    for (int i=0; i<tokens.length; i++){
    	yr.add(intReader(tokens[i]));
    	if (!validateYr((int)yr.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readYr(final String token, final int idx) {
    yr.set(idx,intReader(token));
    if (!validateYr((int)yr.get(idx),current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeYr() {
    try {
    	for (int i=0; i<yr.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)yr.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeYr(final int idx) {
    try {
    	writer.write(""+(int)yr.get(idx));
    } catch (Exception e){}
  }
  
  public void writeYr_2() {
    try {
    	for (int i=0; i<yr_2.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)yr_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeYr_2(final int idx) {
    try {
    	writer.write(""+(int)yr_2.get(idx));
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
    sz = 3;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readQ(tokens[0]);
    readM(tokens[1]);
    readS(tokens[2]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+m;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readN(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+s;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readR(tokens);
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
    writeQ_2();
    writer.write(" ");
    writeM_2();
    writer.write(" ");
    writeS_2();
    writer.write(System.lineSeparator());
    writeN_2();
    writeR_2();
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
    sz = 1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readOlive(tokens[0]);
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
    writeHidden(0,num_tc);
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
    writeOlive_2();
    writer.write(System.lineSeparator());
    writer.close();
    } catch(Exception e){}
    System.out.println("Finish write output "+mr+"/"+tc+".out");
  }
  
  public void readHidden(final int num) {
    int sz = 0;
    GeneratedClass.is_valid = true;
    String line;
    String[] tokens;
    try{
    BufferedReader reader = new BufferedReader(new FileReader(new File("tc/Subtask"+current_subtask+"/hidden/"+num+"/"+current_testcase+".hidden")));
    sz = 0+m;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readYn(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+s;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readYr(tokens);
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
    System.out.println("Finish read hidden "+num+"/"+current_testcase+".hidden");
  }
  
  public void writeHidden(final int mr, final int tc) {
    try {
    File wfile = new File("tc/Subtask"+current_subtask+"/hidden/"+mr+"/"+tc+".hidden");
    if(!wfile.exists()) wfile.createNewFile();
    fw = new FileWriter(wfile);
    writer = new BufferedWriter(fw);
    writeYn_2();
    writeYr_2();
    writer.close();
    } catch(Exception e){}
    System.out.println("Finish write hidden "+mr+"/"+tc+".hidden");
  }
  
  public void mr_followup_1() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    int l;
	do {
	k = LibraryFunction.random(1,m);
    l = LibraryFunction.random(1,m);
	k--;
	l--;
    } while (!(getN(k)!=getN(l)));
    n_2 = LibraryFunction.swap(n,k,l);
    yn_2 = LibraryFunction.swap(yn,k,l);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_1() {
    initMRVar();
  }
  
  public void mr_followup_2() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    int l;
    do {
	k = LibraryFunction.random(1,s);
    l = LibraryFunction.random(1,s);
	k--;
	l--;
    } while (!(getR(k)!=getR(l)));
    r_2 = LibraryFunction.swap(r,k,l);
    yr_2 = LibraryFunction.swap(yr,k,l);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_2() {
    initMRVar();
  }
  
  public void mr_followup_3() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<n.size(); i++){
    if (getYn(i)==0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int nnew = LibraryFunction.min(n, cond_arr);
    m_2 = m+1;
    n_2 = LibraryFunction.add(n,nnew);
    yn_2 = LibraryFunction.add(yn,0);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_3() {
    initMRVar();
  }
  
  public void mr_followup_4() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<r.size(); i++){
    if (getYr(i)==0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int rnew = LibraryFunction.min(r, cond_arr);
    s_2 = s+1;
    r_2 = LibraryFunction.add(r,rnew);
    yr_2 = LibraryFunction.add(yr,0);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_4() {
    initMRVar();
  }
  
  public void mr_followup_5() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,m);
    k--;
	} while (!(getYn(k)==0));
    m_2 = m-1;
    n_2 = LibraryFunction.remove(n,k);
    yn_2 = LibraryFunction.remove(yn,k);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_5() {
    initMRVar();
  }
  
  public void mr_followup_6() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,s);
    k--;
	} while (!(getYr(k)==0));
    s_2 = s-1;
    r_2 = LibraryFunction.remove(r,k);
    yr_2 = LibraryFunction.remove(yr,k);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_6() {
    initMRVar();
  }
  
  public void mr_followup_7() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,m);
    k--;
	} while (!(getYn(k)==1));
    m_2 = m-1;
    q_2 = q-getN(k);
    n_2 = LibraryFunction.remove(n,k);
    yn_2 = LibraryFunction.remove(yn,k);
    olive_2 = olive-getN(k);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_7() {
    initMRVar();
  }
  
  public void mr_followup_8() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    int l;
    do {
	k = LibraryFunction.random(1,m);
    l = LibraryFunction.random(1,m);
	k--;
	l--;
    } while (!(getYn(k)==1 && getYn(l)==1));
    setN_2(k,getN(k)+getN(l));
    m_2 = m-1;
    n_2 = LibraryFunction.remove(n,l);
    yn_2 = LibraryFunction.remove(yn,l);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_8() {
    initMRVar();
  }
  
  public void mr_followup_9() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,m);
    k--;
	} while (!(getYn(k)==1));
    int cc = LibraryFunction.random(0,100);
    q_2 = q+cc;
    setN_2(k,getN(k)+cc);
    olive_2 = olive+cc;
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_9() {
    initMRVar();
  }
  
  public void initMRVar() {
    q_2 = q;
    m_2 = m;
    s_2 = s;
    n_2 = new ArrayList(n);
    r_2 = new ArrayList(r);
    olive_2 = olive;
    yn_2 = new ArrayList(yn);
    yr_2 = new ArrayList(yr);
  }
  
  public void mr_start() {
    mr_followup_1();
    mr_followup_2();
    mr_followup_3();
    mr_followup_4();
    mr_followup_5();
    mr_followup_6();
    mr_followup_7();
    mr_followup_8();
    mr_followup_9();
  }
  
  public void init(final int tc, final int max_tc) {
    sc = new Scanner(System.in);
    current_subtask = 1;
    current_testcase = 1;
    num_tc = tc;
    max_testcase = max_tc;
    current_mr = 0;
    num_mr = 9;
    num_subtask = 1;
    GeneratedClass.cur_lines = 1;
    //readInput(0);
    //readOutput(0);
  }
}
