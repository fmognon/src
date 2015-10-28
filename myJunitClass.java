public class myJunitClass {
	public int add(int a, int b){
		return a + b;
	}
	
	public String conCat (String a, String b) {
		return a + b;
		
	}

	public int calcularMaffetoneMax(int i) {
		return 180 - i;
	}
	public int calcularMaffetoneMin(int i) {
		return  calcularMaffetoneMax(i) - 10;
	}
	
	public int calcularMaffetoneMaxCasoA(int i) {
		return 180 - i -10;
	}
	public int calcularMaffetoneMinCasoA(int i) {
		return  calcularMaffetoneMaxCasoA(i) - 10;
	}
	
	public int calcularMaffetoneMaxCasoB(int i) {
		return 180 - i -5;
	}
	public int calcularMaffetoneMinCasoB(int i) {
		return  calcularMaffetoneMaxCasoB(i) - 10;
	}

	public double calcularFrielZona1(int i) {
		return (i * 0.85);
	}
	
	public double calcularFrielZona2(int i) {
		return (i * 0.89);
	}
	
	public double calcularFrielZona3(int i) {
		return (i * 0.94);
	}
	
	public double calcularFrielZona4(int i) {
		return (i * 0.99);
	}
	
	public double calcularFrielZona5a(int i) {
		return (i * 1.02);
	}
	
	public double calcularFrielZona5b(int i) {
		return (i * 1.06);
	}
	
	public double calcularFrielZona5c(int i) {
		return (i * 1.06);
	}
	//bike
	public double calcularFrielBikeZona1(int i) {
		return (i * 0.81);
	}
	
	public double calcularFrielBikeZona2(int i) {
		return (i * 0.89);
	}
	
	public double calcularFrielBikeZona3(int i) {
		return (i * 0.93);
	}
	
	public double calcularFrielBikeZona4(int i) {
		return (i * 0.99);
	}
	
	public double calcularFrielBikeZona5a(int i) {
		return (i * 1.02);
	}
	
	public double calcularFrielBikeZona5b(int i) {
		return (i * 1.06);
	}
	
	public double calcularFrielBikeZona5c(int i) {
		return (i * 1.06);
	}
}