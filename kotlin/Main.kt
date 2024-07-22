import kotlin.random.Random

fun generatePassword(length: Int): String {
    val upperCase = ('A'..'Z').toList()
    val lowerCase = ('a'.. 'z').toList()
    val number = ('0' .. '9').toList()
    val special = listOf('!', '@', '#', '$', '%', '¨', '&', '*', '(', ')')

    val allChars = upperCase + lowerCase + number + special

    return (1..length)
        .map { Random.nextInt(0, allChars.size) }
        .map(allChars::get)
        .joinToString("")

}
fun main(){
    val passwordLength = 12
    val  password = generatePassword(passwordLength)
    println("Generate Password: $password")
}