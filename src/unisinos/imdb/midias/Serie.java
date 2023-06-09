package unisinos.imdb.midias;

public class Serie extends Audiovisual {

	private int temporadas, episodios;

	public Serie(String codigo, String nomeDoFilme, String diretor, int ano, Genero genero, String[] principaisAtores,
			int temporadas, int episodios) {

		super(codigo, nomeDoFilme, diretor, ano, genero, principaisAtores);
		this.temporadas = temporadas;
		this.episodios = episodios;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	@Override
	public String toString() {
		return "{ # SERIE: temporadas=" + temporadas + " episodios=" + episodios + super.toString() +
				" # }";
	}
}
