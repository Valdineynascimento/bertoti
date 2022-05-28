package main;

public class App {
	public static void main(String[] args) {
		Locadora locadoraDoReginaldo = new Locadora();
		
		locadoraDoReginaldo.evento.inscrever(new Terror());
		locadoraDoReginaldo.evento.inscrever(new Terror());
		locadoraDoReginaldo.evento.desinscrever(new Terror());
		locadoraDoReginaldo.evento.inscrever(new Comedia());
		locadoraDoReginaldo.evento.inscrever(new Comedia());
		locadoraDoReginaldo.evento.desinscrever(new Comedia());
		locadoraDoReginaldo.evento.inscrever(new Acao());


		
		
		locadoraDoReginaldo.comediamudanca("HA HA HA Novo Filme");
		locadoraDoReginaldo.terrormudanca("Novo Filme BUHAHAHA ");
		locadoraDoReginaldo.acaomudanca("Novo Filme");
	}
}
