import java.util.ArrayList;
import java.util.List;
public class DBAccountant {
    private List<Accountant> accountant;

    public DBAccountant(){
        accountant = new ArrayList<>();

    }
    public void setAccountant(Accountant accountants){
        accountant.add(accountants);
    }
    public List<Accountant> getAccountant() {
        return accountant;
    }

    public void setAccountant(List<Accountant> accountant) {
        this.accountant = accountant;
    }
}
