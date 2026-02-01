
public class Spotify {

    private Brano brani[];
    private static final int MAX_BRANI = 100;

    public Spotify() {
        brani = new Brano[MAX_BRANI];
    }

    public Spotify(Brano brani[]) {
        this.brani = new Brano[MAX_BRANI];
        if (brani != null) {
            for (int i = 0; i < brani.length; i++) {
                if (brani[i] != null) {
                    this.brani[i] = new Brano(brani[i]);
                }
            }

        }
    }

    public Brano getBrano(int posizione) {
        if (posizione < MAX_BRANI && posizione >= 0) {
            if (brani[posizione] != null) {
                return new Brano(brani[posizione]);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public void AggiungiBrano(String nome, String artista, int durata) {
        for (int i = 0; i < brani.length; i++) {
            if (brani[i] == null) {
                brani[i] = new Brano(nome, artista, durata);
                return;
            }
        }
    }

    public int durataTotale() {
        int durataTotale = 0;
        for (int i = 0; i < brani.length; i++) {
            if (brani[i] != null) {
                durataTotale += brani[i].getDurata();
            }
        }
        return durataTotale;
    }

    public String StampaPlaylist() {
        String s = "Stampo la tua playlist . . . \n";
        for (int i = 0; i < brani.length; i++) {
            if (brani[i] != null) {
                s += brani[i].toString() + "\n";
            }
        }
        return s;
    }

    public String toString() {
        String s = "Stampo la tua playlist . . . \n";
        for (int i = 0; i < brani.length; i++) {
            if (brani[i] != null) {
                s += brani[i].toString() + "\n";
            } else {
                s += "Niente Brano qui" + "\n";
            }
        }
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Spotify)) {
            return false;
        }

        Spotify s = (Spotify) obj;

        for (int i = 0; i < MAX_BRANI; i++) {

            if (this.brani[i] == null && s.brani[i] == null) {
                // ok, entrambi null → non fare nulla
            } else if (this.brani[i] == null || s.brani[i] == null) {
                return false;
            } else if (!this.brani[i].equals(s.brani[i])) {
                return false;
            }
        }

        return true;
    }

}
