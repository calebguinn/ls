public class LastShip {
    private static final int NUMBER = 40;
    private int numberOfEpisodes = NUMBER;

    public boolean isEmpty(){
        return numberOfEpisodes == 0;
    }

    public void watchOneEpisode() {

        int e = NUMBER - numberOfEpisodes;
        String waves = calculateWaves(e);
        int displayedEpisodeNumber = e + 1;
        System.out.println("Episode " 
                            + waves
                            + "|___/~~ " 
                            + " Number "
                            + displayedEpisodeNumber
        );
        --numberOfEpisodes;
    }

    public String calculateWaves(int n){
        String str ="";
        if (n == 0)
            str = "~";
        else
            str = "~" + calculateWaves(n-1);
        return str;
    }
    

}