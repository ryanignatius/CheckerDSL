import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("all")
public class GeneratedClass {
  private Scanner sc;
  
  private static int cur_lines;
  
  public static void die(final String message) {
    System.out.println(message);
    System.exit(0);
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
  }
  
  private int n;
  
  public int getN() {
    return this.n;
  }
  
  public void setN(final int n) {
    this.n = n;
  }
  
  public void readN(final String token) {
    n = intReader(token);
    if (!validateN(n)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeN() {
    System.out.print(n);
  }
  
  public boolean validateM(final int value, final int subtask) {
    switch (subtask){
  }
  
  private int m;
  
  public int getM() {
    return this.m;
  }
  
  public void setM(final int m) {
    this.m = m;
  }
  
  public void readM(final String token) {
    m = intReader(token);
    if (!validateM(m)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeM() {
    System.out.print(m);
  }
  
  public boolean validateP(final int value, final int subtask) {
    switch (subtask){
  }
  
  private ArrayList p;
  
  public ArrayList getP() {
    return this.p;
  }
  
  public void setP(final ArrayList p) {
    this.p = p;
  }
  
  public void readP(final String[] tokens) {
    p = new ArrayList();
    for (int i=0; i<n; i++){
    	p.add(intReader(tokens[i]));
    	if (!validateP((int)p.get(i))){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readP(final String token, final int idx) {
    p.set(idx,intReader(token));
  }
  
  public void writeP() {
    for (int i=0; i<n; i++){
    	if (i > 0) System.out.print(" ");
    	System.out.print(p.get(i));
    }
    System.out.println();
  }
  
  public void writeP(final int idx) {
    System.out.print(p.get(idx));
  }
  
  public boolean validateW(final int value, final int subtask) {
    switch (subtask){
  }
  
  private ArrayList w;
  
  public ArrayList getW() {
    return this.w;
  }
  
  public void setW(final ArrayList w) {
    this.w = w;
  }
  
  public void readW(final String[] tokens) {
    w = new ArrayList();
    for (int i=0; i<n; i++){
    	w.add(intReader(tokens[i]));
    	if (!validateW((int)w.get(i))){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readW(final String token, final int idx) {
    w.set(idx,intReader(token));
  }
  
  public void writeW() {
    for (int i=0; i<n; i++){
    	if (i > 0) System.out.print(" ");
    	System.out.print(w.get(i));
    }
    System.out.println();
  }
  
  public void writeW(final int idx) {
    System.out.print(w.get(idx));
  }
  
  public boolean validateC(final int value, final int subtask) {
    switch (subtask){
  }
  
  private ArrayList c;
  
  public ArrayList getC() {
    return this.c;
  }
  
  public void setC(final ArrayList c) {
    this.c = c;
  }
  
  public void readC(final String[] tokens) {
    c = new ArrayList();
    for (int i=0; i<m; i++){
    	c.add(intReader(tokens[i]));
    	if (!validateC((int)c.get(i))){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readC(final String token, final int idx) {
    c.set(idx,intReader(token));
  }
  
  public void writeC() {
    for (int i=0; i<m; i++){
    	if (i > 0) System.out.print(" ");
    	System.out.print(c.get(i));
    }
    System.out.println();
  }
  
  public void writeC(final int idx) {
    System.out.print(c.get(idx));
  }
  
  public boolean validateY(final int value, final int subtask) {
    switch (subtask){
  }
  
  private ArrayList y;
  
  public ArrayList getY() {
    return this.y;
  }
  
  public void setY(final ArrayList y) {
    this.y = y;
  }
  
  public void readY(final String[] tokens) {
    y = new ArrayList();
    for (int i=0; i<n; i++){
    	y.add(intReader(tokens[i]));
    	if (!validateY((int)y.get(i))){
    		GeneratedClass.die("value not in valid range");
    	}
    }
  }
  
  public void readY(final String token, final int idx) {
    y.set(idx,intReader(token));
  }
  
  public void writeY() {
    for (int i=0; i<n; i++){
    	if (i > 0) System.out.print(" ");
    	System.out.print(y.get(i));
    }
    System.out.println();
  }
  
  public void writeY(final int idx) {
    System.out.print(y.get(idx));
  }
  
  public boolean validateTp(final int value, final int subtask) {
    switch (subtask){
  }
  
  private int tp;
  
  public int getTp() {
    return this.tp;
  }
  
  public void setTp(final int tp) {
    this.tp = tp;
  }
  
  public void readTp(final String token) {
    tp = intReader(token);
    if (!validateTp(tp)){
    	GeneratedClass.die("value not in valid range");
    }
  }
  
  public void writeTp() {
    System.out.print(tp);
  }
  
  /**
   * input format
   */
  public void readInput() {
    int sz = 0;
    sz = 2;
    if (sc.hasNextLine()){
    String st = sc.nextLine();
    st = st.trim();
    st = st.replaceAll("\\s+", " ");
    String[] tokens = st.split(" ");
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
    if (sc.hasNextLine()){
    String st = sc.nextLine();
    st = st.trim();
    st = st.replaceAll("\\s+", " ");
    String[] tokens = st.split(" ");
    if (tokens.length == sz){
    readP(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+n;
    if (sc.hasNextLine()){
    String st = sc.nextLine();
    st = st.trim();
    st = st.replaceAll("\\s+", " ");
    String[] tokens = st.split(" ");
    if (tokens.length == sz){
    readW(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 0+m;
    if (sc.hasNextLine()){
    String st = sc.nextLine();
    st = st.trim();
    st = st.replaceAll("\\s+", " ");
    String[] tokens = st.split(" ");
    if (tokens.length == sz){
    readC(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
  }
  
  /**
   * output format
   */
  public void readOutput() {
    int sz = 0;
    sz = 0+n;
    if (sc.hasNextLine()){
    String st = sc.nextLine();
    st = st.trim();
    st = st.replaceAll("\\s+", " ");
    String[] tokens = st.split(" ");
    if (tokens.length == sz){
    readY(tokens);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
    sz = 1;
    if (sc.hasNextLine()){
    String st = sc.nextLine();
    st = st.trim();
    st = st.replaceAll("\\s+", " ");
    String[] tokens = st.split(" ");
    if (tokens.length == sz){
    readTp(tokens[0]);
    } else {
    GeneratedClass.die("number of elements in lines not match");
    }
    } else {
    GeneratedClass.die("number of lines not match");
    }
  }
  
  /**
   * output format
   */
  public void writeOutput() {
    writeY();
    writeTp();
    System.out.println();
  }
  
  public void init() {
    sc = new Scanner(System.in);
    GeneratedClass.cur_lines = 1;
    readInput();
    readOutput();
    writeOutput();
  }
}
