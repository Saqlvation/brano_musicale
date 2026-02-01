
public class TestSpotify {

    public static void main(String[] args) {
        Brano canzone1 = new Brano("GANGSTA MUSICCC", "PAKY", 210);
        Brano canzone2 = new Brano("TAF TAF", "SIMBA LA RUE", 123);
        Brano canzone3 = new Brano("SORROW", "DAMN", 210);

        Brano braniPlaylist[] = {canzone1, canzone2, canzone3};
        Spotify playlist1 = new Spotify(braniPlaylist);
        System.out.println(playlist1);
        Spotify playlist2 = new Spotify();
        playlist2.AggiungiBrano("BRIVIDI", "MAHMOOD E BLANCO", 180);
        playlist2.AggiungiBrano("DUE", "IGHLI", 200);
        System.out.println(playlist2.StampaPlaylist());
    }
}
