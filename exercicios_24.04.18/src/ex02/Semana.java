package ex02;

public class Semana {
	public diasdasemana getDia(int dia) {
		switch(dia) {
			case 1: return new domingo(); 
			case 2: return new segunda(); 
			case 3: return new terca(); 
			case 4: return new quarta(); 
			case 5: return new quinta(); 
			case 6: return new sexta(); 
			case 7: return new sabado();
			default: return null;
		}
	}
}
