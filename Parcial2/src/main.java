import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        DBWatchman dbwatchman = new DBWatchman();
        DBCleaningStaff dbCleaningStaff = new DBCleaningStaff();
        DBAccountant dbAccountant = new DBAccountant();
        DBAdmin dbAdmin = new DBAdmin();
        Scanner scanner = new Scanner(System.in);
        boolean flagClose = false;
        while (flagClose == false) {
            System.out.println("Ingrese la opción deseada");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    Watchman watchman = new Watchman();
                    System.out.println("Ingrese el nombre");
                    watchman.setName(scanner.nextLine());
                    System.out.println("Ingrese ID");
                    watchman.setId(scanner.nextLine());
                    System.out.println("Ingrese Su Edad");
                    watchman.setAgge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Ingrese su arma");
                    watchman.setWeapon(scanner.nextLine());
                    System.out.println("Ingrese su dia de trabajo");
                    watchman.setWorkDay(scanner.nextLine());
                    dbwatchman.setWatchman(watchman);
                    break;
                case 2:
                    CleaningStaff cleaningStaff = new CleaningStaff();
                    System.out.println("Ingrese el nombre");
                    cleaningStaff.setName(scanner.nextLine());
                    System.out.println("Ingrese ID");
                    cleaningStaff.setId(scanner.nextLine());
                    System.out.println("Ingrese Su Edad");
                    cleaningStaff.setAgge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Ingrese su Dia Libre");
                    cleaningStaff.setDayOff(scanner.nextLine());
                    dbCleaningStaff.setCleaningStaff(cleaningStaff);
                    break;
                case 3:
                    Accountant accountant = new Accountant();
                    System.out.println("Ingrese el nombre");
                    accountant.setName(scanner.nextLine());
                    System.out.println("Ingrese ID");
                    accountant.setId(scanner.nextLine());
                    System.out.println("Ingrese Su Edad");
                    accountant.setAgge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Ingrese su Lider");
                    accountant.setLeader(scanner.nextLine());
                    System.out.println("Ingrese su parking");
                    accountant.setParking(scanner.nextLine());
                    dbAccountant.setAccountant(accountant);
                    break;
                case 4:
                    Admin admin = new Admin();
                    System.out.println("Ingrese el nombre");
                    admin.setName(scanner.nextLine());
                    System.out.println("Ingrese ID");
                    admin.setId(scanner.nextLine());
                    System.out.println("Ingrese Su Edad");
                    admin.setAgge(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Ingrese su Lider");
                    admin.setLeader(scanner.nextLine());
                    System.out.println("Ingrese su parking");
                    admin.setParking(scanner.nextLine());
                    dbAdmin.setAdmin(admin);
                    break;
                case 5:
                    for(Watchman watchman1: dbwatchman.getWatchman()){
                        System.out.println(watchman1.getName());
                        System.out.println(watchman1.getId());
                        System.out.println(watchman1.getAgge());
                        System.out.println(watchman1.getWeapon());
                        System.out.println(watchman1.getWorkDay());
                    }
                    for(CleaningStaff cleaningStaff1: dbCleaningStaff.getCleaningStaff()){
                        System.out.println(cleaningStaff1.getName());
                        System.out.println(cleaningStaff1.getId());
                        System.out.println(cleaningStaff1.getAgge());
                        System.out.println(cleaningStaff1.getDayOff());
                    }
                    for(Accountant accountant1: dbAccountant.getAccountant()){
                        System.out.println(accountant1.getName());
                        System.out.println(accountant1.getId());
                        System.out.println(accountant1.getAgge());
                        System.out.println(accountant1.getLeader());
                        System.out.println(accountant1.getParking());
                    }
                    for(Admin admin1: dbAdmin.getAdmin()){
                        System.out.println(admin1.getName());
                        System.out.println(admin1.getId());
                        System.out.println(admin1.getAgge());
                        System.out.println(admin1.getLeader());
                        System.out.println(admin1.getParking());
                    }
                    break;
                case 0:
                    flagClose = true;
                    break;
            }

        }
    }
}
