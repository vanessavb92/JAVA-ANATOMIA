public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando o volume para:"+ this.volume);
        //volume = volume + 1;
    }
}
