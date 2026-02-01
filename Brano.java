
public class Brano {

    private String titolo;
    private String artista;
    private int durata;

    public Brano(String titolo, String artista, int durata) {
        this.titolo = titolo;
        this.artista = artista;
        this.durata = durata;
    }

    public Brano(Brano b) {
        if (b != null) {
            this.titolo = b.titolo;
            this.artista = b.artista;
            this.durata = b.durata;
        } else {
            this.titolo = " ";
            this.artista = " ";
            this.durata = 0;
        }
    }

    public Brano() {
        this.titolo = "default";
        this.artista = "default";
        this.durata = 0;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDurata() {
        return durata;
    }

    @Override
    public String toString() {
        return "Brano: " + titolo + " Artista: " + artista + " Durata: " + durata + " secondi.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Brano)) {
            return false;
        }

        Brano b = (Brano) obj;

        return this.titolo.equals(b.titolo)
                && this.artista.equals(b.artista)
                && this.durata == b.durata;
    }

}
