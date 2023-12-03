
//Leap Year program using for loop,range and step
// range = 2000..2050

fun main(args:Array<String>) {

    print("\nLeap years from 2000 to 2050 is :      ")
    for (year in 2000..2050 step 2) {
        if(year % 4 == 0) {
            print("${year} ")
        }
    }

    print("\nNot leap years from 2000 to 2050 is :  ")
    for (year in 2000..2050 step 2) {
        if(year % 4 == 0) {
            continue
        }else {
            print("${year} ")
        }
    }
    println()
}