public class StudentTest {

    private int mathScore;
    private int elaScore;
    private String name;

    public StudentTest(String name, int mathScore, int elaScore){
        this.mathScore = mathScore;
        this.elaScore = elaScore;
        this.name = name;
    }

	public int getMathScore() {
	    return this.mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getElaScore() {
	    return this.elaScore;
	}

	public void setElaScore(int elaScore) {
		this.elaScore = elaScore;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName()
	{
	    this.name = name;
	}

}
