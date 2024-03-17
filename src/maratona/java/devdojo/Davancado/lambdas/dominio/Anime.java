package maratona.java.devdojo.Davancado.lambdas.dominio;

public class Anime {
	private String tittle;
	private int episodes;

	public Anime(String tittle, int episodes) {
		this.tittle = tittle;
		this.episodes = episodes;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public int getEpisodes() {
		return episodes;
	}

	public void getEpisodes(int episodes) {
		this.episodes = episodes;
	}

	@Override
	public String toString() {
		return "Anime [tittle=" + tittle + ", episodes=" + episodes + "]";
	}

}
