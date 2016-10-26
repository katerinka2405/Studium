import java.util.Arrays;

public class GarageArray {

	Auto Stellplatz[];
	int AnzahlAuto;

	public GarageArray() {
		
		Stellplatz = new Auto[2];
	}

	public GarageArray(int i) {
		// TODO Auto-generated constructor stub

	}

	// Hilfsmethode zum lernen
	public int getStellplatzSize() {
		return Stellplatz.length;
	}

	// hinzufügen eines Objects vom Typ 'Auto' zum Stellplatz
	public void addAutoZuGarage(Auto auto) {

		// wir kontrollieren immer von 0 und dann von 1
		for (int i = 0; i < Stellplatz.length; i++) {
			if (Stellplatz[i] == null) 
			{
				Stellplatz[i]=auto;
				break;
			}
			
			// wenn im letzten durchlauf, immer noch kein auto hinzugefügt wurde, dann ist die garage voll
			// ziehe vom array-größe 1 ab, weil wir bei 0 angefangen haben mit dem zählen
			if( i == Stellplatz.length - 1){
				System.out.println("Garage ist belegt");
			}			
		}
	}

	// zählen von geparkten autos
	public void werIstInDerGarage() 
	{
	
		for (int i = 0; i < Stellplatz.length; i++) {
			if (Stellplatz[i] != null) 
			{
				AnzahlAuto=AnzahlAuto+1;
			}		
		}
		System.out.println("In der Garage sind " + AnzahlAuto + " Autos ");

	}

	// zeige auto auf bestimmtem garagenstellplatz an
	public void gibMirDasAutoMitDerId(int id) { 
		for(int i = 0; i < Stellplatz.length; i++){
			if(Stellplatz[i].Id == id){
				System.out.println("gibMirDasAutoMitDerId: Es ist ein " + Stellplatz[i].name + 
						" mit der Id:" + Stellplatz[i].Id + 
						" \nganzes auto: " + Stellplatz[i]);
			}
		}
	
	}
	
	public void gibMirDasAutoMitDemStellplatz(int index){
		if (index>Stellplatz.length-1)
		{
			System.out.println("Es gibt kein Stellplatz mit Index " + index);
		}
		else System.out.println("gibMirDasAutoMitDemStellplatz: Es ist ein " + Stellplatz[index].name + 
				" mit der Id:" + Stellplatz[index].Id + 
				" \nganzes auto: " + Stellplatz[index]);
	}
	
	
	@Override
	public String toString() {
		return "GarageArray [Stellplatz=" + Arrays.toString(Stellplatz) + "]";
	}


}
