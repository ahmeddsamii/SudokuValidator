package sudoku

import kotlin.math.sqrt

fun main() {


}

fun isSudokuValid(input: List<List<String>>): Boolean {
    // return if input is empty
    if (input.isEmpty()) return false

    // Find the grid size (like 9 for 9×9 grid, 4 for 4×4 grid)
    val size = input.size

    // All rows must have the same size as the grid
    if (input.any { it.size != size }) return false

    // Calculate subgrid size (square root of the grid size)
    val subgridSize = sqrt(size.toDouble()).toInt()

    // If size is not a perfect square (like 9, 4, 16), it's invalid
    if (subgridSize * subgridSize != size) return false

    // Checking for duplication in rows
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

    // Checking for duplication in columns
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

    // Checking for duplication in each subgrid
    (0..<subgridSize).forEach { row ->  // iterate over each subgrid in the row
        (0..<subgridSize).forEach { column -> // iterate over each subgrid in the column
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