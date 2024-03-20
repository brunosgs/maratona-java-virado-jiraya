package maratona.java.devdojo.Davancado.optional.dominio;

public class Manga {
	private Integer id;
	private String title;
	private int chapters;

	public Manga(Integer id, String title, int chapters) {
		this.id = id;
		this.title = title;
		this.chapters = chapters;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Manga [id=" + id + ", title=" + title + ", chapters=" + chapters + "]";
	}

}
