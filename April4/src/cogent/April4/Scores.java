package cogent.April4;

public class Scores {
	private Double maths;
	private Double physics;
	private Double chemestry;
	public Double getMaths() {
		return maths;
	}
	public void setMaths(Double maths) {
		this.maths = maths;
	}
	public Double getPhysics() {
		return physics;
	}
	public void setPhysics(Double physics) {
		this.physics = physics;
	}
	public Double getChemestry() {
		return chemestry;
	}
	public void setChemestry(Double chemestry) {
		this.chemestry = chemestry;
	}
	@Override
	public String toString() {
		return "Scores\nmath: " + maths+"\nphysics: "+physics+"\nchemestry: "+chemestry+"\n";
	}
	
}
