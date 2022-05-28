package main;

import java.util.ArrayList;
import java.util.List;

public class GerenciarEvento {
	
	private List<observerevento> canais = new ArrayList<observerevento>();
	
	public void inscrever(observerevento canal) {
		canais.add(canal);
	}
	
	public void desinscrever(observerevento canal) {
		canais.remove(canal);
	}
	
	public void notificacao (observerevento tipogenero, String mensagem) {
		for (observerevento canal : canais) {
			if(canais.getClass() == tipogenero.getClass())
				canal.atualizar(mensagem);
		}
	}
}
