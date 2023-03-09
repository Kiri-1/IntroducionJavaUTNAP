public class EjClase3 {

    //1-A)Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
    public static Integer cantApariciones(String palabra, char letra) {
        Integer cont = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                cont++;
            }
        }
        System.out.println(cont);
        return cont;
    }

    //1-B)Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3
    public static int[] numOrdene(int num1, int num2, int num3, boolean orden) {
        int vector[] = new int[]{num1, num2, num3};
        int numAux;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (orden) {
                    if (vector[i] > vector[j]) {
                        numAux = vector[i];
                        vector[i] = vector[j];
                        vector[j] = numAux;
                    }
                } else if (vector[i] < vector[j]) {
                    numAux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = numAux;
                }
            }
        }
        return vector;
    }

    public static void imprimirNumOrden(int num1, int num2, int num3, boolean orden) {
        int[] numeros = numOrdene(num1, num2, num3, orden);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    //1-C) Dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado.

    //Creamos un metodo que trae los numeros ordenados y suma los numeros a partir del numero ingresado por parametro.
    public static int sumarNumOrd(int[] vectorNum, int numero) {
        int[] vector2 = arrayOrdenado(vectorNum, true);
        int resultado = 0;
        for (int i = 0; i < vector2.length; i++) {
            if (vector2[i] > numero) {
                resultado += numero + vector2[i];
            }
        }
        return resultado;
    }

    //recibe y ordena un arrary.
    public static int[] arrayOrdenado(int[] vector, boolean orden) {
        int numAux;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (orden) {
                    if (vector[i] > vector[j]) {
                        numAux = vector[i];
                        vector[i] = vector[j];
                        vector[j] = numAux;
                    }
                } else if (vector[i] < vector[j]) {
                    numAux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = numAux;
                }
            }
        }
        return vector;
    }

    //imprimimos el vector para nada porque somos pendejos y nos confundimos.
    public static void imprimirArrays(int[] vectorNum, int numero) {
        int[] vectorSum = new int[]{sumarNumOrd(vectorNum, numero)};
        for (int i = 0; i < vectorSum.length; i++) {
            System.out.print(vectorSum[i] + " ");
        }
    }

    //2) Genere una clase que tenga los métodos para realizar la codificación y decodificación de un string, dado un número de desplazamiento.
    public static String codificar(String palabra) {
        char letraCifrada;
        String palabraCifrada = "";
        for (int i = 0; i < palabra.length(); i++) {
                    //guardar el caracter cifrado-
                    letraCifrada = (char) (((int) palabra.charAt(i)));
                    palabraCifrada += letraCifrada;
        }
        System.out.println(palabraCifrada);
        return palabraCifrada;
    }


}