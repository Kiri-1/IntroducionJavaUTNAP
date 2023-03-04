public class Tamagotchi {
    int tiempo;
    int nivel;
    boolean aburrida;
    boolean hambre;
    boolean contenta;

    //constructor
    public Tamagotchi(int tiempo, int nivel, boolean aburrida, boolean hambre, boolean contenta) {
        this.tiempo = tiempo;
        this.nivel = nivel;
        this.aburrida = aburrida;
        this.hambre = hambre;
        this.contenta = contenta;
    }

    //para modificar los datos
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

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
    public int getTiempo() {
        return tiempo;
    }

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

    public void mostrarEstado() {
        System.out.println("Nivel: " + this.nivel);
        System.out.println("¿Esta aburrida? " + this.aburrida);
        System.out.println("¿Tiene hambre? " + this.hambre);
        System.out.println("¿Esta contenta? " + this.contenta);
    }

    //metodo comer
    public void comer() {
        if (this.hambre && !this.aburrida) {
            this.contenta = true;
            this.hambre = false;
            ++this.nivel;
            mostrarEstado();

        } else {
            if (this.aburrida && this.tiempo > 80) {
                this.contenta = true;
                mostrarEstado();
            } else {
                mostrarEstado();
            }
        }
    }

    //metodo jugar
    public void jugar() {
        if (this.aburrida || this.contenta && !this.hambre) {
            this.contenta = true;
            System.out.println("Esta contenta :)");
            this.nivel = this.nivel + 2;
            this.aburrida = this.contenta;
            mostrarEstado();
        } else {
            System.out.println("Tiene hambre, no pasa nada si juega");
        }
    }

    //    Una mascota puede jugar si está contenta o aburrida, si está hambrienta no.
    public boolean puedeJugar() {
        if (this.contenta || this.aburrida ){
            return true;
        } else {
            return false;
        }
    }

}

