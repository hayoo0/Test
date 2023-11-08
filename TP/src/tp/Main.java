package tp;

import java.time.LocalDate;
import java.time.Month;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate madate = LocalDate.of(2023, Month.FEBRUARY, 5);
		Etudiant e1 = new Etudiant("lolo", "toto", "lolo@gmail.com", 1234, madate);
		System.out.println(e1.toString());
		Etudiant e2 = new Etudiant("toto", "toto", "lolo@gmail.com", 1234, madate);
		System.out.println(e1==e2);
		e2.setNom("lolo");
		System.out.println(e2.toString());
		Etudiant e3 = new Etudiant("fifi", "toto", "lolo@gmail.com", 1234, madate);
		Etudiant e4 = new Etudiant("riri", "toto", "lolo@gmail.com", 1234, madate);
		e2.setNom("toto");
		Departement monDepInfo = new Departement("INFO", "biskra");
		monDepInfo.inscrire(e1);
		monDepInfo.inscrire(e3);
		monDepInfo.inscrire(e2);
		monDepInfo.inscrire(e4);
		System.out.println(monDepInfo.toString());
		monDepInfo.disinscrire(e2);
		System.out.println(monDepInfo.toString());


	}

}
