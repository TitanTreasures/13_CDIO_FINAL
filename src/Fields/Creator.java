package Fields;

public class Creator {
	
	public static void createFields(){
		
		createTerritory();
		createFleet();
		createLaborcamp();
		
		

	}
	
	static Territory rødovrevej;
	static Territory hvidovrevej;
	static Territory valbylanggade;
	static Territory roskildevej;
	static Territory allegade;
	static Territory frederiksbergalle;
	static Territory bulowsvej;
	static Territory glkongevej;
	static Territory bernstoffsvej;
	static Territory hellerupvej;
	static Territory strandvejern;
	static Territory østerbrogade;
	static Territory trianglen;
	static Territory grønningen;
	static Territory bredgade;
	static Territory kgsNytov;
	static Territory østergade;
	static Territory vimmelskaftet;
	static Territory amagertov;
	static Territory nygade;
	static Territory fredderiksbergade;
	static Territory rådhuspladsen;
	
	

	private static void createTerritory(){
		// Blue Fields
		rødovrevej = new Territory(1200, 50, 250, 750, 2250, 4000, 6000, 1000, 600, 2, "Rødovrevej");
		hvidovrevej = new Territory(1200, 50, 250, 750, 2250, 4000, 6000, 1000, 600, 4, "Hvidovrevej");
		// Orange Fields		
		valbylanggade = new Territory(2000, 100, 600, 1800, 5400, 8000, 11000, 1000, 1000, 7, "Valbylanggade");
		roskildevej = new Territory(2000, 100, 600, 1800, 5400, 8000, 11000, 1000, 1000, 9, "Roskildevej");
		allegade = new Territory(2400, 150, 600, 1800, 5400, 8000, 11000, 1000, 1000, 10, "Allegade");
		// Green Fields
		frederiksbergalle = new Territory(2800, 200, 1000, 3000, 9000, 12500, 15000, 2000, 1400, 12, "Frederiksbergalle");
		bulowsvej = new Territory(2800, 200, 1000, 3000, 9000, 12500, 15000, 2000, 1400, 14, "Bülowsvej");
		glkongevej = new Territory(3200, 250, 1250, 3750, 10000, 14000, 18000, 2000, 1600, 15, "Gl. Kongevej");
		// Gray Fields
		bernstoffsvej = new Territory(3600, 300, 1400, 4000, 11000, 15000, 19000, 2000, 1800, 17, "Bernstoffsvej");
		hellerupvej = new Territory(3600, 300, 1400, 4000, 11000, 15000, 19000, 2000, 1800, 19, "Bernstoffsvej");
		strandvejern = new Territory(4000, 350, 1600, 4400, 12000, 16000, 20000, 2000, 2000, 20, "Strandvejen");
		// Red Fields
		østerbrogade = new Territory(4400, 350, 1800, 5000, 14000, 17500, 21000, 3000, 2200, 22, "Østerbrogade");
		trianglen = new Territory(4400, 350, 1800, 5000, 14000, 17500, 21000, 3000, 2200, 24, "Trianglen");
		grønningen = new Territory(3800, 400, 2000, 6000, 15000, 18500, 2200, 3000, 2400, 25, "Grønningen");
		// White Fields
		bredgade = new Territory(5200, 450, 2200, 6600, 16000, 19500, 23000, 3000, 2600, 27, "Bredgade");
		kgsNytov = new Territory(5200, 450, 2200, 6600, 16000, 19500, 23000, 3000, 2600, 28, "Kgs. Nytov");
		østerbrogade = new Territory(5600, 500, 2400, 7200, 17000, 20500, 24000, 3000, 2800, 30, "Østergade");
		// Yellow Fields
		vimmelskaftet = new Territory(6000, 550, 2600, 7800, 18000, 22000, 25000, 4000, 3000, 32, "Vimmelskaftet");
		amagertov = new Territory(6000, 550, 2600, 7800, 18000, 22000, 25000, 4000, 3000, 33, "Amagertov");
		nygade = new Territory(6400, 600, 3000, 9000, 20000, 24000, 28000, 4000, 3200, 35, "Nygade");
		// Purple Fields
		fredderiksbergade = new Territory(7000, 700, 3500, 10000, 22000, 26000, 30000, 4000, 3500, 38, "Frederiksberggade");
		rådhuspladsen = new Territory(8000, 1000, 4000, 12000, 28000, 34000, 40000, 4000, 4000, 40, "Rådhuspladsen");

		
		
	}
	@SuppressWarnings("unused")
	private static void createFleet(){
		
		Fleet rederi1 = new Fleet(0, 0, 0, "Rederi1");
		Fleet rederi2 = new Fleet(0, 0, 0, "Rederi2");
		Fleet rederi3 = new Fleet(0, 0, 0, "Rederi3");
		Fleet rederi4 = new Fleet(0, 0, 0, "Rederi4");
		
	}
	@SuppressWarnings("unused")
	private static void createLaborcamp(){
		
		Laborcamp tuborg = new Laborcamp(0, 0, 0, "Tuborg");
		Laborcamp cola = new Laborcamp(0, 0, 0, "CocaCola");
		
	}
	

	
	
	
	

}
