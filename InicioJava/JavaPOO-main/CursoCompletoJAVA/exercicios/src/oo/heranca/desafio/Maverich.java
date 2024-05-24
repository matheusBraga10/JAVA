package oo.heranca.desafio;

public class Maverich extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Maverich() {
		super(220);
		setDelta(15);
	}


	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		ligarTurbo = true;
		setDelta(35);
	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		ligarTurbo = false;
		setDelta(15); 
	}


	@Override
	public void ligarAr() {
		// TODO Auto-generated method stub
		ligarAr = true;
	}


	@Override
	public void desligarAr() {
		// TODO Auto-generated method stub
		ligarAr = false;
		
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
				return 15;
		} else {
			return 10;
		}
	}
}
