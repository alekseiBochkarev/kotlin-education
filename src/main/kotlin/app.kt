fun main() {
    println("hello metanit.com")
    println("just a fun")
    println("new string")
    val age: Int
    var weight: Float
    age = 23
    weight = 23.5f
    weight = 287.4f
    println("age " + age + " weight " + weight);
    val a: Byte = -10
    val b: Short = 45
    val c: Int = -250
    val d: Long = 30000
    println(a) // -10
    println(b) // 45
    println(c) // -250
    println(d) // 30000
    val a1: UByte = 10U
    val b1: UShort = 45U
    val c1: UInt = 250U
    val d1: ULong = 30000U
    println(a1) // 10
    println(b1) // 45
    println(c1) // 250
    println(d1) // 30000
    val a3: Boolean = true
    val b3: Boolean = false
    val name: String = "Eugene"
    val text: String = "SALT II was a series of talks between United States \n and Soviet negotiators from 1972 to 1979"
    println(name)
    println(text)
    val text2: String = """
                        SALT II was a series of talks between United States
                        and Soviet negotiators from 1972 to 1979.
                        It was a continuation of the SALT I talks.
                    """
    println(text2)
    val firstName = "Tom"
    val lastName = "Smith"
    val welcome = "Hello, $firstName $lastName"
    println(welcome)    // Hello, Tom Smith
    val nameNew = "Tom"
    println(nameNew)
    var nameAny: Any = "Tom"
    println(nameAny)   // Tom
    nameAny = 6758
    println(nameAny)

    print("Введите имя: ")
    val your_name = readLine()

    println("Ваше имя: $your_name")
    logic_operation()
    if_else_operation()
    if_return_value()
    when_function()
    when_special()
    when_super_special()
    when_like_if_else()
}

fun logic_operation() {
    not_equal()
    and_function()
    or_function()
    xor_function()
    not_function()
    in_function()
}

fun if_else_operation() {
    val a = 10
    if (a == 10) {
        println("a равно 10")
    } else if (a == 9) {
        println("a равно 9")
    } else if (a == 8) {
        println("a равно 8")
    } else {
        println("a имеет неопределенное значение")
    }
}

fun not_equal() {
    val a = 11
    val b = 12
    val c = a != b      // true
    val d = b != 12     // false
}

fun and_function() {
    val a = true
    val b = false
    val c = a and b                         // false
    val d = (11 >= 5) and (9 < 10)     // true
    println(c)
    println(d)
}

fun or_function() {
    val a = true
    val b = false
    val c = a or b                          // true
    val d = (11 < 5) or (9 > 10)     // false
}

fun xor_function() {
    val a = true
    val b = false
    val c = a xor b                 // true
    val d = a xor (90 > 10)      // false
}

fun not_function() {
    val a = true
    val b = !a  // false
    val c = !b  // true
    val a1 = true
    val b1 = a1.not()  // false
    val c1 = b1.not()  // true
}

fun in_function() {
    val a = 5
    val b = a in 1..6       // true - число 5 входит в последовательность от 1 до 6

    val c = 4
    val d = c in 11..15     // false - число 4 НЕ входит в последовательность от 11 до 15
}
// comments like a java
fun if_return_value () {
    val a = 10
    val b = 20
    val c = if (a > b){
        println("a = $a")
        a
    } else {
        println("b = $b")
        b
    }
    println(c)
}

fun when_function() {
    var a = 10
    when(a){
        10 -> {
            println("a = 10")
            a *= 2
        }
        20 -> {
            println("a = 20")
            a *= 5
        }
        else -> { println("неопределенное значение")}
    }
    println(a)

    val b = 10
    when(b){
        in 10..19 -> println("a в диапазоне от 10 до 19")
        in 20..29 -> println("a в диапазоне от 20 до 29")
        !in 10..20 -> println("a вне диапазона от 10 до 20")
        else -> println("неопределенное значение")
    }
}

fun when_special () {
    val a = 10
    val b = 5
    val c = 3
    when(a){
        b - c -> println("a = b - c")
        b + 5 -> println("a = b + 5")
        else -> println("неопределенное значение")
    }
}

fun when_super_special () {
    val a = 10
    val b = 20
    when(a + b){
        10 -> println("a + b = 10")
        20 -> println("a + b = 20")
        30 -> println("a + b = 30")
        else -> println("Undefined")
    }
}

fun when_like_if_else () {
    val sum = 1000

    val rate = when(sum){
        in 100..999 -> 10
        in 1000..9999 -> 15
        else -> 20
    }
    println(rate)       // 15
    val a = 15
    val b = 6
    when{
        (b > 10) -> println("b больше 10")
        (a > 10) -> println("a больше 10")
        else -> println("и a, и b меньше или равны 10")
    }
}
class app {
}