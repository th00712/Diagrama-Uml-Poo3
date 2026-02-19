public class Main {
    public static void main(String[] args) {
        Player CDplayer = new CDplayer();
        Player Dvdplayer = new Dvdplayer();

        System.out.println("CDplayer: \n"
        +CDplayer.play()+ "\n"
        +CDplayer.stop()+ "\n"
        +CDplayer.pause()+ "\n"
        +CDplayer.reverse()+"\n");

        System.out.println("Dvdplayer: \n"
                +Dvdplayer.play()+ "\n"
                +Dvdplayer.stop()+ "\n"
                +Dvdplayer.pause()+ "\n"
                +Dvdplayer.reverse()+"\n");
    }
}