package sudoku

import kotlin.math.sqrt

fun main() {


}

fun testSudokuValidity(input: List<List<String>>): Boolean {

    if (input.isEmpty()) return false

    val size = input.size

    if (input.any { it.size != size }) return false

    val subgridSize = sqrt(size.toDouble()).toInt()

    if (subgridSize * subgridSize != size) return false



    input.forEach { row ->
        val seen = mutableListOf<String>()
        row.forEach { currentValue ->
            if (currentValue == "-") return@forEach
            val numValue = currentValue.toIntOrNull() ?: return false
            if (numValue < 1 || numValue > size) return false
            if (currentValue in seen) return false
            seen.add(currentValue)
        }
    }

    (0..<size).forEach { column ->
        val seen = mutableListOf<String>()
        (0..<size).forEach { row ->
            val currentValue = input[row][column]
            if (currentValue == "-") return@forEach
            val numValue = currentValue.toIntOrNull() ?: return false
            if (numValue < 1 || numValue > size) return false
            if (currentValue in seen) return false
            seen.add(currentValue)
        }
    }

    (0..<subgridSize).forEach { row ->
        (0..<subgridSize).forEach { column ->
            val seen = mutableListOf<String>()
            (row * subgridSize..<(row + 1) * subgridSize).forEach { subgridRow ->
                (column * subgridSize..<(column + 1) * subgridSize).forEach { subgridColumn ->
                    val currentValue = input[subgridRow][subgridColumn]
                    if (currentValue == "-") return@forEach
                    val numValue = currentValue.toIntOrNull() ?: return false
                    if (numValue < 1 || numValue > size) return false
                    if (currentValue in seen) return false
                    seen.add(currentValue)
                }
            }
        }
    }

    return true
}