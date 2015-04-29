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
  
  public void readM() {
    m = new ArrayList();
    for (int i=0; i<x; i++){
    	ArrayList temp = new ArrayList();
    	for (int j=0; j<y; j++){
    		temp.add(intReader());
    		if (!validateM((int)temp.get(j),current_subtask)){
    			GeneratedClass.die("value not in valid range");
    		}
    	}
    	m.add(temp);
    }
  }
  
  public void readM(final int idx1, final int idx2) {
    ArrayList atemp = (ArrayList) m.get(idx1);
    atemp.set(idx2,intReader());
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
    	for (int i=0; i<x; i++){
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
    readX(tokens[0]);
    readY(tokens[1]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+y;
    if ((line = reader.readLine()) != null){
    line = line.trim();
    line = line.replaceAll("\\s+", " ");
    tokens = line.split(" ");
    if (tokens.length == sz){
    readM(tokens);
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
    sz = 1;
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
    writeNumKey_2();
    writer.write(System.lineSeparator());
    writeO_2();
    writer.close();
    } catch(Exception e){}
  }
  
  public void mr_followup_1() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    int l;
    do {k = LibraryFunction.select();
    l = LibraryFunction.select();
    } while (!(1<=k && k<l && l<=n));
    ;
    m_2 = LibraryFunction.;
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
    } while (!(1<=k && k<l && l<=n));
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
    writeOutput();
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
    writeOutput();
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
    temp = getO(j);
    ;
    setM_2(j,getM(temp));
    ;
    }
    writeOutput();
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
    int k;
    do {k = LibraryFunction.select();
    } while (!(k>=1 && k<numKey));
    ;
    x_2 = x+1;
    ;
    m_2 = LibraryFunction.;
    ;
    for (int j=0; j<y; j++){
    temp = getO(k);
    ;
    k1 = k+1;
    ;
    temp2 = getO(k1);
    ;
    setM_2(x,j,getM(tempj)|getM(temp2j));
    ;
    }
    writeOutput();
  }
  
  public void mr_check_5() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(k>=1 && k<numKey));
    ;
    numKey_2 = numKey+1;
    ;
    k1 = k+1;
    ;
    o_2 = LibraryFunction.remove(o,k1);
    ;
  }
  
  public void mr_followup_6() {
    initMRVar();
    current_mr++;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(k>=2 && k<=numKey));
    ;
    for (int j=0; j<y; j++){
    temp = getO(k);
    ;
    setM_2(1,j,getM(1j)|getM(tempj));
    ;
    }
    writeOutput();
  }
  
  public void mr_check_6() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(k>=2 && k<=numKey));
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
    int k;
    do {k = LibraryFunction.select();
    } while (!(k>=1 && k<=numKey));
    ;
    for (int j=0; j<y; j++){
    temp = getO(k);
    ;
    m_2 = LibraryFunction.;
    ;
    }
    writeOutput();
  }
  
  public void mr_check_7() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!(k>=1 && k<=numKey));
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
    int k;
    do {k = LibraryFunction.select();
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
    writeOutput();
  }
  
  public void mr_check_8() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
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
    int k;
    do {k = LibraryFunction.select();
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
    writeOutput();
  }
  
  public void mr_check_9() {
    initMRVar();
    boolean ok = true;
    ArrayList cond_arr;
    int k;
    do {k = LibraryFunction.select();
    } while (!());
    ;
    numKey_2 = numKey+1;
    ;
    o_2 = LibraryFunction.add(o,k);
    ;
  }
  
  public void initMRVar() {
    x_2 = x;
    y_2 = y;
    m_2 = new ArrayList(m);
    numKey_2 = numKey;
    o_2 = new ArrayList(o);
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
  
  public void init() {
    sc = new Scanner(System.in);
    current_subtask = 1;
    current_testcase = 0;
    current_mr = 0;
    num_mr = 9;
    num_subtask = 0;
    GeneratedClass.cur_lines = 1;
    readInput(0);
    readOutput(0);
    //writeOutput();
  }
}
