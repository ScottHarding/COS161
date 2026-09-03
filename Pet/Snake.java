
public class Snake extends Pet{
	private static final String DIET = "Mammals";
	private static final String TEMPERALNICHE = "Cathemeral";
	private static final String TOXICITY = "venomous";
	private static final String LOCOMOTION = "slithering";

	public Snake() {
		super(DIET,TEMPERALNICHE,TOXICITY,LOCOMOTION);
	}

	public Snake(String diet, String temperalNiche, String toxicity, String locomotion ) {
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

}
