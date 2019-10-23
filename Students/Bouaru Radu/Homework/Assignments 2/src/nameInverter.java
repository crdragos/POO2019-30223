
public class nameInverter {
	private String name;

	public nameInverter(String s) {
		if(s == null)
			this.name = null;
		else
		this.name = s;
	}

	public String returnInverted()
	{
		String tested = this.name;
		String x[];
		if(tested != null) 
		{
			 x = tested.split(" ");
			 if(tested == "")
					return "";
				else
				if(x.length == 1)
				{
					if(tested.contains(" "))
						return tested.trim();
					else
						return tested;
				}
				else
				if(x.length == 2)
					return x[1] + " " + x[0];
				else
					if(x.length == 3)
						return x[2] + " " + x[1] + " " + x[0];
					else if(x.length == 4)
						return x[3] + " " + x[2] + " " + x[0] + " " + x[1];
					else
						return "Unknown format!";
		}
		else
		if(tested == null)
			return "Null string, cannot invert";
		
		return tested;
		
	}
}
