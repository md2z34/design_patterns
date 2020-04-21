package builder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TrackBuilder {
    private String name;
    private TrackType trackType;
    private List<Point> points = new ArrayList<>();

    public TrackBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public TrackBuilder withTrackType(TrackType trackType) {
        this.trackType = trackType;
        return this;
    }

    public TrackBuilder withPoint(double lat, double lon, double elevation, LocalDateTime time) {
        this.points.add(new Point(lat, lon, elevation, time));
        return this;
    }

    public Track build() {
        if (name == null || name.equals("")) {
            throw new IllegalStateException();
        }
        return new Track(name, trackType, points);
    }
}
