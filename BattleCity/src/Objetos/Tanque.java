package Objetos;

public abstract class Tanque extends GameObject{

	protected int resistencia;
	protected int golpesrecibidos;
	protected int velocidadmovimiento, velocidaddisparo;
	
	
	public abstract Disparo disparar();
	
	public void mover(int x){
	}
	
	public void destruir(){}
}
