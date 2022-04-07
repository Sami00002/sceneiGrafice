import java.util.ArrayList;

public class ScenaGrafica {

	public static void main(String[] args) {

		ArrayList<Figura> scenaGrafica = new ArrayList<Figura>();
		Figura f1 = new Patrat(Culoare.ALBASTRU, 5);
		Figura f2 = new Triunghi(Culoare.ALBASTRU, 5, 6, 7);
		Figura f3 = new Cerc(Culoare.ALBASTRU, 7);
		Figura f4 = new Patrat(Culoare.ALBASTRU, 15);

		scenaGrafica.add(f1);
		scenaGrafica.add(f2);
		scenaGrafica.add(f3);
		scenaGrafica.add(f4);
		scenaGrafica.remove(f2);

		System.out.println(scenaGrafica);
	}
}