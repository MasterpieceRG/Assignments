import java.util.Scanner
fun main(args: Array<String>) {
    var scan = Scanner(System.`in`)
    var a:Int = scan.nextInt()
    var b:Int = scan.nextInt()
    var c:Int = scan.nextInt()

    if(a>b && a>c) {
        println("maximum is a")
    }else if(b>a && b>c) {
        println("maximum is b")
    }else if(c>a && c>b) {
        println("maximum is c")
    }else if((a==b && a>c)) {
        println("a and b are maximum")
    }else if((a==c && a>b)) {
        println("a and c are maximum")
    }else if((b==c && a>a)) {
        println("b and c are maximum")
    }else {
        println("They all are equal")
    }
}
