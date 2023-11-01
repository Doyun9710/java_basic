class Modifier2 {
    private String hakbun;

    // getter
    public String getHakbun() {
        return hakbun;
    }

    // setter
    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }
}

public class ModifierEx02 {
    public static void main(String[] args) {
        Modifier2 m = new Modifier2();
        
        m.setHakbun("1001");
        System.out.println(m.getHakbun());
    }
}
