package main.kotlin

class ReversedNumber {

    fun reverse(x: Int): Int {
        val sign = x > 0;
        var y = x;
        var reversedInt = 0;
        while (y != 0) {
            if (reversedInt > Integer.MAX_VALUE / 10 || reversedInt < Integer.MIN_VALUE / 10) {
                return 0
            }
            reversedInt *= 10
            reversedInt += y % 10
            y /= 10;
        }

        return if (reversedInt > 0 == sign) reversedInt else 0
    }

}