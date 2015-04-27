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
    if ((1 <= value && value <= 100)){
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
    	for (int i=0; i<n; i++){
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
    	for (int i=0; i<n; i++){
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
    	for (int i=0; i<m; i++){
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
    	for (int i=0; i<n; i++){
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
    sz = 1;
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
    } else {
    }
    }
  }
  
  /**
   * output format
   */
  public void writeOutput() {
    try {
    File wfile = new File("tc/Subtask"+current_subtask+"/out/"+current_mr+"/"+current_testcase+".out");
    if(!wfile.exists()) wfile.createNewFile();
    fw = new FileWriter(wfile);
    writer = new BufferedWriter(fw);
    writeY_2();
    writeTp_2();
    writer.write(System.lineSeparator());
    writer.close();
    } catch(Exception e){}
  }
  /*
  public boolean output_check() {
    ArrayList cond_arr;
    boolean ok = true;
    if (!(ans.tp==out.tp)) ok = false;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<in.p.size(); i++){
    if (out.getY(i)>0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    if (!(LibraryFunction.sum(in.p, cond_arr)==out.tp)) ok = false;
    for (int j=0; j<m; j++){
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<in.w.size(); i++){
    if (out.getY(i)==j) cond_arr.add(true);
    else cond_arr.add(false);
    }
    if (!(LibraryFunction.sum(in.w, cond_arr)<=in.getC(j))) ok = false;
    }
    return ok;
  }
  */
  public void mr_followup_1() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    int l;
    do {k = LibraryFunction.select();
    l = LibraryFunction.select();
    } while (!(1<=k && k<l && l<=n && getP(k)!=getP(l) || getW(k)!=getW(l)));
    ;
    p_2 = LibraryFunction.swap(p,k,l);
    ;
    w_2 = LibraryFunction.swap(w,k,l);
    ;
    writeOutput();
  }
  
  public void mr_check_1() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    int l;
    do {k = LibraryFunction.select();
    l = LibraryFunction.select();
    } while (!(1<=k && k<l && l<=n && getP(k)!=getP(l) || getW(k)!=getW(l)));
    ;
    y_2 = LibraryFunction.swap(y,k,l);
    ;
  }
  
  public void mr_followup_2() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(getY(k)==1));
    ;
    int cc = LibraryFunction.random(0,100);
    setP_2(k,getP(k)+cc);
    ;
    writeOutput();
  }
  
  public void mr_check_2() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(getY(k)==1));
    ;
    int cc = LibraryFunction.random(0,100);
    tp_2 = tp+cc;
    ;
  }
  
  public void mr_followup_3() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(getY(k)==0));
    ;
    int cc = LibraryFunction.random(0,100);
    setW_2(k,getW(k)+cc);
    ;
    writeOutput();
  }
  
  public void mr_check_3() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(getY(k)==0));
    ;
    int cc = LibraryFunction.random(0,100);
  }
  
  public void mr_followup_4() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(getY(k)==0));
    ;
    int cc = LibraryFunction.random(0,100);
    setP_2(k,getP(k)-cc);
    ;
    writeOutput();
  }
  
  public void mr_check_4() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(getY(k)==0));
    ;
    int cc = LibraryFunction.random(0,100);
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
    setC_2(1,c1);
    ;
    writeOutput();
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
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<w.size(); i++){
    if (getY(i)!=0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int wnew = LibraryFunction.max(w, cond_arr);
    n_2 = n+1;
    ;
    p_2 = LibraryFunction.add(p,pnew);
    ;
    w_2 = LibraryFunction.add(w,wnew);
    ;
    writeOutput();
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
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<w.size(); i++){
    if (getY(i)!=0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int wnew = LibraryFunction.max(w, cond_arr);
    y_2 = LibraryFunction.add(y,0);
    ;
  }
  
  public void mr_followup_7() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(getY(k)==0));
    ;
    n_2 = n-1;
    ;
    p_2 = LibraryFunction.remove(p,k);
    ;
    w_2 = LibraryFunction.remove(w,k);
    ;
    writeOutput();
  }
  
  public void mr_check_7() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(getY(k)==0));
    ;
    y_2 = LibraryFunction.remove(y,k);
    ;
  }
  
  public void mr_followup_8() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(getY(k)==1));
    ;
    n_2 = n-1;
    ;
    setC_2(1,getC(1)-getW(k));
    ;
    p_2 = LibraryFunction.remove(p,k);
    ;
    w_2 = LibraryFunction.remove(w,k);
    ;
    writeOutput();
  }
  
  public void mr_check_8() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
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
    int k;
    int l;
    do {k = LibraryFunction.select();
    l = LibraryFunction.select();
    } while (!(1<=k && k<l && l<=n && getY(k)==1 && getY(l)==1));
    ;
    setP_2(k,getP(k)+getP(l));
    ;
    setW_2(k,getW(k)+getW(l));
    ;
    n_2 = n-1;
    ;
    p_2 = LibraryFunction.remove(p,l);
    ;
    w_2 = LibraryFunction.remove(w,l);
    ;
    writeOutput();
  }
  
  public void mr_check_9() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    int l;
    do {k = LibraryFunction.select();
    l = LibraryFunction.select();
    } while (!(1<=k && k<l && l<=n && getY(k)==1 && getY(l)==1));
    ;
    y_2 = LibraryFunction.remove(y,l);
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
    n_2 = LibraryFunction.size(p);
    ;
    c_2 = LibraryFunction.remove(c,0);
    ;
    m_2 = m-1;
    ;
    writeOutput();
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
    mr_followup_2();
    mr_followup_3();
    mr_followup_4();
    mr_followup_5();
    mr_followup_6();
    mr_followup_7();
    mr_followup_8();
    mr_followup_9();
    mr_followup_10();
  }
  
  public void init() {
    sc = new Scanner(System.in);
    current_subtask = 1;
    current_testcase = 0;
    current_mr = 0;
    num_mr = 10;
    num_subtask = 1;
    GeneratedClass.cur_lines = 1;
    readInput(0);
    readOutput(0);
    //writeOutput();
  }
}
