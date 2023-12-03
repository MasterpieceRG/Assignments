import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    print("Enter any year: ")
    var year:Int = scan.nextInt()
    leapYear(year)
}

fun leapYear(year:Int) {
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        println("It is a Leap Year")
    }else {
        println("it is not a Leap Year")
    }
}