import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class GarageHashMap 
{
	int AnzahlAuto;
	
	HashMap <Integer, Auto> StellplaztHm;
		
	
	public GarageHashMap ()
	{
		 StellplaztHm = new HashMap <Integer, Auto>();
			
	}
		
	
	public void addAutoZuGarage(Auto auto, int Anzahl)
	{
		for (int x = 0; x < Anzahl; x++)
		
		{
		for (int i = 0; i <  StellplaztHm.size(); i++)
		   {
			 if ( StellplaztHm == null) 
			       { 
				       StellplaztHm.put(i, auto);
				       break;
					}
			 
			 if( i ==  StellplaztHm.size() - 1){
					System.out.println("Garage ist belegt");
				}
			 
		   }
		}
	}
		public void werIstInDerGarage() 
		{
			// du kontrollierst immer erst den ersten platz und dann den zweiten
			for (int i = 0; i < StellplaztHm.size(); i++) {
				if (StellplaztHm != null) 
				{
					AnzahlAuto=AnzahlAuto+1;
				}		
			}
			System.out.println("In der Garage sind " + AnzahlAuto + " Autos " );
		}
		

}