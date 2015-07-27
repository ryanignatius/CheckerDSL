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
  
  public boolean validateX(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((1 <= value && value <= 100)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private int x;
  
  private int x_2;
  
  public int getX() {
    return this.x;
  }
  
  public void setX(final int x) {
    this.x = x;
  }
  
  public int getX_2() {
    return this.x_2;
  }
  
  public void setX_2(final int x_2) {
    this.x_2 = x_2;
  }
  
  public void readX(final String token) {
    x = intReader(token);
    if (!validateX(x,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeX() {
    try {
    	writer.write(""+(int)x);
    } catch (Exception e){}
  }
  
  public void writeX_2() {
    try {
    	writer.write(""+(int)x_2);
    } catch (Exception e){}
  }
  
  public boolean validateY(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((1 <= value && value <= 100)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private int y;
  
  private int y_2;
  
  public int getY() {
    return this.y;
  }
  
  public void setY(final int y) {
    this.y = y;
  }
  
  public int getY_2() {
    return this.y_2;
  }
  
  public void setY_2(final int y_2) {
    this.y_2 = y_2;
  }
  
  public void readY(final String token) {
    y = intReader(token);
    if (!validateY(y,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeY() {
    try {
    	writer.write(""+(int)y);
    } catch (Exception e){}
  }
  
  public void writeY_2() {
    try {
    	writer.write(""+(int)y_2);
    } catch (Exception e){}
  }
  
  public boolean validateM(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((0 <= value && value <= 1)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private ArrayList m;
  
  private ArrayList m_2;
  
  public ArrayList getM() {
    return this.m;
  }
  
  public void setM(final ArrayList m) {
    this.m = m;
  }
  
  public void readM(final String[] tokens, final int idx1) {
    if (idx1 == 0) m = new ArrayList();
    ArrayList temp = new ArrayList();
    for (int i=0; i<y; i++){
    	temp.add(intReader(tokens[i]));
    	if (!validateM((int)temp.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
    m.add(temp);
  }
  
  public void readM(final String token, final int idx1, final int idx2) {
    ArrayList atemp = (ArrayList) m.get(idx1);
    atemp.set(idx2,intReader(token));
    m.set(idx1,atemp);
  }
  
  public void writeM() {
    try {
    	for (int i=0; i<x; i++){
    		for (int j=0; j<y; j++){
    			if (j > 0) writer.write(" ");
    			writer.write(""+(int)((ArrayList)m.get(i)).get(j));
    		}
    		writer.write(System.lineSeparator());
    	}
    } catch (Exception e){}
  }
  
  public void writeM(final int idx1, final int idx2) {
    try {
    	writer.write(""+(int)((ArrayList)m.get(idx1)).get(idx2));
    } catch (Exception e){}
  }
  
  public void writeM_2() {
    try {
    	for (int i=0; i<x; i++){
    		for (int j=0; j<y; j++){
    			if (j > 0) writer.write(" ");
    			writer.write(""+(int)((ArrayList)m_2.get(i)).get(j));
    		}
    		writer.write(System.lineSeparator());
    	}
    } catch (Exception e){}
  }
  
  public void writeM_2(final int idx1) {
    try {
    	ArrayList temp = (ArrayList)m.get(idx1);
    	for (int j=0; j<y; j++){
    		if (j > 0) writer.write(" ");
    		writer.write(""+(int)temp.get(j));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeM_2(final int idx1, final int idx2) {
    try {
    	writer.write(""+(int)((ArrayList)m_2.get(idx1)).get(idx2));
    } catch (Exception e){}
  }
  
  public boolean validateNumKey(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((1 <= value && value <= x)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private int numKey;
  
  private int numKey_2;
  
  public int getNumKey() {
    return this.numKey;
  }
  
  public void setNumKey(final int numKey) {
    this.numKey = numKey;
  }
  
  public int getNumKey_2() {
    return this.numKey_2;
  }
  
  public void setNumKey_2(final int numKey_2) {
    this.numKey_2 = numKey_2;
  }
  
  public void readNumKey(final String token) {
    numKey = intReader(token);
    if (!validateNumKey(numKey,current_subtask)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeNumKey() {
    try {
    	writer.write(""+(int)numKey);
    } catch (Exception e){}
  }
  
  public void writeNumKey_2() {
    try {
    	writer.write(""+(int)numKey_2);
    } catch (Exception e){}
  }
  
  public boolean validateO(final int value, final int subtask) {
    switch (subtask){
    default :
    if ((1 <= value && value <= x)){
    return true;
    } else {
    return false;
    }
    }
  }
  
  private ArrayList o;
  
  private ArrayList o_2;
  
  public ArrayList getO() {
    return this.o;
  }
  
  public void setO(final ArrayList o) {
    this.o = o;
  }
  
  public int getO(final int id1) {
    return (int)o.get(id1);
  }
  
  public void setO(final int id1, final Object val) {
    o.set(id1,val);
  }
  
  public int getO_2(final int id1) {
    return (int)o_2.get(id1);
  }
  
  public void setO_2(final int id1, final Object val) {
    o_2.set(id1,val);
  }
  
  public void readO(final String[] tokens) {
    o = new ArrayList();
    for (int i=0; i<x; i++){
    	o.add(intReader(tokens[i]));
    	if (!validateO((int)o.get(i),current_subtask)){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readO(final String token, final int idx) {
    o.set(idx,intReader(token));
  }
  
  public void writeO() {
    try {
    	for (int i=0; i<x; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)o.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeO(final int idx) {
    try {
    	writer.write(""+(int)o.get(idx));
    } catch (Exception e){}
  }
  
  public void writeO_2() {
    try {
    	for (int i=0; i<x_2; i++){
    		if (i > 0) writer.write(" ");
    		writer.write(""+(int)o_2.get(i));
    	}
    	writer.write(System.lineSeparator());
    } catch (Exception e){}
  }
  
  public void writeO_2(final int idx) {
    try {
    	writer.write(""+(int)o_2.get(idx));
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
    readX(tokens[0]);
    readY(tokens[1]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    for (int i=0; i<x; i++){
    sz = 0+y;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readM(tokens,i);
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
    readX(tokens[0]);
    readY(tokens[1]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    for (int i=0; i<x; i++){
    sz = 0+y;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readM(tokens,i);
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
    writeX_2();
    writer.write(" ");
    writeY_2();
    writer.write(System.lineSeparator());
    for (int i=0; i<x; i++){
    writeM_2(i);
    }
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
    writeX_2();
    writer.write(" ");
    writeY_2();
    writer.write(System.lineSeparator());
    for (int i=0; i<x; i++){
    writeM_2(i);
    }
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
    sz = 0+1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readNumKey(tokens[0]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+numKey;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readO(tokens);
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
    sz = 0+1;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readNumKey(tokens[0]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+numKey;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readO(tokens);
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
    writeNumKey_2();
    writer.write(System.lineSeparator());
    writeO_2();
    writer.close();
    } catch(Exception e){}
  }
  /*
  public void mr_followup_1() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int y1 = y-1;
    ;
    int k;
    int l;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,y1);
    l = LibraryFunction.select(0,y1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(k<l));
    ;
    m_2 = LibraryFunction.;
    ;
  }
  
  public void mr_check_1() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int y1 = y-1;
    ;
    int k;
    int l;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,y1);
    l = LibraryFunction.select(0,y1);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!(k<l));
    ;
  }
  
  public void mr_followup_2() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    x_2 = x+1;
    ;
    m_2 = LibraryFunction.;
    ;
    for (int j=0; j<y; j++){
    setM_2(x,j,0);
    ;
    }
  }
  
  public void mr_check_2() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
  }
  
  public void mr_followup_3() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    y_2 = y+1;
    ;
    m_2 = LibraryFunction.;
    ;
    for (int i=0; i<x; i++){
    setM_2(i,y,0);
    ;
    }
  }
  
  public void mr_check_3() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
  }
  
  public void mr_followup_4() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    for (int j=0; j<numKey; j++){
    int temp = getO(j);
    ;
    setM_2(j,getM(temp));
    ;
    }
  }
  
  public void mr_check_4() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
  }
  
  public void mr_followup_5() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int nk = numKey-2;
    ;
    int k = LibraryFunction.random(0,nk);
    ;
    x_2 = x+1;
    ;
    m_2 = LibraryFunction.;
    ;
    for (int j=0; j<y; j++){
    int temp = getO(k);
    ;
    int k1 = k+1;
    ;
    int temp2 = getO(k1);
    ;
    setM_2(x,j,getM(tempj)|getM(temp2j));
    ;
    }
    numKey_2 = numKey+1;
    ;
    int k1 = k+1;
    ;
    o_2 = LibraryFunction.remove(o,k1);
    ;
  }
  
  public void mr_check_5() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int nk = numKey-2;
    ;
    int k = LibraryFunction.random(0,nk);
    ;
    numKey_2 = numKey+1;
    ;
    int k1 = k+1;
    ;
    o_2 = LibraryFunction.remove(o,k1);
    ;
  }
  
  public void mr_followup_6() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int nk = numKey-1;
    ;
    int k = LibraryFunction.random(1,nk);
    ;
    for (int j=0; j<y; j++){
    int temp = getO(k);
    ;
    setM_2(1,j,getM(1j)|getM(tempj));
    ;
    }
    numKey_2 = numKey-1;
    ;
    o_2 = LibraryFunction.remove(o,k);
    ;
  }
  
  public void mr_check_6() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int nk = numKey-1;
    ;
    int k = LibraryFunction.random(1,nk);
    ;
    numKey_2 = numKey-1;
    ;
    o_2 = LibraryFunction.remove(o,k);
    ;
  }
  
  public void mr_followup_7() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int nk = numKey-1;
    ;
    int k = LibraryFunction.random(0,nk);
    ;
    for (int j=0; j<y; j++){
    int temp = getO(k);
    ;
    m_2 = LibraryFunction.;
    ;
    }
    numKey_2 = numKey-1;
    ;
    m_2 = LibraryFunction.;
    ;
    o_2 = LibraryFunction.remove(o,k);
    ;
  }
  
  public void mr_check_7() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int nk = numKey-1;
    ;
    int k = LibraryFunction.random(0,nk);
    ;
    numKey_2 = numKey-1;
    ;
    m_2 = LibraryFunction.;
    ;
    o_2 = LibraryFunction.remove(o,k);
    ;
  }
  
  public void mr_followup_8() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int nk = numKey-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,nk);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!());
    ;
    y_2 = y+1;
    ;
    m_2 = LibraryFunction.;
    ;
    for (int i=0; i<x; i++){
    setM_2(i,y,1);
    ;
    setM_2(i,y,0);
    ;
    }
    numKey_2 = numKey+1;
    ;
    o_2 = LibraryFunction.add(o,k);
    ;
  }
  
  public void mr_check_8() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int nk = numKey-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,nk);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!());
    ;
    numKey_2 = numKey+1;
    ;
    o_2 = LibraryFunction.add(o,k);
    ;
  }
  
  public void mr_followup_9() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int nk = numKey-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,nk);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!());
    ;
    y_2 = y+1;
    ;
    m_2 = LibraryFunction.;
    ;
    for (int i=0; i<y; i++){
    setM_2(k,i,0);
    ;
    }
    numKey_2 = numKey+1;
    ;
    o_2 = LibraryFunction.add(o,k);
    ;
  }
  
  public void mr_check_9() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int nk = numKey-1;
    ;
    int k;
    loop_counter = 0;
    do {k = LibraryFunction.select(0,nk);
    loop_counter++;
    if (loop_counter >= max_loop_counter){
    is_valid = false;
    break;
    }
    } while (!());
    ;
    numKey_2 = numKey+1;
    ;
    o_2 = LibraryFunction.add(o,k);
    ;
  }
  */
  public void initMRVar() {
    x_2 = x;
    y_2 = y;
    m_2 = new ArrayList(m);
    numKey_2 = numKey;
    o_2 = new ArrayList(o);
  }
  
  public void mr_start() {
	  /*
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
    */
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
    if ((int)x_2 != (int)ans.x) return false;
    if ((int)y_2 != (int)ans.y) return false;
    for (int i=0; i<x_2; i++){
    for (int j=0; j<y_2; j++){
    if ((int)((ArrayList)m_2.get(i)).get(j) != (int)((ArrayList)ans.m.get(i)).get(j)) return false;
    }
    }
    if ((int)numKey_2 != (int)ans.numKey) return false;
    for (int i=0; i<x_2; i++){
    if ((int)o_2.get(i) != (int)ans.o.get(i)) return false;
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
    readInput("tc/Subtask1/in/0/1.in");
    readOutput("tc/Subtask1/out/0/1.out");
	initMRVar();
    writeInput("test.in");
	/*
	num_mr = 9;
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
	*/
  }
}
