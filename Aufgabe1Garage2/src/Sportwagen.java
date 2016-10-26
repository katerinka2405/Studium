
public class Sportwagen extends Auto {
	boolean Tiefergelegt;

	public Sportwagen(int id, String name, boolean Tiefergelegt, int pS) 
	{
		super(id, name, pS);
		this.Tiefergelegt = Tiefergelegt;
		// this bezieht sich auf der Klasse Variable ( die 2 sind gleich geschrieben)
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() 
	{
		return "Sportwagen [Name: " + super.name + " Tiefergelegt=" + Tiefergelegt +"   "+ "PS:  "+ super.PS + "]";
	}

}
