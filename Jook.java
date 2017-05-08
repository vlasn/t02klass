public class Jook{
	double kogus, suhkur, energia;
	String nimi;
	public Jook(String nimetus, double maht, double suhkrusisaldus, double energiasisaldus){
		if(maht<=0){throw new RuntimeException("Tühi?!");}
		if(nimetus.length() <= 0){throw new RuntimeException("Joogil peab nimi olema!");}
		nimi = nimetus;
		kogus=maht; //Liitrites
		suhkur = suhkrusisaldus; //grammi/100g
		energia = energiasisaldus; //kcal/100g
	}
	public double suhkurPerPurk(){
		return kogus*suhkur*(double)10;
	}

	public double energiaPerPurk(){
		return kogus*energia*(double)10;
	}
	public String toString(){
		return "Joogis nimega "+ nimi + " on " + suhkurPerPurk() + "grammi suhkrut ja "+energiaPerPurk()+" kcal energiat.";
	}
}