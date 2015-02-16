/*
2. Diseñar la clase  Reloj que señale la hora, minuto y segundo con sus constructores, métodos get y set correspondientes, 
toString() que daraá la hora en horario 12H ó 24H, indicando en este caso si la hora (de 1 a 12 ) es am ó pm. Y un  método validarHora() 
que compruebe que una hora determinada es correcta y lance una excepción de la clase Exception si la hora, minuto o segundo
 no son correctos. 
El constructor con argumentos y un metodo ponHora() deben validar la hora.

 */

public class Hora {
	
	private int hora, min, sec;
	
	public Hora(){
		hora = 0;
		min = 0;
		sec = 0;
	}
	
	public Hora(int hora, int min, int sec) {
		this.hora = hora;
		this.min = min;
		this.sec = sec;
		try {
			this.validar();
		} catch (Exception e) {
			System.out.println("Hora invalida, por defecto 00:00:00");
			this.hora = 0;
			this.min = 0;
			this.sec = 0;
		}
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	public boolean equals(Object hora){
		 if (hora instanceof Hora) 
		    {
		      Hora hor = (Hora) hora;
		      if ( this.toString().equals(hor.toString()) ) 
		         return true;
		    }
	    return false;
	}
	
	public void ponerHora(int hora, int min, int sec){
		Hora nueva = new Hora(hora, min, sec);
		try {
			nueva.validar();
			this.hora = hora;
			this.min = min;
			this.sec = sec;
		} catch (Exception e) {
			System.out.println("Hora incorrecta");
		}
	}
	
	public String toString() {
		return  hora + ":" + min + ":" + sec ;
	}
	
	public String toString2() {
		boolean am = true;
		String h;
		if (hora >= 12){	
			h = (hora -12)+ ":" + min + ":" + sec +" PM";
		}else{
			h = hora + ":" + min + ":" + sec +" AM";
		}
		return  h;
	}
	
	public void validar() throws Exception {
		if ((hora < 0) || (min < 0) || (sec < 0) || (hora > 23) || (min > 59) || (sec > 59)){
			throw new Exception();
		}
	}
}
