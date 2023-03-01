import java.util.ArrayList;

public class Ristorante {

	private ArrayList<Pietanza> listaPietanze;;
	private double contoAperto = 0;

	public Ristorante() {
		this.listaPietanze = new ArrayList<Pietanza>();
	}

	public Ristorante(ArrayList<Pietanza> listaPietanze) {
		this.listaPietanze = listaPietanze;
	}

	public void ordina(int index, Utente x, int userID) {
		if (this.listaPietanze.get(index).getPrezzo() < x.budget.get(userID)) {
			
			if (index < listaPietanze.size()) {
				System.out.println("Hai ordinato" + this.listaPietanze.get(index).getNome());
				this.contoAperto += this.listaPietanze.get(index).getPrezzo();
				x.budget.set(userID, (x.budget.get(userID) - (int)this.listaPietanze.get(index).getPrezzo()));
				System.out.println("Ordine Confermato il tuo budget restante: "+x.budget.get(userID));
			}
		}else{
			System.out.println("Non hai abbastanza soldi");
		}

	}

	public void visualizza(int index) {
		System.out.println(listaPietanze.get(index).getIngredienti());
	}

	public void aggiungiPietanza(Pietanza pietanza) {
		this.listaPietanze.add(pietanza);
	}

	public double getContoAperto() {
		return contoAperto;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < this.listaPietanze.size(); i++) {
			result.append((i) + ") " + listaPietanze.get(i) + "\n");
		}
		return result.toString();
	}

}