class Titik {
	private Double absis;
	private Double ordinat;
	private static int counterTitik;

	public Titik(){
		counterTitik++;
	}

	public void setAbsis(Double a){
		absis = a;
	}

	public void setOrdinat(Double o){
		ordinat = o;
	}

	public Double getAbsis(){
		return absis;
	}

	public Double getOrdinat(){
		return ordinat;
	}

	static int getCounterTitik (){
		return counterTitik;
	}
}