package tp;

import java.time.LocalDate;
import java.time.Month;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate madate = LocalDate.of(2023, Month.FEBRUARY, 5);
		Etudiant e1 = new Etudiant("lolo", "toto", "lolo@gmail.com", 1234, madate);
		System.out.println(e1.toString());
		Etudiant e2 = new Etudiant("lolo", "toto", "lolo@gmail.com", 1234, madate);
		System.out.println();

	}

}
