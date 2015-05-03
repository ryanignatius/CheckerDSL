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
  
  public boolean validateTc(final int value, final int subtask) {
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
  
  private int tc;
  
  private int tc_2;
  
  public int getTc() {
    return this.tc;
  }
  
  public void setTc(final int tc) {
    this.tc = tc;
  }
  
  public int getTc_2() {
    return this.tc_2;
  }
  
  public void setTc_2(final int tc_2) {
    this.tc_2 = tc_2;
  }
  
  public void readTc(final String token) {
    tc = intReader(token);
    if (!validateTc(tc,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeTc() {
    try {
    	writer.write(""+(int)tc);
    } catch (Exception e){}
  }
  
  public void writeTc_2() {
    try {
    	writer.write(""+(int)tc_2);
    } catch (Exception e){}
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
  
  private int w;
  
  private int w_2;
  
  public int getW() {
    return this.w;
  }
  
  public void setW(final int w) {
    this.w = w;
  }
  
  public int getW_2() {
    return this.w_2;
  }
  
  public void setW_2(final int w_2) {
    this.w_2 = w_2;
  }
  
  public void readW(final String token) {
    w = intReader(token);
    if (!validateW(w,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeW() {
    try {
    	writer.write(""+(int)w);
    } catch (Exception e){}
  }
  
  public void writeW_2() {
    try {
    	writer.write(""+(int)w_2);
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
    for (int i=0; i<tokens.length; i++){
    	c.add(intReader(tokens[i]));
    	if (!validateC((int)c.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readC(final String token, final int idx) {
    c.set(idx,intReader(token));
    if (!validateC((int)c.get(idx),current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeC() {
    try {
    	for (int i=0; i<c.size(); i++){
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
    	for (int i=0; i<c_2.size(); i++){
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
    for (int i=0; i<tokens.length; i++){
    	p.add(intReader(tokens[i]));
    	if (!validateP((int)p.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readP(final String token, final int idx) {
    p.set(idx,intReader(token));
    if (!validateP((int)p.get(idx),current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeP() {
    try {
    	for (int i=0; i<p.size(); i++){
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
    	for (int i=0; i<p_2.size(); i++){
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
  
  private ArrayList t;
  
  private ArrayList t_2;
  
  public ArrayList getT() {
    return this.t;
  }
  
  public void setT(final ArrayList t) {
    this.t = t;
  }
  
  public int getT(final int id1) {
    return (int)t.get(id1);
  }
  
  public void setT(final int id1, final Object val) {
    t.set(id1,val);
  }
  
  public int getT_2(final int id1) {
    return (int)t_2.get(id1);
  }
  
  public void setT_2(final int id1, final Object val) {
    t_2.set(id1,val);
  }
  
  public void readT(final String[] tokens) {
    t = new ArrayList();
    for (int i=0; i<tokens.length; i++){
    	t.add(intReader(tokens[i]));
    	if (!validateT((int)t.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readT(final String token, final int idx) {
    t.set(idx,intReader(token));
    if (!validateT((int)t.get(idx),current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeT() {
    try {
    	for (int i=0; i<t.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)t.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeT(final int idx) {
    try {
    	writer.write(""+(int)t.get(idx));
    } catch (Exception e){}
  }
  
  public void writeT_2() {
    try {
    	for (int i=0; i<t_2.size(); i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)t_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeT_2(final int idx) {
    try {
    	writer.write(""+(int)t_2.get(idx));
    } catch (Exception e){}
  }
  
  public boolean validatePoint(final int value, final int subtask) {
    return true;
  }
  
  private int point;
  
  private int point_2;
  
  public int getPoint() {
    return this.point;
  }
  
  public void setPoint(final int point) {
    this.point = point;
  }
  
  public int getPoint_2() {
    return this.point_2;
  }
  
  public void setPoint_2(final int point_2) {
    this.point_2 = point_2;
  }
  
  public void readPoint(final String token) {
    point = intReader(token);
    if (!validatePoint(point,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writePoint() {
    try {
    	writer.write(""+(int)point);
    } catch (Exception e){}
  }
  
  public void writePoint_2() {
    try {
    	writer.write(""+(int)point_2);
    } catch (Exception e){}
  }
  
  public boolean validateY(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((0 <= value && value <= 1)){
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
    for (int i=0; i<tokens.length; i++){
    	y.add(intReader(tokens[i]));
    	if (!validateY((int)y.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readY(final String token, final int idx) {
    y.set(idx,intReader(token));
    if (!validateY((int)y.get(idx),current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeY() {
    try {
    	for (int i=0; i<y.size(); i++){
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
    	for (int i=0; i<y_2.size(); i++){
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
    sz = 1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readTc(tokens[0]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    for (int k=1; k<=tc; k++){
    sz = 2;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readN(tokens[0]);
    readW(tokens[1]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 3;
    c = new ArrayList();
    p = new ArrayList();
    t = new ArrayList();
    for (int i=0; i<n; i++){
    c.add((Object)0);
    p.add((Object)0);
    t.add((Object)0);
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readC(tokens[0],i);
    readP(tokens[1],i);
    readT(tokens[2],i);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
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
    writeTc_2();
    writer.write(System.lineSeparator());
    for (int k=1; k<=getTc_2(); k++){
    writeN_2();
    writer.write(" ");
    writeW_2();
    writer.write(System.lineSeparator());
    for (int i=0; i<n; i++){
    writeC_2(i);
    writer.write(" ");
    writeP_2(i);
    writer.write(" ");
    writeT_2(i);
    writer.write(System.lineSeparator());
    }
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
    sz = 1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readPoint(tokens[0]);
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
    readHidden(i);
    readOutput(i);
    }
    current_testcase++;
    if (current_testcase <= max_testcase){
    readInput(0);
    readHidden(0);
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
    writePoint_2();
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
    sz = 0+n;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz || sz < 0){
    readY(tokens);
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
    writeY_2();
    writer.close();
    } catch(Exception e){}
    System.out.println("Finish write hidden "+mr+"/"+tc+".hidden");
  }
  
  public void mr_followup_1() {
    initMRVar();
    current_mr = 1;
    ArrayList cond_arr;
    int k;
    int l;
    do {
	k = LibraryFunction.random(1,n);
    l = LibraryFunction.random(1,n);
	k--;
	l--;
    } while (!(getP(k)!=getP(l) || getT(k)!=getT(l)));
    c_2 = LibraryFunction.swap(c,k,l);
    p_2 = LibraryFunction.swap(p,k,l);
    t_2 = LibraryFunction.swap(t,k,l);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_1() {
    initMRVar();
  }
  
  public void mr_followup_3() {
    initMRVar();
    current_mr = 3;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,n);
	k--;
    } while (!(getY(k)==0));
    int cc = LibraryFunction.random(0,100);
    setT_2(k,getT(k)+cc);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_3() {
    initMRVar();
  }
  
  public void mr_followup_4() {
    initMRVar();
    current_mr = 4;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,n);
	k--;
    } while (!(getY(k)==0));
    int cc = LibraryFunction.random(0,100);
    setP_2(k,getP(k)-cc);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_4() {
    initMRVar();
  }
  
  public void mr_followup_5() {
    initMRVar();
    current_mr = 5;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<t.size(); i++){
    if (getY(i)==1) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int c1 = LibraryFunction.sum(t, cond_arr);
    setC_2(1,c1);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_5() {
    initMRVar();
  }
  
  public void mr_followup_6() {
    initMRVar();
    current_mr = 6;
    ArrayList cond_arr;
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<c.size(); i++){
    if (getY(i)!=0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int cnew = LibraryFunction.min(c, cond_arr);
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<p.size(); i++){
    if (getY(i)!=0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int pnew = LibraryFunction.min(p, cond_arr);
    cond_arr = new ArrayList<Boolean>();
    for (int i=0; i<t.size(); i++){
    if (getY(i)!=0) cond_arr.add(true);
    else cond_arr.add(false);
    }
    int tnew = LibraryFunction.max(t, cond_arr);
    n_2 = n+1;
    c_2 = LibraryFunction.add(c,cnew);
    p_2 = LibraryFunction.add(p,pnew);
    t_2 = LibraryFunction.add(t,tnew);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_6() {
    initMRVar();
  }
  
  public void mr_followup_7() {
    initMRVar();
    current_mr = 7;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,n);
	k--;
    } while (!(getY(k)==0));
    n_2 = n-1;
    c_2 = LibraryFunction.remove(c,k);
    p_2 = LibraryFunction.remove(p,k);
    t_2 = LibraryFunction.remove(t,k);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_7() {
    initMRVar();
  }
  
  public void mr_followup_8() {
    initMRVar();
    current_mr = 8;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,n);
	k--;
    } while (!(getY(k)==1));
    n_2 = n-1;
    setC_2(1,getC(1)-getT(k));
    c_2 = LibraryFunction.remove(c,k);
    p_2 = LibraryFunction.remove(p,k);
    t_2 = LibraryFunction.remove(t,k);
    point_2 = point-getP(k)*getC(k);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_8() {
    initMRVar();
  }
  
  public void mr_followup_9() {
    initMRVar();
    current_mr = 9;
    ArrayList cond_arr;
    int k;
    int l;
    do {
	k = LibraryFunction.random(1,n);
	k--;
    l = LibraryFunction.random(1,n);
	l--;
    } while (!(getY(k)==1 && getY(l)==1));
    setC_2(k,1);
    setP_2(k,getC(k)*getP(k)+getC(l)*getP(l));
    setT_2(k,getT(k)+getT(l));
    n_2 = n-1;
    c_2 = LibraryFunction.remove(c,l);
    p_2 = LibraryFunction.remove(p,l);
    t_2 = LibraryFunction.remove(t,l);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_9() {
    initMRVar();
  }
  
  public void mr_followup_11() {
    initMRVar();
    current_mr = 11;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,n);
	k--;
    } while (!(getY(k)==1));
    int cc = LibraryFunction.random(0,100);
    setP_2(k,getP(k)+cc);
    point_2 = point+cc*getC(k);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_11() {
    initMRVar();
  }
  
  public void mr_followup_12() {
    initMRVar();
    current_mr = 12;
    ArrayList cond_arr;
    int k;
    do {
	k = LibraryFunction.random(1,n);
	k--;
    } while (!(getY(k)==1));
    int cc = LibraryFunction.random(0,100);
    setC_2(k,getC(k)+cc);
    point_2 = point+cc*getP(k);
    writeInput(current_mr,current_testcase);
    writeHidden(current_mr,current_testcase);
    writeOutput(current_mr,current_testcase);
  }
  
  public void mr_check_12() {
    initMRVar();
  }
  
  public void initMRVar() {
    tc_2 = tc;
    n_2 = n;
    w_2 = w;
    c_2 = new ArrayList(c);
    p_2 = new ArrayList(p);
    t_2 = new ArrayList(t);
    point_2 = point;
    y_2 = new ArrayList(y);
  }
  
  public void mr_start() {
    mr_followup_1();
    mr_followup_3();
    mr_followup_4();
    mr_followup_5();
    mr_followup_6();
    mr_followup_7();
    mr_followup_8();
    mr_followup_9();
    mr_followup_11();
    mr_followup_12();
  }
  
  public void init(final int tc, final int max_tc) {
    sc = new Scanner(System.in);
    current_subtask = 1;
    current_testcase = 1;
    num_tc = tc;
    max_testcase = max_tc;
    current_mr = 0;
    num_mr = 10;
    num_subtask = 1;
    GeneratedClass.cur_lines = 1;
    //readInput(0);
    //readOutput(0);
  }
}
