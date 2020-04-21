package builder;

import java.util.ArrayList;
import java.util.List;

public class Track {
    private String name;
    private TrackType trackType;
    private List<Point> points = new ArrayList<>();

    public String getName() {
        return name;
    }

    public TrackType getTrackType() {
        return trackType;
    }

    public List<Point> getPoints() {
        return points;
    }

    public Track(String name, TrackType trackType, List<Point> points) {
        this.name = name;
        this.trackType = trackType;
        this.points = points;
    }
}
