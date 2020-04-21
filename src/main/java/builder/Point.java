package builder;

import java.time.LocalDateTime;

public class Point {
    private double lat;
    private double lon;
    private double elevation;
    private LocalDateTime time;

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public double getElevation() {
        return elevation;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Point(double lat, double lon, double elevation, LocalDateTime time) {
        if (lat<-90 || lat > 90) {
            throw new IllegalArgumentException();
        }
        if (lon<-180 || lon > 180) {
            throw new IllegalArgumentException();
        }
        this.lat = lat;
        this.lon = lon;
        this.elevation = elevation;
        this.time = time;
    }
}
