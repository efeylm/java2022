package intro;

public class Main {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//degişken isimlendirmeleri javada camelCase yazılır
	
		System.out.println("Hello World!");
		
		String ortaMetin= "İlginizi çekebilir";
		String altMetin="Vade süresi";
		
		System.out.println(ortaMetin);
		//integer
		int vade=12;
		
		double dolarDun=18.30;
		double dolarBugun=18.10;
		boolean dolarDustuMu = false; //true or false
		
		String okYonu="";
		
		if (dolarDun<dolarBugun) {
			okYonu="down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun<dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		} 
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		//array
		
		String[] krediler= {"Hızlı Kredi","Maaşını Halkbanktan","Mutlu Emekli"};
		
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);			
		}
		
		
	}

}
