import java.util.ArrayList;
import java.util.List;
public class DBWatchman {
    private List<Watchman> watchman;

    public DBWatchman(){
        watchman = new ArrayList<>();

    }
    public void setWatchman(Watchman watchman){
        watchman.add(watchman);
    }
    public List<Watchman> getWatchman() {
        return watchman;
    }

    public void setWatchman(List<Watchman> watchman) {
        this.watchman = watchman;
    }
}
