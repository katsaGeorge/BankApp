package gr.aueb.cf.model;

public class User extends IdentifiableEntity {
    private String firstaname;
    private String lastanme;
    private String ssn;


    public User(){}

    public User(String firstaname, String lastanme, String ssn) {
        this.firstaname = firstaname;
        this.lastanme = lastanme;
        this.ssn = ssn;
    }

    //Ccopy Constructor

    public User(User user){
        firstaname = user.getFirstaname();
        lastanme = user.getLastanme();
        ssn = user.getSsn();
    }

    public String getFirstaname() {
        return firstaname;
    }

    public void setFirstaname(String firstaname) {
        this.firstaname = firstaname;
    }

    public String getLastanme() {
        return lastanme;
    }

    public void setLastanme(String lastanme) {
        this.lastanme = lastanme;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstaname='" + firstaname + '\'' +
                ", lastanme='" + lastanme + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
