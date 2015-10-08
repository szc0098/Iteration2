
public class Values {
	String function;
	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String[] getFactorLevel() {
		return factorLevel;
	}

	public void setFactorLevel(String[] factorLevel) {
		this.factorLevel = factorLevel;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Double getF() {
		return f;
	}

	public void setF(Double f) {
		this.f = f;
	}

	public char getS() {
		return s;
	}

	public void setS(char s) {
		this.s = s;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	String factorLevel[];
	int i;
	double f;
	char s;
	boolean b;
	
	public Values(String f){
		this.function = f;
	}
	
	public Values(String factorlevel[]){
		this.factorLevel = factorlevel;
	}
	
	public Values(int i){
		this.i = i;
	}
	
	public Values(double f){
		this.f = f;
	}
	
	public Values(boolean b){
		this.b = b;
	}
	
	public Values(char s){
		this.s = s;
	}

}
