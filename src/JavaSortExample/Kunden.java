package JavaSortExample;

public class Kunden {
    int kundenId;
    private String kundenVorname;
    private String kundenNachname;




    Kunden()
    {

    }


    public int getKundenId() {
        return kundenId;
    }

    public void setKundenId(int kundenId) {
        this.kundenId = kundenId;
    }

    public String getKundenNachname() {
        return kundenNachname;
    }

    public void setKundenNachname(String kundenNachname) {
        this.kundenNachname = kundenNachname;
    }

    public String getKundenVorname() {
        return kundenVorname;
    }

    public void setKundenVorname(String kundenVorname) {
        this.kundenVorname = kundenVorname;
    }
}
