import java.io.*;

class Czytanie{
    final int ogr = 200 ;            // ograniczenie na ilosc danych
    String[] tab = new String[ogr] ; // tablica napisow
    int ile ;                        // ilosc danych

    // czytanie z pliku do tablicy tab
    void czytaj(String plikWe) throws IOException{
      BufferedReader br = new BufferedReader(new FileReader(plikWe));
      String linia ; 
      ile = 0 ; 
      while ((linia = br.readLine()) != null)  
         if (linia.length() > 0) {
			int n = Integer.parseInt(linia); 
			linia = Integer.toOctalString(n);
			tab[ile++] = linia;
		 }
      br.close() ;
    }
    
    // drukowanie tablicy tab[]
    void pisz(){
       int i;
       for (i=0; i<ile ; i++)
          System.out.println(tab[i]) ;
    }
	
	void naOsemkowy(){
		int max = tab[0].length();
		int i;
		
		for(i = 0; i<ile; i++){
			if(tab[i].length() > max){
				max = tab[i].length();
			}
		}
		
		for(i = 0; i<ile; i++){
			while(tab[i].length() < max){
				tab[i] = "." + tab[i];
			}
		}
	}
	
    public static void main(String[] args) throws Exception{
        Czytanie cz = new Czytanie() ;
        if (args.length >=1){
              cz.czytaj(args[0]);
              cz.naOsemkowy();
              cz.pisz();
        }
        else
            System.err.println("Uzycie: Czytanie plik_wejsciowy");
    }
}
