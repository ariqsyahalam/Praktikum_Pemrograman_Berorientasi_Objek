public class Manusia {
    private String name;
    private int umur;
    private boolean isMale;

    public Manusia() {

    };

    public Manusia(String n, int u, boolean iM) {
        name = n;
        umur = u;
        isMale = iM;

    };

    public void setName(String n){
        name = n;
    }

    public String getName() {
        return name;
    }
}