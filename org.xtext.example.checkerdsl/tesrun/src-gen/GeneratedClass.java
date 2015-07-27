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
  
  private int current_mr;
  
  private int num_mr;
  
  private int num_tc;
  
  private int max_tc;
  
  private int num_subtask;
  
  private int loop_counter;
  
  private int max_loop_counter;
  
  private static boolean is_valid;
  
  public static boolean getIs_valid() {
    return is_valid;
  }
  
  public static void setIs_valid(final boolean new_valid) {
    is_valid = new_valid;
  }
  
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
    if ((1 <= value && value <= 100000)){
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
  
  public boolean validateT(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 100)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private int t;
  
  private int t_2;
  
  public int getT() {
    return this.t;
  }
  
  public void setT(final int t) {
    this.t = t;
  }
  
  public int getT_2() {
    return this.t_2;
  }
  
  public void setT_2(final int t_2) {
    this.t_2 = t_2;
  }
  
  public void readT(final String token) {
    t = intReader(token);
    if (!validateT(t,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeT() {
    try {
    	writer.write(""+(int)t);
    } catch (Exception e){}
  }
  
  public void writeT_2() {
    try {
    	writer.write(""+(int)t_2);
    } catch (Exception e){}
  }
  
  public boolean validateW(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 1000000)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private ArrayList w;
  
  private ArrayList w_2;
  
  public ArrayList getW() {
    return this.w;
  }
  
  public void setW(final ArrayList w) {
    this.w = w;
  }
  
  public int getW(final int id1) {
    return (int)w.get(id1);
  }
  
  public void setW(final int id1, final Object val) {
    w.set(id1,val);
  }
  
  public int getW_2(final int id1) {
    return (int)w_2.get(id1);
  }
  
  public void setW_2(final int id1, final Object val) {
    w_2.set(id1,val);
  }
  
  public void readW(final String[] tokens) {
    w = new ArrayList();
    for (int i=0; i<n; i++){
    	w.add(intReader(tokens[i]));
    	if (!validateW((int)w.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readW(final String token, final int idx) {
    w.set(idx,intReader(token));
  }
  
  public void writeW() {
    try {
    	for (int i=0; i<n; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)w.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeW(final int idx) {
    try {
    	writer.write(""+(int)w.get(idx));
    } catch (Exception e){}
  }
  
  public void writeW_2() {
    try {
    	for (int i=0; i<n_2; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)w_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeW_2(final int idx) {
    try {
    	writer.write(""+(int)w_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validateD(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 1000000)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private ArrayList d;
  
  private ArrayList d_2;
  
  public ArrayList getD() {
    return this.d;
  }
  
  public void setD(final ArrayList d) {
    this.d = d;
  }
  
  public int getD(final int id1) {
    return (int)d.get(id1);
  }
  
  public void setD(final int id1, final Object val) {
    d.set(id1,val);
  }
  
  public int getD_2(final int id1) {
    return (int)d_2.get(id1);
  }
  
  public void setD_2(final int id1, final Object val) {
    d_2.set(id1,val);
  }
  
  public void readD(final String[] tokens) {
    d = new ArrayList();
    for (int i=0; i<n; i++){
    	d.add(intReader(tokens[i]));
    	if (!validateD((int)d.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readD(final String token, final int idx) {
    d.set(idx,intReader(token));
  }
  
  public void writeD() {
    try {
    	for (int i=0; i<n; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)d.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeD(final int idx) {
    try {
    	writer.write(""+(int)d.get(idx));
    } catch (Exception e){}
  }
  
  public void writeD_2() {
    try {
    	for (int i=0; i<n_2; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)d_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeD_2(final int idx) {
    try {
    	writer.write(""+(int)d_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validateP(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 1000000)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private ArrayList p;
  
  private ArrayList p_2;
  
  public ArrayList getP() {
    return this.p;
  }
  
  public void setP(final ArrayList p) {
    this.p = p;
  }
  
  public int getP(final int id1) {
    return (int)p.get(id1);
  }
  
  public void setP(final int id1, final Object val) {
    p.set(id1,val);
  }
  
  public int getP_2(final int id1) {
    return (int)p_2.get(id1);
  }
  
  public void setP_2(final int id1, final Object val) {
    p_2.set(id1,val);
  }
  
  public void readP(final String[] tokens) {
    p = new ArrayList();
    for (int i=0; i<n; i++){
    	p.add(intReader(tokens[i]));
    	if (!validateP((int)p.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readP(final String token, final int idx) {
    p.set(idx,intReader(token));
  }
  
  public void writeP() {
    try {
    	for (int i=0; i<n; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)p.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeP(final int idx) {
    try {
    	writer.write(""+(int)p.get(idx));
    } catch (Exception e){}
  }
  
  public void writeP_2() {
    try {
    	for (int i=0; i<n_2; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)p_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeP_2(final int idx) {
    try {
    	writer.write(""+(int)p_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validateK(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((1 <= value && value <= n)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private ArrayList k;
  
  private ArrayList k_2;
  
  public ArrayList getK() {
    return this.k;
  }
  
  public void setK(final ArrayList k) {
    this.k = k;
  }
  
  public int getK(final int id1) {
    return (int)k.get(id1);
  }
  
  public void setK(final int id1, final Object val) {
    k.set(id1,val);
  }
  
  public int getK_2(final int id1) {
    return (int)k_2.get(id1);
  }
  
  public void setK_2(final int id1, final Object val) {
    k_2.set(id1,val);
  }
  
  public void readK(final String[] tokens) {
    k = new ArrayList();
    for (int i=0; i<n; i++){
    	k.add(intReader(tokens[i]));
    	if (!validateK((int)k.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readK(final String token, final int idx) {
    k.set(idx,intReader(token));
  }
  
  public void writeK() {
    try {
    	for (int i=0; i<n; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)k.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeK(final int idx) {
    try {
    	writer.write(""+(int)k.get(idx));
    } catch (Exception e){}
  }
  
  public void writeK_2() {
    try {
    	for (int i=0; i<n_2; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)k_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeK_2(final int idx) {
    try {
    	writer.write(""+(int)k_2.get(idx));
    } catch (Exception e){}
  }
  
  public void printScore() {
    File sfile;
    try {
    sfile = new File("tc/1.score");
    if(!sfile.exists()) sfile.createNewFile();
    fw = new FileWriter(sfile);
    writer = new BufferedWriter(fw);
    writer.write(""+100);
    writer.write(System.lineSeparator());
    writer.close();
    } catch(Exception e){}
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
    sz = 0+1+1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readN(tokens[0]);
    readT(tokens[1]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+n;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readW(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+n;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readD(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+n;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readP(tokens);
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
  }
  
  /**
   * input format
   */
  public void readInput(final String path) {
    int sz = 0;
    GeneratedClass.is_valid = true;
    String line;
    String[] tokens;
    try{
    BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
    sz = 0+1+1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readN(tokens[0]);
    readT(tokens[1]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+n;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readW(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+n;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readD(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+n;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readP(tokens);
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
    writeT_2();
    writer.write(System.lineSeparator());
    writeW_2();
    writeD_2();
    writeP_2();
    writer.close();
    } catch(Exception e){}
  }
  
  /**
   * input format
   */
  public void writeInput(final String path) {
    try {
    File wfile = new File(path);
    if(!wfile.exists()) wfile.createNewFile();
    fw = new FileWriter(wfile);
    writer = new BufferedWriter(fw);
    writeN_2();
    writer.write(" ");
    writeT_2();
    writer.write(System.lineSeparator());
    writeW_2();
    writeD_2();
    writeP_2();
    writer.close();
    } catch(Exception e){}
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
    sz = 0+n;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readK(tokens);
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
    if (GeneratedClass.is_valid){
    if (num == 0){
    mr_start();
    current_mr = 0;
    for (int i=1; i<=num_mr; i++){
    readInput(i);
    readOutput(i);
    }
    current_testcase++;
    if (current_testcase <= max_tc){
    readInput(0);
    readOutput(0);
    }
    } else {
    initMRVar();
    num_tc++;
    if (num_tc <= max_tc){
    writeInput(0,num_tc);
    writeOutput(0,num_tc);
    }
    }
    }
  }
  
  /**
   * output format
   */
  public void readOutput(final String path) {
    int sz = 0;
    String line;
    String[] tokens;
    try{
    BufferedReader reader = new BufferedReader(new FileReader(new File(path)));
    sz = 0+n;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readK(tokens);
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
    writeK_2();
    writer.close();
    } catch(Exception e){}
  }
  
  public Integer factorial(final Integer a) {
    boolean _equals = a.equals(Integer.valueOf(0));
    if (_equals) {
      return Integer.valueOf(1);
    } else {
      Integer _factorial = this.factorial(Integer.valueOf(((a).intValue() - 1)));
      return Integer.valueOf(((a).intValue() * (_factorial).intValue()));
    }
  }
  
  public void mr_followup_1() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(1,1000);
    ;
    w_2 = LibraryFunction.multiply(w,cc);
    ;
  }
  
  public void mr_check_1() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(1,1000);
    ;
  }
  
  public void mr_followup_2() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(1,1000);
    ;
    p_2 = LibraryFunction.plus(p,cc);
    ;
  }
  
  public void mr_check_2() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(1,1000);
    ;
  }
  
  public void mr_followup_3() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(-1000,-1);
    ;
    p_2 = LibraryFunction.plus(p,cc);
    ;
  }
  
  public void mr_check_3() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(-1000,-1);
    ;
  }
  
  public void mr_followup_4() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(1,1000);
    ;
    d_2 = LibraryFunction.plus(d,cc);
    ;
  }
  
  public void mr_check_4() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(1,1000);
    ;
  }
  
  public void mr_followup_5() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(-1000,-1);
    ;
    d_2 = LibraryFunction.plus(d,cc);
    ;
  }
  
  public void mr_check_5() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int cc = LibraryFunction.random(-1000,-1);
    ;
  }
  
  public void mr_followup_6() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    w_2 = LibraryFunction.remove(w,n);
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<d.size(); i++){
    if (getK(i)==n) cond_arr.add(true);
    else cond_arr.add(false);
    }
    d_2 = LibraryFunction.remove(d, cond_arr);
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<p.size(); i++){
    if (getK(i)==n) cond_arr.add(true);
    else cond_arr.add(false);
    }
    p_2 = LibraryFunction.remove(p, cond_arr);
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<k.size(); i++){
    if (getK(i)==n) cond_arr.add(true);
    else cond_arr.add(false);
    }
    k_2 = LibraryFunction.remove(k, cond_arr);
    ;
  }
  
  public void mr_check_6() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<k.size(); i++){
    if (getK(i)==n) cond_arr.add(true);
    else cond_arr.add(false);
    }
    k_2 = LibraryFunction.remove(k, cond_arr);
    ;
  }
  
  public void initMRVar() {
    n_2 = n;
    t_2 = t;
    w_2 = new ArrayList(w);
    d_2 = new ArrayList(d);
    p_2 = new ArrayList(p);
    k_2 = new ArrayList(k);
  }
  
  public void mr_start() {
    mr_followup_1();
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
    mr_followup_2();
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
    mr_followup_3();
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
    mr_followup_4();
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
    mr_followup_5();
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
    mr_followup_6();
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void init() {
    sc = new Scanner(System.in);
    max_loop_counter = 1000;
    loop_counter = 0;
  }
  
  public boolean mr_check(final String inPath, final String outPath) {
    GeneratedClass ans = new GeneratedClass();
    ans.init();
    ans.readInput(inPath);
    ans.readOutput(outPath);
    if (!ans.getIs_valid()) return false;
    boolean ok = true;
    if ((int)n_2 != (int)ans.n) return false;
    if ((int)t_2 != (int)ans.t) return false;
    for (int i=0; i<n_2; i++){
    if ((int)w_2.get(i) != (int)ans.w.get(i)) return false;
    }
    for (int i=0; i<n_2; i++){
    if ((int)d_2.get(i) != (int)ans.d.get(i)) return false;
    }
    for (int i=0; i<n_2; i++){
    if ((int)p_2.get(i) != (int)ans.p.get(i)) return false;
    }
    for (int i=0; i<n_2; i++){
    if ((int)k_2.get(i) != (int)ans.k.get(i)) return false;
    }
    return ok;
  }
  
  public void generateOutputChecker(final int mx_subtask, final int mx_tc) {
    try {
    File wfile = new File("OutputChecker.java");
    if(!wfile.exists()) wfile.createNewFile();
    fw = new FileWriter(wfile);
    writer = new BufferedWriter(fw);
    writer.write("import java.io.*;");
    writer.write(System.lineSeparator());
    writer.write("import java.util.*;");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("public class OutputChecker {");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("	private static GeneratedClass g;");
    writer.write(System.lineSeparator());
    writer.write("	");
    writer.write(System.lineSeparator());
    writer.write("	public static void pipeStream(InputStream input, OutputStream output) throws IOException");
    writer.write(System.lineSeparator());
    writer.write("	{");
    writer.write(System.lineSeparator());
    writer.write("		byte buffer[] = new byte[1024];");
    writer.write(System.lineSeparator());
    writer.write("		int numRead = 0;");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("		do");
    writer.write(System.lineSeparator());
    writer.write("		{");
    writer.write(System.lineSeparator());
    writer.write("			numRead = input.read(buffer);");
    writer.write(System.lineSeparator());
    writer.write("			output.write(buffer, 0, numRead);");
    writer.write(System.lineSeparator());
    writer.write("		} while (input.available() > 0);");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("		output.flush();");
    writer.write(System.lineSeparator());
    writer.write("	}");
    writer.write(System.lineSeparator());
    writer.write("	");
    writer.write(System.lineSeparator());
    writer.write("	public static void main(String[] args) {");
    writer.write(System.lineSeparator());
    writer.write("		int subtask = "+mx_subtask+";");
    writer.write(System.lineSeparator());
    writer.write("		int tc = "+mx_tc+";");
    writer.write(System.lineSeparator());
    writer.write("		int score = 0;");
    writer.write(System.lineSeparator());
    writer.write("		boolean ok = true;");
    writer.write(System.lineSeparator());
    writer.write("		if (args.length >= 2) subtask = Integer.parseInt(args[1]);");
    writer.write(System.lineSeparator());
    writer.write("		if (args.length >= 3) tc = Integer.parseInt(args[2]);");
    writer.write(System.lineSeparator());
    writer.write("		");
    writer.write(System.lineSeparator());
    writer.write("		for (int s=1; s<=subtask; s++){");
    writer.write(System.lineSeparator());
    writer.write("			for (int t=1; t<=tc; t++){");
    writer.write(System.lineSeparator());
    writer.write("				String inFile = \"tc/Subtask\"+s+\"/in/0/\"+t+\".in\";");
    writer.write(System.lineSeparator());
    writer.write("				String outFile = \"bufferOut.temp\";");
    writer.write(System.lineSeparator());
    writer.write("				String ansFile = \"tc/Subtask\"+s+\"/out/0/\"+t+\".out\";");
    writer.write(System.lineSeparator());
    writer.write("			");
    writer.write(System.lineSeparator());
    writer.write("				g = new GeneratedClass();");
    writer.write(System.lineSeparator());
    writer.write("				");
    writer.write(System.lineSeparator());
    writer.write("				try {");
    writer.write(System.lineSeparator());
    writer.write("					FileInputStream fileIn = new FileInputStream(inFile);");
    writer.write(System.lineSeparator());
    writer.write("					FileOutputStream fileOut = new FileOutputStream(outFile);");
    writer.write(System.lineSeparator());
    writer.write("					");
    writer.write(System.lineSeparator());
    writer.write("					OutputStream procIn = null;");
    writer.write(System.lineSeparator());
    writer.write("					InputStream procOut = null;");
    writer.write(System.lineSeparator());
    writer.write("					");
    writer.write(System.lineSeparator());
    writer.write("					Process process = null;");
    writer.write(System.lineSeparator());
    writer.write("					process = Runtime.getRuntime().exec(args[0]);");
    writer.write(System.lineSeparator());
    writer.write("					procIn = process.getOutputStream();");
    writer.write(System.lineSeparator());
    writer.write("					procOut = process.getInputStream();");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("					pipeStream(fileIn, procIn);");
    writer.write(System.lineSeparator());
    writer.write("					pipeStream(procOut, fileOut);");
    writer.write(System.lineSeparator());
    writer.write("					process.destroy();");
    writer.write(System.lineSeparator());
    writer.write("				} catch (Exception e){};");
    writer.write(System.lineSeparator());
    writer.write("				");
    writer.write(System.lineSeparator());
    writer.write("				if (g.output_check(inFile,outFile,ansFile)) System.out.println(\"Correct\");");
    writer.write(System.lineSeparator());
    writer.write("				else {");
    writer.write(System.lineSeparator());
    writer.write("					ok = false;");
    writer.write(System.lineSeparator());
    writer.write("					System.out.println(\"Wrong Answer\");");
    writer.write(System.lineSeparator());
    writer.write("				}");
    writer.write(System.lineSeparator());
    writer.write("			}");
    writer.write(System.lineSeparator());
    writer.write("			try {");
    writer.write(System.lineSeparator());
    writer.write("				InputStream fisOut = new FileInputStream(\"tc/\"+s+\".score\");");
    writer.write(System.lineSeparator());
    writer.write("				BufferedReader brOut = new BufferedReader(new InputStreamReader(fisOut));");
    writer.write(System.lineSeparator());
    writer.write("				String line = brOut.readLine();");
    writer.write(System.lineSeparator());
    writer.write("				if (ok) score += Integer.parseInt(line);");
    writer.write(System.lineSeparator());
    writer.write("				brOut.close();");
    writer.write(System.lineSeparator());
    writer.write("			} catch (Exception e){}");
    writer.write(System.lineSeparator());
    writer.write("		}");
    writer.write(System.lineSeparator());
    writer.write("		System.out.println(\"Score : \"+score);");
    writer.write(System.lineSeparator());
    writer.write("	}");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("}");
    writer.write(System.lineSeparator());
    writer.close();
    } catch(Exception e){}
  }
  
  public void generateOutputCheckerMT(final int mx_subtask, final int mx_tc) {
    try {
    File wfile = new File("OutputCheckerMT.java");
    if(!wfile.exists()) wfile.createNewFile();
    fw = new FileWriter(wfile);
    writer = new BufferedWriter(fw);
    writer.write("import java.io.*;");
    writer.write(System.lineSeparator());
    writer.write("import java.util.*;");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("public class OutputCheckerMT {");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("	private static GeneratedClass g;");
    writer.write(System.lineSeparator());
    writer.write("	private static String exeFile;");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("	public static void pipeStream(InputStream input, OutputStream output) throws IOException {");
    writer.write(System.lineSeparator());
    writer.write("		byte buffer[] = new byte[1024];");
    writer.write(System.lineSeparator());
    writer.write("		int numRead = 0;");
    writer.write(System.lineSeparator());
    writer.write("		do {");
    writer.write(System.lineSeparator());
    writer.write("			numRead = input.read(buffer);");
    writer.write(System.lineSeparator());
    writer.write("			output.write(buffer, 0, numRead);");
    writer.write(System.lineSeparator());
    writer.write("		} while (input.available() > 0);");
    writer.write(System.lineSeparator());
    writer.write("		output.flush();");
    writer.write(System.lineSeparator());
    writer.write("	}");
    writer.write(System.lineSeparator());
    writer.write("");
    writer.write(System.lineSeparator());
    writer.write("	public static void execute(String inF, String outF){");
    writer.write(System.lineSeparator());
    writer.write("		try {");
    writer.write(System.lineSeparator());
    writer.write("			FileInputStream fileIn = new FileInputStream(inF);");
    writer.write(System.lineSeparator());
    writer.write("			FileOutputStream fileOut = new FileOutputStream(outF);");
    writer.write(System.lineSeparator());
    writer.write("			OutputStream procIn = null;");
    writer.write(System.lineSeparator());
    writer.write("			InputStream procOut = null;");
    writer.write(System.lineSeparator());
    writer.write("			Process process = null;");
    writer.write(System.lineSeparator());
    writer.write("			process = Runtime.getRuntime().exec(exeFile);");
    writer.write(System.lineSeparator());
    writer.write("			procIn = process.getOutputStream();");
    writer.write(System.lineSeparator());
    writer.write("			procOut = process.getInputStream();");
    writer.write(System.lineSeparator());
    writer.write("			pipeStream(fileIn, procIn);");
    writer.write(System.lineSeparator());
    writer.write("			pipeStream(procOut, fileOut);");
    writer.write(System.lineSeparator());
    writer.write("			process.destroy();");
    writer.write(System.lineSeparator());
    writer.write("		} catch (Exception e){};");
    writer.write(System.lineSeparator());
    writer.write("	}");
    writer.write(System.lineSeparator());
    writer.write("	");
    writer.write(System.lineSeparator());
    writer.write("	public static void main(String[] args) {");
    writer.write(System.lineSeparator());
    writer.write("		int subtask = "+mx_subtask+";");
    writer.write(System.lineSeparator());
    writer.write("		int tc = "+mx_tc+";");
    writer.write(System.lineSeparator());
    writer.write("		int score = 0;");
    writer.write(System.lineSeparator());
    writer.write("		boolean ok = true;");
    writer.write(System.lineSeparator());
    writer.write("		boolean mr_ok = true;");
    writer.write(System.lineSeparator());
    writer.write("		exeFile = args[0];");
    writer.write(System.lineSeparator());
    writer.write("		if (args.length >= 2) subtask = Integer.parseInt(args[1]);");
    writer.write(System.lineSeparator());
    writer.write("		if (args.length >= 3) tc = Integer.parseInt(args[2]);");
    writer.write(System.lineSeparator());
    writer.write("		for (int s=1; s<=subtask; s++){");
    writer.write(System.lineSeparator());
    writer.write("			for (int t=1; t<=tc; t++){");
    writer.write(System.lineSeparator());
    writer.write("				String inFile = \"tc/Subtask\"+s+\"/in/0/\"+t+\".in\";");
    writer.write(System.lineSeparator());
    writer.write("				String inFile2 = \"bufferIn.temp\";");
    writer.write(System.lineSeparator());
    writer.write("				String outFile = \"bufferOut.temp\";");
    writer.write(System.lineSeparator());
    writer.write("				String outFile2 = \"bufferOut2.temp\";");
    writer.write(System.lineSeparator());
    writer.write("				g = new GeneratedClass();");
    writer.write(System.lineSeparator());
    writer.write("				execute(inFile,outFile);");
    writer.write(System.lineSeparator());
    writer.write("				g.readInput(inFile);");
    writer.write(System.lineSeparator());
    writer.write("				g.readOutput(outFile);");
    writer.write(System.lineSeparator());
    writer.write("				mr_ok = true;");
    writer.write(System.lineSeparator());
    writer.write("				g.setIs_valid(true);");
    writer.write(System.lineSeparator());
    writer.write("				g.readInput(inFile);");
    writer.write(System.lineSeparator());
    writer.write("				g.mr_followup_1();");
    writer.write(System.lineSeparator());
    writer.write("				g.writeInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()) g.readInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()){");
    writer.write(System.lineSeparator());
    writer.write("					execute(inFile2,outFile2);");
    writer.write(System.lineSeparator());
    writer.write("					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }");
    writer.write(System.lineSeparator());
    writer.write("				}");
    writer.write(System.lineSeparator());
    writer.write("				g.setIs_valid(true);");
    writer.write(System.lineSeparator());
    writer.write("				g.readInput(inFile);");
    writer.write(System.lineSeparator());
    writer.write("				g.mr_followup_2();");
    writer.write(System.lineSeparator());
    writer.write("				g.writeInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()) g.readInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()){");
    writer.write(System.lineSeparator());
    writer.write("					execute(inFile2,outFile2);");
    writer.write(System.lineSeparator());
    writer.write("					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }");
    writer.write(System.lineSeparator());
    writer.write("				}");
    writer.write(System.lineSeparator());
    writer.write("				g.setIs_valid(true);");
    writer.write(System.lineSeparator());
    writer.write("				g.readInput(inFile);");
    writer.write(System.lineSeparator());
    writer.write("				g.mr_followup_3();");
    writer.write(System.lineSeparator());
    writer.write("				g.writeInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()) g.readInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()){");
    writer.write(System.lineSeparator());
    writer.write("					execute(inFile2,outFile2);");
    writer.write(System.lineSeparator());
    writer.write("					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }");
    writer.write(System.lineSeparator());
    writer.write("				}");
    writer.write(System.lineSeparator());
    writer.write("				g.setIs_valid(true);");
    writer.write(System.lineSeparator());
    writer.write("				g.readInput(inFile);");
    writer.write(System.lineSeparator());
    writer.write("				g.mr_followup_4();");
    writer.write(System.lineSeparator());
    writer.write("				g.writeInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()) g.readInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()){");
    writer.write(System.lineSeparator());
    writer.write("					execute(inFile2,outFile2);");
    writer.write(System.lineSeparator());
    writer.write("					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }");
    writer.write(System.lineSeparator());
    writer.write("				}");
    writer.write(System.lineSeparator());
    writer.write("				g.setIs_valid(true);");
    writer.write(System.lineSeparator());
    writer.write("				g.readInput(inFile);");
    writer.write(System.lineSeparator());
    writer.write("				g.mr_followup_5();");
    writer.write(System.lineSeparator());
    writer.write("				g.writeInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()) g.readInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()){");
    writer.write(System.lineSeparator());
    writer.write("					execute(inFile2,outFile2);");
    writer.write(System.lineSeparator());
    writer.write("					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }");
    writer.write(System.lineSeparator());
    writer.write("				}");
    writer.write(System.lineSeparator());
    writer.write("				g.setIs_valid(true);");
    writer.write(System.lineSeparator());
    writer.write("				g.readInput(inFile);");
    writer.write(System.lineSeparator());
    writer.write("				g.mr_followup_6();");
    writer.write(System.lineSeparator());
    writer.write("				g.writeInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()) g.readInput(inFile2);");
    writer.write(System.lineSeparator());
    writer.write("				if (g.getIs_valid()){");
    writer.write(System.lineSeparator());
    writer.write("					execute(inFile2,outFile2);");
    writer.write(System.lineSeparator());
    writer.write("					if (!g.mr_check(inFile2,outFile2)){ mr_ok = false; }");
    writer.write(System.lineSeparator());
    writer.write("				}");
    writer.write(System.lineSeparator());
    writer.write("				if (mr_ok) System.out.println(\"Correct\");");
    writer.write(System.lineSeparator());
    writer.write("				else {");
    writer.write(System.lineSeparator());
    writer.write("					ok = false;");
    writer.write(System.lineSeparator());
    writer.write("					System.out.println(\"Wrong Answer\");");
    writer.write(System.lineSeparator());
    writer.write("				}");
    writer.write(System.lineSeparator());
    writer.write("			}");
    writer.write(System.lineSeparator());
    writer.write("			try {");
    writer.write(System.lineSeparator());
    writer.write("				InputStream fisOut = new FileInputStream(\"tc/\"+s+\".score\");");
    writer.write(System.lineSeparator());
    writer.write("				BufferedReader brOut = new BufferedReader(new InputStreamReader(fisOut));");
    writer.write(System.lineSeparator());
    writer.write("				String line = brOut.readLine();");
    writer.write(System.lineSeparator());
    writer.write("				if (ok) score += Integer.parseInt(line);");
    writer.write(System.lineSeparator());
    writer.write("				brOut.close();");
    writer.write(System.lineSeparator());
    writer.write("			} catch (Exception e){}");
    writer.write(System.lineSeparator());
    writer.write("		}");
    writer.write(System.lineSeparator());
    writer.write("		System.out.println(\"Score : \"+score);");
    writer.write(System.lineSeparator());
    writer.write("	}");
    writer.write(System.lineSeparator());
    writer.write("}");
    writer.write(System.lineSeparator());
    writer.close();
    } catch(Exception e){}
  }
  
  public void generate(final int tc, final int mtc) {
    num_mr = 6;
    max_tc = mtc;
    num_subtask = 1;
    GeneratedClass.cur_lines = 1;
    printScore();
    generateOutputChecker(num_subtask,max_tc);
    generateOutputCheckerMT(num_subtask,max_tc);
    for (int i=1; i<=num_subtask; i++){
    	current_subtask = i;
    	current_testcase = 1;
    	current_mr = 0;
    	num_tc = tc;
    	readInput(0);
    	readOutput(0);
    }
  }
}
