public class Main extends PracticaJava {
    public static void main(String[] args) {
//    sumar(5,5.1);

        //verdadero es que si, falso que no.

        Tamagotchi belen = new Tamagotchi(82, 0, false, true, false);
        System.out.println(belen.puedeJugar());
        belen.comer();



//        Tamagotchi nico = new Tamagotchi(0, 0, false, false, false);
//        nico.comer();
//        nico.jugar();
//        nico.mostrarEstado();


    }
}
