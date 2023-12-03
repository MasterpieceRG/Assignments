fun main(args: Array<String>) {
    for(i in 1..7){
        if(i % 2 != 0) {
            for(j in i..7) {
                print(" ")
            }
            for(j in 1..i) {
                print("* ")
            }
            println()
        }

    }
}