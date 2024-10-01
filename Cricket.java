package inheritance;

public class Cricket extends Sports {
	protected int score;
	protected String fitnessLevel;
	
	public Cricket(String playerName, int tshirtNo, String teamName, String country, int age, char gender, int score,
			String fitnessLevel) {
		super(playerName, tshirtNo, teamName, country, age, gender);
		this.score = score;
		this.fitnessLevel = fitnessLevel;
	}

	@Override
	public String toString() {
		return "Cricket [score=" + score + ", fitnessLevel=" + fitnessLevel + ", PlayerName=" + PlayerName
				+ ", TshirtNo=" + TshirtNo + ", TeamName=" + TeamName + ", Country=" + Country + ", age=" + age
				+ ", gender=" + gender + "]";
	}

	

	
	
}
