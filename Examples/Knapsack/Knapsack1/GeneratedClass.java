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
    if ((1 <= value && value <= 100)){
    return true;
    } else {
    return false;
    }
    case 2 :
    if ((1 <= value && value <= 1000)){
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
  
  public boolean validateM(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 100)){
    return true;
    } else {
    return false;
    }
    case 2 :
    if ((1 <= value && value <= 100)){
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
  
  public boolean validateP(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 100)){
    return true;
    } else {
    return false;
    }
    case 2 :
    if ((1 <= value && value <= 100)){
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
  
  public boolean validateW(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 100)){
    return true;
    } else {
    return false;
    }
    case 2 :
    if ((1 <= value && value <= 100)){
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
  
  public boolean validateC(final int value, final int subtask) {
    switch (subtask){
    case 1 :
    if ((1 <= value && value <= 100)){
    return true;
    } else {
    return false;
    }
    case 2 :
    if ((1 <= value && value <= 100)){
    return true;
    } else {
    return false;
    }
    default:
    return true;
    }
  }
  
  private ArrayList c;
  
  private ArrayList c_2;
  
  public ArrayList getC() {
    return this.c;
  }
  
  public void setC(final ArrayList c) {
    this.c = c;
  }
  
  public int getC(final int id1) {
    return (int)c.get(id1);
  }
  
  public void setC(final int id1, final Object val) {
    c.set(id1,val);
  }
  
  public int getC_2(final int id1) {
    return (int)c_2.get(id1);
  }
  
  public void setC_2(final int id1, final Object val) {
    c_2.set(id1,val);
  }
  
  public void readC(final String[] tokens) {
    c = new ArrayList();
    for (int i=0; i<m; i++){
    	c.add(intReader(tokens[i]));
    	if (!validateC((int)c.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readC(final String token, final int idx) {
    c.set(idx,intReader(token));
  }
  
  public void writeC() {
    try {
    	for (int i=0; i<m; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)c.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeC(final int idx) {
    try {
    	writer.write(""+(int)c.get(idx));
    } catch (Exception e){}
  }
  
  public void writeC_2() {
    try {
    	for (int i=0; i<m_2; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)c_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeC_2(final int idx) {
    try {
    	writer.write(""+(int)c_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validateY(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((0 <= value && value <= m)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private ArrayList y;
  
  private ArrayList y_2;
  
  public ArrayList getY() {
    return this.y;
  }
  
  public void setY(final ArrayList y) {
    this.y = y;
  }
  
  public int getY(final int id1) {
    return (int)y.get(id1);
  }
  
  public void setY(final int id1, final Object val) {
    y.set(id1,val);
  }
  
  public int getY_2(final int id1) {
    return (int)y_2.get(id1);
  }
  
  public void setY_2(final int id1, final Object val) {
    y_2.set(id1,val);
  }
  
  public void readY(final String[] tokens) {
    y = new ArrayList();
    for (int i=0; i<n; i++){
    	y.add(intReader(tokens[i]));
    	if (!validateY((int)y.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readY(final String token, final int idx) {
    y.set(idx,intReader(token));
  }
  
  public void writeY() {
    try {
    	for (int i=0; i<n; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)y.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeY(final int idx) {
    try {
    	writer.write(""+(int)y.get(idx));
    } catch (Exception e){}
  }
  
  public void writeY_2() {
    try {
    	for (int i=0; i<n_2; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)y_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeY_2(final int idx) {
    try {
    	writer.write(""+(int)y_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validateTp(final int value, final int subtask) {
    return true;
  }
  
  private int tp;
  
  private int tp_2;
  
  public int getTp() {
    return this.tp;
  }
  
  public void setTp(final int tp) {
    this.tp = tp;
  }
  
  public int getTp_2() {
    return this.tp_2;
  }
  
  public void setTp_2(final int tp_2) {
    this.tp_2 = tp_2;
  }
  
  public void readTp(final String token) {
    tp = intReader(token);
    if (!validateTp(tp,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeTp() {
    try {
    	writer.write(""+(int)tp);
    } catch (Exception e){}
  }
  
  public void writeTp_2() {
    try {
    	writer.write(""+(int)tp_2);
    } catch (Exception e){}
  }
  
  public void printScore() {
    File sfile;
    try {
    sfile = new File("tc/1.score");
    if(!sfile.exists()) sfile.createNewFile();
    fw = new FileWriter(sfile);
    writer = new BufferedWriter(fw);
    writer.write(""+40);
    writer.write(System.lineSeparator());
    writer.close();
    } catch(Exception e){}
    try {
    sfile = new File("tc/2.score");
    if(!sfile.exists()) sfile.createNewFile();
    fw = new FileWriter(sfile);
    writer = new BufferedWriter(fw);
    writer.write(""+60);
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
    readM(tokens[1]);
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
    sz = 0+m;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readC(tokens);
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
    readM(tokens[1]);
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
    sz = 0+m;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readC(tokens);
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
    writeM_2();
    writer.write(System.lineSeparator());
    writeP_2();
    writeW_2();
    writeC_2();
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
    writeM_2();
    writer.write(System.lineSeparator());
    writeP_2();
    writeW_2();
    writeC_2();
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
    readY(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readTp(tokens[0]);
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
    readY(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readTp(tokens[0]);
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
    writeY_2();
    writeTp_2();
    writer.write(System.lineSeparator());
    writer.close();
    } catch(Exception e){}
  }
  
  public boolean output_check(final String inPath, final String outPath, final String ansPath) {
    GeneratedClass ans = new GeneratedClass();
    ans.init();
    readInput(inPath);
    readOutput(outPath);
    ans.readInput(inPath);
    ans.readOutput(ansPath);
    boolean ok = true;
    ArrayList cond_arr;
    if (!(ans.tp==tp)) ok = false;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<p.size(); i++){
    if (getY(i)>0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    if (!(LibraryFunction.sum(p, cond_arr)==tp)) ok = false;
    for (int j=0; j<m; j++){
    int j1 = j+1;
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<w.size(); i++){
    if (getY(i)==j1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    if (!(LibraryFunction.sum(w, cond_arr)<=getC(j))) ok = false;
    }
    return ok;
  }
  
  public void mr_followup_1() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    int l;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    l = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(k<l && getP(k)!=getP(l) || k<l && getW(k)!=getW(l)));
    ;
    p_2 = LibraryFunction.swap(p,k,l);
    ;
    w_2 = LibraryFunction.swap(w,k,l);
    ;
    y_2 = LibraryFunction.swap(y,k,l);
    ;
  }
  
  public void mr_check_1() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    int l;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    l = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(k<l && getP(k)!=getP(l) || k<l && getW(k)!=getW(l)));
    ;
    y_2 = LibraryFunction.swap(y,k,l);
    ;
  }
  
  public void mr_followup_2() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==1));
    ;
    int cc = LibraryFunction.random(0,100);
    ;
    setP_2(k,getP(k)+cc);
    ;
    tp_2 = tp+cc;
    ;
  }
  
  public void mr_check_2() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==1));
    ;
    int cc = LibraryFunction.random(0,100);
    ;
    tp_2 = tp+cc;
    ;
  }
  
  public void mr_followup_3() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==0));
    ;
    int cc = LibraryFunction.random(0,100);
    ;
    setW_2(k,getW(k)+cc);
    ;
  }
  
  public void mr_check_3() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==0));
    ;
    int cc = LibraryFunction.random(0,100);
    ;
  }
  
  public void mr_followup_4() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==0));
    ;
    int cc = LibraryFunction.random(0,100);
    ;
    setP_2(k,getP(k)-cc);
    ;
  }
  
  public void mr_check_4() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==0));
    ;
    int cc = LibraryFunction.random(0,100);
    ;
  }
  
  public void mr_followup_5() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<w.size(); i++){
    if (getY(i)==1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int c1 = LibraryFunction.sum(w, cond_arr);
    ;
    setC_2(0,c1);
    ;
  }
  
  public void mr_check_5() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<w.size(); i++){
    if (getY(i)==1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int c1 = LibraryFunction.sum(w, cond_arr);
    ;
  }
  
  public void mr_followup_6() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<p.size(); i++){
    if (getY(i)!=0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int pnew = LibraryFunction.min(p, cond_arr);
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<w.size(); i++){
    if (getY(i)!=0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int wnew = LibraryFunction.max(w, cond_arr);
    ;
    n_2 = n+1;
    ;
    p_2 = LibraryFunction.add(p,pnew);
    ;
    w_2 = LibraryFunction.add(w,wnew);
    ;
    y_2 = LibraryFunction.add(y,0);
    ;
  }
  
  public void mr_check_6() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<p.size(); i++){
    if (getY(i)!=0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int pnew = LibraryFunction.min(p, cond_arr);
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<w.size(); i++){
    if (getY(i)!=0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int wnew = LibraryFunction.max(w, cond_arr);
    ;
    y_2 = LibraryFunction.add(y,0);
    ;
  }
  
  public void mr_followup_7() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==0));
    ;
    n_2 = n-1;
    ;
    p_2 = LibraryFunction.remove(p,k);
    ;
    w_2 = LibraryFunction.remove(w,k);
    ;
    y_2 = LibraryFunction.remove(y,k);
    ;
  }
  
  public void mr_check_7() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==0));
    ;
    y_2 = LibraryFunction.remove(y,k);
    ;
  }
  
  public void mr_followup_8() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==1));
    ;
    n_2 = n-1;
    ;
    setC_2(0,getC(0)-getW(k));
    ;
    p_2 = LibraryFunction.remove(p,k);
    ;
    w_2 = LibraryFunction.remove(w,k);
    ;
    tp_2 = tp-getP(k);
    ;
    y_2 = LibraryFunction.remove(y,k);
    ;
  }
  
  public void mr_check_8() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(getY(k)==1));
    ;
    tp_2 = tp-getP(k);
    ;
    y_2 = LibraryFunction.remove(y,k);
    ;
  }
  
  public void mr_followup_9() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    int l;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    l = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(k<l && getY(k)==1 && getY(l)==1));
    ;
    setP_2(k,getP(k)+getP(l));
    ;
    setW_2(k,getW(k)+getW(l));
    ;
    n_2 = n-1;
    ;
    p_2 = LibraryFunction.remove(p_2,l);
    ;
    w_2 = LibraryFunction.remove(w_2,l);
    ;
    y_2 = LibraryFunction.remove(y_2,l);
    ;
  }
  
  public void mr_check_9() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int n1 = n-1;
    ;
    int k;
    int l;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,n1);
    l = LibraryFunction.select(0,n1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(k<l && getY(k)==1 && getY(l)==1));
    ;
    y_2 = LibraryFunction.remove(y_2,l);
    ;
  }
  
  public void mr_followup_10() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<p.size(); i++){
    if (getY(i)==1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int v = LibraryFunction.sum(p, cond_arr);
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<p.size(); i++){
    if (getY(i)==1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    p_2 = LibraryFunction.remove(p, cond_arr);
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<w.size(); i++){
    if (getY(i)==1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    w_2 = LibraryFunction.remove(w, cond_arr);
    ;
    n_2 = LibraryFunction.size(p_2);
    ;
    c_2 = LibraryFunction.remove(c,0);
    ;
    m_2 = m-1;
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<y.size(); i++){
    if (getY(i)==1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    y_2 = LibraryFunction.remove(y, cond_arr);
    ;
    tp_2 = tp-v;
    ;
  }
  
  public void mr_check_10() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<p.size(); i++){
    if (getY(i)==1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int v = LibraryFunction.sum(p, cond_arr);
    ;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<y.size(); i++){
    if (getY(i)==1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    y_2 = LibraryFunction.remove(y, cond_arr);
    ;
    tp_2 = tp-v;
    ;
  }
  
  public void initMRVar() {
    n_2 = n;
    m_2 = m;
    p_2 = new ArrayList(p);
    w_2 = new ArrayList(w);
    c_2 = new ArrayList(c);
    y_2 = new ArrayList(y);
    tp_2 = tp;
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
    mr_followup_7();
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
    mr_followup_8();
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
    mr_followup_9();
    writeInput(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
    mr_followup_10();
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
    if ((int)m_2 != (int)ans.m) return false;
    for (int i=0; i<n_2; i++){
    if ((int)p_2.get(i) != (int)ans.p.get(i)) return false;
    }
    for (int i=0; i<n_2; i++){
    if ((int)w_2.get(i) != (int)ans.w.get(i)) return false;
    }
    for (int i=0; i<m_2; i++){
    if ((int)c_2.get(i) != (int)ans.c.get(i)) return false;
    }
    for (int i=0; i<n_2; i++){
    if ((int)y_2.get(i) != (int)ans.y.get(i)) return false;
    }
    if ((int)tp_2 != (int)ans.tp) return false;
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
    writer.write("				g.setIs_valid(true);");
    writer.write(System.lineSeparator());
    writer.write("				g.readInput(inFile);");
    writer.write(System.lineSeparator());
    writer.write("				g.mr_followup_7();");
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
    writer.write("				g.mr_followup_8();");
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
    writer.write("				g.mr_followup_9();");
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
    writer.write("				g.mr_followup_10();");
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
    num_mr = 10;
    max_tc = mtc;
    num_subtask = 2;
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
