package pol.estival.dam.mp09.uf02.a02;

public class ExecucioFils {

	public void executa() {

		 //execucioSenseFils();
		//execucioAmbFils();

		execucio();
	}

	private CronoThread cronoA = null;
	private CronoThread cronoB = null;
	private CronoThread cronoC = null;
	private CronoThread cronoD = null;
	private CronoThread cronoE = null;
	private CronoThread cronoF = null;
	private CronoThread cronoG = null;

	private void inicialitzaFils() {
		cronoA = new CronoThread("Crono A", 10);
		cronoB = new CronoThread("Crono B", 7);
		cronoC = new CronoThread("Crono C", 6);
		cronoD = new CronoThread("Crono D", 8);
		cronoE = new CronoThread("Crono E", 9);
		cronoF = new CronoThread("Crono F", 3);
		cronoG = new CronoThread("Crono G", 4);
	}
	
	private void execucio() {
		inicialitzaFils();
		
		cronoA.start();
		cronoB.start();
		try {
			cronoB.join(2000);
		} catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		cronoC.start();
		cronoD.start();
		try {
			cronoD.join();
		} catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		cronoE.start();
		try {
			cronoE.join(5000);
		} catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		cronoF.start();
		cronoG.start();
	}
}
