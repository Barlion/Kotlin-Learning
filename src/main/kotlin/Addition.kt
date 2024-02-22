fun Addition(num1: Int?, num2: Int?): Int? {
    if (num1 != null && num2 != null) {
        println("The result is: ${num1 + num2}")
        return num1 + num2
    } else {
        println("One or both input numbers are null.")
        return null
    }
}

fun Substraction(num1: Int?, num2: Int?): Int? {
    if (num1 != null && num2 != null) {
        println("The result is: ${num1 - num2}")
        return num1 - num2
    } else {
        println("One or both input numbers are null.")
        return null
    }
}

fun Multiplication(num1: Int?, num2: Int?): Int? {
    if (num1 != null && num2 != null) {
        println("The result is: ${num1 * num2}")
        return num1 * num2
    } else {
        println("One or both input numbers are nulL.")
        return null
    }
}

fun Division(num1: Int?, num2: Int?): Int? {
    if (num1 != null && num2 != null) {
        println("The result is: ${num1 / num2}")
        return num1 / num2
    } else {
        println("One or both input numbers are null.")
        return null
    }
}


