fun main() {
    println("hello metanit.com")
    println("just a fun")
    println("new string")
    val age: Int
    var weight : Float
    age = 23
    weight = 23.5f
    weight = 287.4f
    println("age " + age + " weight " + weight );
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
}
// comments like a java

class app {
}