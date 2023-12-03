import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var result:Int = scan.nextInt()
    var GPA:Double = 0.0

    if(result>=80){
        println("You got 'A+'")
        GPA = 4.00
    }else if(result>=75) {
        println("You got 'A'")
        GPA = 3.75
    }else if(result>=70) {
        println("You got 'A-'")
        GPA = 3.50
    }else if(result>=65) {
        println("You got 'B+'")
        GPA = 3.25
    }else if(result>=60) {
        println("You got 'B'")
        GPA = 3.00
    }else if(result>=55) {
        println("You got 'B-'")
        GPA = 2.75
    }else if(result>50) {
        println("You got 'C+'")
        GPA = 2.50
    }else if(result>45) {
        println("You got 'C'")
        GPA = 2.25
    }else if(result>=40) {
        println("You got 'D'")
        GPA = 2.00
    }else {
        println("You Failed, try hard next time!!")
        GPA = 0.00
    }

    println("Your GPA is: ${GPA}")

}