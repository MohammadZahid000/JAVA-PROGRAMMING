package inheritance;

public class Sports {
	
	protected String PlayerName;
	protected int TshirtNo;
	protected String TeamName;
	protected String Country;
	protected int age;
	protected char gender;

	
	public Sports(String playerName, int tshirtNo, String teamName, String country, int age, char gender) {
		super();
		PlayerName = playerName;
		TshirtNo = tshirtNo;
		TeamName = teamName;
		Country = country;
		this.age = age;
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Sports [PlayerName=" + PlayerName + ", TshirtNo=" + TshirtNo + ", TeamName=" + TeamName + ", Country="
				+ Country + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
