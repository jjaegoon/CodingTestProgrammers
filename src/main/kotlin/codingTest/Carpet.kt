package codingTest

class Carpet {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf()
        for (i in 3 until (brown + yellow) / 2) {
            for (j in 3 until (brown + yellow) / 2) {
                if (i * j == brown + yellow) {
                    if((j * 2) + ((i - 2) * 2) == brown) {
                        return intArrayOf(j, i)
                    }
                }
            }
        }
        return answer
    }
}