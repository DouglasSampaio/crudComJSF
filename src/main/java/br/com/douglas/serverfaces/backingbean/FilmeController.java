package br.com.douglas.serverfaces.backingbean;

import java.util.List;

import br.com.douglas.serverfaces.bean.Filme;

public class FilmeController {
	private Filme filme = new Filme();
	private List<Filme> listaFilme;

	public String salvar() {
		System.out.println("Chegou no salvar");
		return "";
	}
	
	public String voltar() {
		System.out.println("Chegou no voltar");
		return "";
	}
	
	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public List<Filme> getListaFilme() {
		return listaFilme;
	}

	public void setListaFilme(List<Filme> listaFilme) {
		this.listaFilme = listaFilme;
	}

}
