public class codigoKotlin {
    public static void displayBorder (char character, int lenght) {
        character = '=';
        lenght = 15;
        for (int i = 0; i<=lenght; i++) {
            System.out.println(character);
        }
    }

    public static void main(String[] args) {
        displayBorder('*',6);
        funcion("\nholii"," mundo", 24);
    }

    public static void funcion(String string1, String string2, int entero) {
        string1 = "\nHola";
        string2 = " Mundo";
        entero = 23;
        System.out.println(string1 +  string2 + entero);
    }
}
