import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;




public class Main 
{

	public static void main(String[] args) 
	{
		Sportwagen oPorsche= new Sportwagen(0," Porsche ",true, 550);
		System.out.println(oPorsche);
		
		Sportwagen vw = new Sportwagen(11, "VW", false, 200);	
		System.out.println(vw);
		
		Lkw oLkw= new Lkw (1100,"Lkw", 200, 625);
		System.out.println(oLkw);
		
		GarageArray oGarageArray= new GarageArray(); // создаем массив
        System.out.println(oGarageArray);
       System.out.println(oGarageArray.getStellplatzSize());
        
        
        // 1. auto parken
        oGarageArray.addAutoZuGarage(oPorsche);
        System.out.println(oGarageArray);
        
        // 2. auto parken
       oGarageArray.addAutoZuGarage(vw);
       System.out.println(oGarageArray);

        // 3. auto parken
        //oGarageArray.addAutoZuGarage(oLkw);
        //System.out.println(oGarageArray);
        
        oGarageArray.werIstInDerGarage();
        
        
        oGarageArray.gibMirDasAutoMitDemStellplatz(0);
        oGarageArray.gibMirDasAutoMitDemStellplatz(1);
        oGarageArray.gibMirDasAutoMitDemStellplatz(10000);
        oGarageArray.gibMirDasAutoMitDemStellplatz(2);
        

		
		// 2 ArrayListe 
		
        System.out.println("------------ArrayListe Test----------------");
		
		GarageArrayListe oGarageArrayListe = new GarageArrayListe();
		 
		oGarageArrayListe.addAutoZuGarage(oLkw,50);
		oGarageArrayListe.addAutoZuGarage(oLkw,50);
		
		oGarageArrayListe.werIstInDerGarage();//+
		 //oGarageArrayListe.gibMirDasAutoMitDerId(1100);// +
		oGarageArrayListe.gibMirDasAutoMitDemStellplatz(1);
		
		
		// haspMap
		
	    //Map<Auto, Integer> hmgarage = new HashMap<Auto, Integer>();
	
		//System.out.println("HashmapTest");
		
		//hmgarage.put(oLkw,1);
	    
		//GarageHashMap hmgarage= new GarageHashMap(); es funktioniert noch nicht 
		//hmgarage.addAutoZuGarage(oLkw, 5);
		//hmgarage.werIstInDerGarage();
		
		// Map<Integer, Auto> hmgarage = new HashMap<Integer, Auto>();
		
		// Получаем набор элементов
		//Set<Entry<Integer,Auto>> set = hmgarage.entrySet();
		
		//for (Map.Entry<Integer, Auto> me : set) {
		//	System.out.print(me.getKey() + ": ");
		//	System.out.println(me.getValue());
		//}
		
		//hmgarage.werIstInDerGarage();

		 
		 oGarageArrayListe.werIstInDerGarage();//+
		 //oGarageArrayListe.gibMirDasAutoMitDerId(1100);// +
		 oGarageArrayListe.gibMirDasAutoMitDemStellplatz(1);
		 
		
		/*
        
        
       
        
/*        
		oGarageArray.addAutoZuGarage(oPorsche);
		oGarageArray.addAutoZuGarage(oLkw); 
		
		oGarageArray.werIstInDerGarage();
		*/
		
		

	}

}


