import java.util.Scanner
    var first = 0
    var second = 1
    var fibo = 0

fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    print("Enter terms: ")
    var num = scan.nextInt()

    print("${first} ${second} ")
    fiboSeries(num)
}

fun fiboSeries(num:Int) {
    if(num > 2) {
        fibo = first + second
        first = second
        second = fibo
        print("${fibo} ")
        fiboSeries(num - 1)
    }
}



