package Visitores;

import Obstaculos.Obstaculo;
import Tanques.Enemigo;
import Tanques.Jugador;
import Tanques.Tanque;

public class VisitorTanque extends Visitor {

	@Override
	public boolean VisitarTanque(Tanque t) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean VisitarObstaculo(Obstaculo o) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean visitarJugador(Jugador j) {
		j.UnaVidaMas();
		return true;
	}

	@Override
	public boolean visitarEnemigo(Enemigo e) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void visitarAguila() {
		// TODO Auto-generated method stub

	}

}