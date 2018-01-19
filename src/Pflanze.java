
public class Pflanze {

	int size;
	
	void growth(double wasser, double energie, double naehrstoffe) {
		if (naehrstoffe >= 1 && wasser >=1 && energie >= 1) {
			this.size++;
			System.out.println("Deine Pflanze ist gewachsen");
		}
	}
}
