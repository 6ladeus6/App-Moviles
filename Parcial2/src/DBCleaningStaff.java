import java.util.ArrayList;
import java.util.List;
public class DBCleaningStaff {
    private List<CleaningStaff> cleaningStaff;

    public DBCleaningStaff(){
        cleaningStaff = new ArrayList<>();

    }
    public void setCleaningStaff(CleaningStaff cleaningStaffs){
        cleaningStaff.add(cleaningStaffs);
    }
    public List<CleaningStaff> getCleaningStaff() {
        return cleaningStaff;
    }

    public void setCleaningStaff(List<CleaningStaff> cleaningStaff) {
        this.cleaningStaff = cleaningStaff;
    }
}
