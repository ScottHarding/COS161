
public class Cat extends Pet{
	private static final String DIET = "Mice";
	private static final String TEMPERALNICHE = "Crepuscular";
	private static final String TOXICITY = "none";
	private static final String LOCOMOTION = "quadreped";
	private String hairLength = "short";

	public Cat() {
		super(DIET,TEMPERALNICHE,TOXICITY,LOCOMOTION);
	}
	public Cat(String h) {
		super(DIET,TEMPERALNICHE,TOXICITY,LOCOMOTION);
		this.hairLength=h;
	}

	public Cat(String diet, String temperalNiche, String toxicity, String locomotion ) {
		setDiet(diet);
		setTemperalNiche(temperalNiche);
		setToxicity(toxicity);
		setLocomotion(locomotion);
	}


	@Override
	public void setDiet(String d) {
		this.diet = d;
	}

	@Override
	public void setTemperalNiche(String tn) {
		this.temperalNiche = tn;
	}

	@Override
	public void setToxicity(String t) {
		this.toxicity = t;
	}

	@Override
	public void setLocomotion(String l) {
		this.locomotion = l;
	}

	@Override
	public String getDiet() {
		return this.diet;
	}

	@Override
	public String getTemperalNiche() {
		return this.temperalNiche;
	}

	@Override
	public String getToxicity() {
		return this.toxicity;
	}

	@Override
	public String getLocomotion() {
		return this.locomotion;
	}

	public String getHairLength() {
		return this.hairLength;
	}

}