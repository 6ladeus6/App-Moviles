import java.util.ArrayList;
import java.util.List;
public class DBAdmin {
    private List<Admin> admin;

    public DBAdmin(){
        admin = new ArrayList<>();

    }
    public void setAdmin(Admin admins){
        admin.add(admins);
    }
    public List<Admin> getAdmin() {
        return admin;
    }

    public void setAdmin(List<Admin> admin) {
        this.admin = admin;
    }
}
