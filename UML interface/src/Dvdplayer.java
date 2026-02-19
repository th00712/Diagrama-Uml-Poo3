public class Dvdplayer implements Player {
    @Override
    public String play() {
        return "play on";
    }

    @Override
    public String stop() {
        return "stop on";
    }

    @Override
    public String pause() {
        return "pause on";
    }

    @Override
    public String reverse() {
        return "reverse on";
    }
}
