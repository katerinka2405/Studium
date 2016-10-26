

import java.util.ArrayList;


public class GarageArrayListe
{
	Auto Stellplatz[];
	
	int AnzahlAuto;
	
	public GarageArrayListe()
	{
		Stellplatz = new Auto[100];
		
	}
	
	public void addAutoZuGarage(Auto auto, int Anzahl)
	{
		for (int x = 0; x < Anzahl; x++)
		
		{
		for (int i = 0; i < Stellplatz.length; i++)
		   {
			 if (Stellplatz[i] == null) 
			       { 
					   Stellplatz[i]=auto;
				       break;
					}
			 
			 if( i == Stellplatz.length - 1){
					System.out.println("Garage ist belegt");
				}
			 
		   }
		
		}
		
	}
	
	public void werIstInDerGarage() 
	{
		// du kontrollierst immer erst den ersten platz und dann den zweiten
		
		for (int i = 0; i < Stellplatz.length; i++) {
			if (Stellplatz[i] != null) 
			{
				AnzahlAuto=AnzahlAuto+1;
			}		
		}
		System.out.println("In der Garage sind " + AnzahlAuto + " Autos " );
	}

	
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

}
