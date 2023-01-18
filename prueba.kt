
        fun displayBorder(character : Char = '=', length: Int = 15) {
            for (i in 1..length) {
                print(character)
            }
        }

        fun main(args: Array<String>) {
            displayBorder(length = 5)
            displayBorder('*',4)
            funcion()
        }

        fun funcion(
                string1: String = "\nHola",
                string2: String = " Mundo",
                entero: Int = 23
        ) {
            println("$string1 $string2 $entero")
        }