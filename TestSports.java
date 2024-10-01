package inheritance;

public class TestSports {

	public static void main(String[] args) {
		  Sports sports=new Sports("Zahid", 18, "INDIA","INDIA",24,'M');
		     System.out.println(sports);
		     System.out.println("=============");
		     Cricket cricket=new Cricket("Yash", 18, "INDIA","INDIA",24,'M',88,"GOOD");
		     System.out.println(cricket);
		     System.out.println("=================");
		     Football football=new Football("Smith", 18, "AUSTRALIA","AUSTRALIA",24,'M',88,"GOOD",35,800000);
		     System.out.println(football);
		     
           
			}



	}

