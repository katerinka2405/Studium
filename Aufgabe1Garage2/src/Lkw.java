
public class Lkw extends Auto
{
	int Frachtraum; 
	
	public Lkw(int id, String name, int Frachtraum, int pS) 
	{
		super(id, name, pS);
		this.Frachtraum=Frachtraum;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lkw [Name: " + super.name+ "   "+ "Frachtraum: "+  Frachtraum+ "  "+ "PS:  "+ super.PS +   "]\n";
	}

	
}
