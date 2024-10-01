package inheritance;

public class Football extends Cricket {
	protected int goal;
	protected int sal;
	public Football(String playerName, int tshirtNo, String teamName, String country, int age, char gender, int score,
			String fitnessLevel, int goal, int sal) {
		super(playerName, tshirtNo, teamName, country, age, gender, score, fitnessLevel);
		this.goal = goal;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Football [goal=" + goal + ", sal=" + sal + ", score=" + score + ", fitnessLevel=" + fitnessLevel
				+ ", PlayerName=" + PlayerName + ", TshirtNo=" + TshirtNo + ", TeamName=" + TeamName + ", Country="
				+ Country + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
}
