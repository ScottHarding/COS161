
public abstract class Pet {
	
	protected String diet="";
	protected String temperalNiche="";
	protected String toxicity="";
	protected String locomotion="";

	public Pet() { }
	public Pet(String d, String tn, String t, String l) { 
		this.diet=d;
		this.temperalNiche=tn;
		this.toxicity=t;
		this.locomotion=l;
	}
	public abstract void setDiet(String d);
	public abstract void setTemperalNiche(String tn);
	public abstract void setToxicity(String t);
	public abstract void setLocomotion(String l);
	public abstract String getDiet();
	public abstract String getTemperalNiche();
	public abstract String getToxicity();
	public abstract String getLocomotion();
}
