import java.util.Scanner
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    print("Enter your result: ")
    var result = scan.nextInt()
    gradeAndGPA(result)
}

fun gradeAndGPA(result:Int) {
    when {
        result>=80 -> println("You got 'A+'\nYour GPA is: 4.00")
        result>=75 -> println("You got 'A'\nYour GPA is: 3.75")
        result>=70 -> println("You got 'A-'\nYour GPA is: 3.50")
        result>=65 -> println("You got 'B+'\nYour GPA is: 3.25")
        result>=60 -> println("You got 'B'\nYour GPA is: 3.00")
        result>=55 -> println("You got 'B-'\nYour GPA is: 2.75")
        result>=50 -> println("You got 'C+'\nYour GPA is: 2.50")
        result>=45 -> println("You got 'C'\nYour GPA is: 2.25")
        result>=40 -> println("You got 'D'\nYour GPA is: 2.00")
        else -> println("You Failed, try hard next time!!")
    }
}