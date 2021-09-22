fun main() {
    println(loveFun(4, 4))
    isPrime(5)
}

fun loveFun(flowerA: Int, flowerB: Int): Boolean {
    // moment of truth
    var pairA = (flowerA % 2 == 0)
    var pairB = (flowerB % 2 == 0)

    return (pairA && !pairB) || (!pairA && pairB)
}

fun bouncingBall(h: Double, bounce: Double, window: Double): Int {

    //validate
    if (h <= 0) return -1
    if (bounce in 1.0..0.0) return -1
    if (window > h) return -1

    var bounces = 0
    var currentHeight = h

    do {
        bounces += 1
        currentHeight *= bounce
        if (currentHeight > window) {
            bounces += 1
        }
    } while (currentHeight > window)

    return bounces
}

fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return (number % divisor) == 0
}

fun isPrime(number: Int): Boolean {

    for (i in 2 until number) {

        if (isNumberDivisible(number, i) || number <= 0) {
            return false
        }
    }
    return true
}

fun fibo(i: Int): Int {

    if (i <= 0) {
        return 0
    }

    if (i <= 2) {
        return 1
    }

    return fibo(i - 1) + fibo(i - 2)
}

fun divideIfWhole(value: Int, divisor: Int): String? {
    if ((value % divisor) == 0) {
        return "yep, it divisible $divisor times"
    }

    return "not divisible :["
}

fun feast(beast: String, dish: String): Boolean
{
    return beast.first() == dish.first() && beast.last() == dish.last()
}

fun makeUpperCase(str: String): String {
    return str.toUpperCase()
}

