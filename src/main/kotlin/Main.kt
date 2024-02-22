import com.sun.tools.javac.Main

fun main() {

    println("Please enter the First number: ")
    var num1 = readLine()?.toIntOrNull() ?: run {
      println("Invalid input for the first number.")
      return
    }
    println("Please enter the Second number: ")
    var num2 = readLine()?.toIntOrNull() ?: run {
      println("Invalid input for the first number.")
      return
    }

    do {
      println("\n")
      println("Please select an operation:")
      println("1. Addition")
      println("2. Substaraction")
      println("3. Multiplicattion")
      println("4. Division")
      println("5. Change operands")
      println("6. Exit")
      val choice = readLine()?.toIntOrNull()


      when (choice) {
        1 -> Addition(num1, num2)
        2 -> Substraction(num1, num2)
        3 -> Multiplication(num1, num2)
        4 -> Division(num1, num2)
        5 -> main()
        6 -> break
        else -> println("You entered an invalid choice")
      }
    } while (choice != 6)
}