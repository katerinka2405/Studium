
public abstract class Auto {
	
	int Id;
	String name;
	int PS;

	public Auto(int id, String name, int pS)
	{
		super();
		Id = id;
		this.name = name;
		PS = pS;
	}

	public int getId() 
	{
		return Id;
	}

	public void setId(int id)
	{
		Id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getPS() 
	{
		return PS;
	}

	public void setPS(int pS)
	{
		PS = pS;
	}

	

}
