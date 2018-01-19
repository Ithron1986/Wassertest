import java.util.ArrayList;
import java.util.List;

public class Oekosystem {

	double wasser;
	double boden;
	double naehrstoffe;
	double verdunstung;
	double verschattung;
	double exposition;
	double hangneigung;
	double interzeption;
	double infiltration;
	double aufnahmegeschwindigkeitWurzel;
	double bewoelkungsgrad;
	double sonnendauer;
	double sonnenstaerke;
	double energie;
	double abfluss;
	double zufluss;

	double[] samen;
	double[] spross;
	double wachstum;
	boolean neahrstoffmenge;
	boolean wassermenge;
	boolean energiemenge;

	private List<Pflanze> pflanzen;

	public Oekosystem() {
		this.pflanzen = new ArrayList<Pflanze>();
	}

	public void addPflanze() {
		this.pflanzen.add(new Pflanze());
		
	}

	public void growthPeriod() {
		for (Pflanze p : this.pflanzen) {
			p.growth(wasser, energie, naehrstoffe);
		}
	}

}
