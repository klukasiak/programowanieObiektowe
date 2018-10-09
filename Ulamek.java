public class Ulamek {
	private int licznik;
	private int mianownik;

	public Ulamek(int licznik, int mianownik) {
		this.licznik = licznik;
		this.mianownik = mianownik;
	}

	public static Ulamek razy(Ulamek u, Ulamek v) {
		return new Ulamek(u.getLicznik() * v.getLicznik(), u.getMianownik() * v.getMianownik());
	}

	public void mnozPrzez(Ulamek v) {
		licznik *= v.getLicznik();
		mianownik *= v.getMianownik();
	}

	public void mnozPrzez(int i) {
		licznik *= i;
	}

	// Setters and getters
	public int getLicznik() {
		return licznik;
	}

	public void setLicznik(int licznik) {
		this.licznik = licznik;
	}

	public int getMianownik() {
		return mianownik;
	}

	public void setMianownik(int mianownik) {
		this.mianownik = mianownik;
	}

	@Override
	public String toString() {
		return licznik + "/" + mianownik;
	}

	public static void main(String[] args) {
		Ulamek u1 = new Ulamek(1, 2);
		Ulamek u2 = new Ulamek(2, 3);
		System.out.println(u1);
		System.out.println(u2);
		u1.mnozPrzez(2);
		System.out.println(u1);
		u2.mnozPrzez(u1);
		System.out.println(u2);
		Ulamek wynik = Ulamek.razy(u1, u2);
		System.out.println(wynik);
	}
}
