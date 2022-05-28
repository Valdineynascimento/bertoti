package main;

public class Locadora {
	public GerenciarEvento evento;
	
	public Locadora() {
		evento = new GerenciarEvento();
	}
	
	public void comediamudanca(String mensagem) {
		evento.notificacao(new Comedia(), mensagem);
	}
	
	public void terrormudanca(String mensagem) {
		evento.notificacao(new Terror(), mensagem);
	}
	public void acaomudanca(String mensagem) {
		evento.notificacao(new Acao(), mensagem);
	}
}
