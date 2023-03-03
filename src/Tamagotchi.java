public class Tamagotchi {
    int nivel;
    boolean aburrida;
    boolean hambre;
    boolean contenta;

    //constructor
    public Tamagotchi(int nivel, boolean aburrida, boolean hambre, boolean contenta){
        this.nivel= nivel;
        this.aburrida=aburrida;
        this.hambre= hambre;
        this.contenta=contenta;
    }

    //para modificar los datos
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setAburrida(boolean aburrida) {
        this.aburrida = aburrida;
    }
    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }
    public void setContenta(boolean contenta) {
        this.contenta = contenta;
    }

    //para obtener los datos
    public int getNivel() {
        return nivel;
    }
    public boolean isAburrida() {
        return aburrida;
    }
    public boolean isHambre() {
        return hambre;
    }
    public boolean isContenta() {
        return contenta;
    }

    public void comer(){
        if (this.hambre){
            this.contenta=true;
            System.out.println("Esta contenta :)");
            ++this.nivel;
            System.out.println(this.nivel);
        }
        else {
            this.contenta=false;
            System.out.println("No esta contenta, tiene hambre :(");
            System.out.println(this.nivel);
        }
    }
    public void jugar(){
        if (this.aburrida)
        this.aburrida=true;
        System.out.println("No esta aburrieda :)");
        ++this.nivel;
        System.out.println(this.nivel);

    }
}

