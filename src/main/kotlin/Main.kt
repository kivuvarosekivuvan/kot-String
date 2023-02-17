import javax.sql.RowSet

fun main() {
    val school = "AkiraChix"
    print(school[0])
    print(school[2])
    print(school[3])
    println()

    var sentence = personalDetails("Rose", "23")
    println(sentence)

    val country = "Tanzania"
    println(country.length)

    var report = "Rose"
    var report2 = "Sandra"
    if (report.equals(report2)) {
        println("That me!")
    } else {
        println("I don't know who that is")}

}
fun personalDetails( x: String , y: String) :String{
    var sentence="Hi,my name is $x and I am $y years"
    return(sentence)
}


























