package sudoku

fun main() {

    //region Board Size Validation Tests
    check(
        name = "Given a board with specific size and enter value out range this size in any cell (for example 9x9) , when call isSudokuValid then should return false",
        result = testSudokuValidity(
            listOf(
                listOf("5", "3", "4", "6", "11", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )



    check(
        name = "Given a board 15x16, when call isSudokuValid then should return false",
        result = testSudokuValidity(
            listOf(
                listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"),
                listOf("5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4"),
                listOf("9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8"),
                listOf("13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"),
                listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1"),
                listOf("6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5"),
                listOf("10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9"),
                listOf("14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"),
                listOf("3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2"),
                listOf("7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6"),
                listOf("11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"),
                listOf("15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"),
                listOf("4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3"),
                listOf("8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7"),
                listOf("12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"),
                listOf("16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15")
            )
        ),
        correctResult = false
    )

    check(
        name = "Given a board 16x15, when call isSudokuValid then should return false",
        result = testSudokuValidity(
            listOf(
                listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"),
                listOf("6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4"),
                listOf("10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8"),
                listOf("14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"),
                listOf("3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1"),
                listOf("7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5"),
                listOf("11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9"),
                listOf("15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"),
                listOf("4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2"),
                listOf("8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6"),
                listOf("12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"),
                listOf("16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"),
                listOf("5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3"),
                listOf("9", "10", "11", "12", "13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7"),
                listOf("13", "14", "15", "16", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"),
                listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15")
            )
        ),
        correctResult = false
    )



    check(
        name = "Given a valid board 4x4, when call isSudokuValid then should return true ",
        result = testSudokuValidity(
            listOf(
                listOf("1","2","3","4"),
                listOf("3","4","1","2"),
                listOf("2","1","4","3"),
                listOf("4","3","2","1"),
            )
        ),
        correctResult = true
    )


    check(
        name = "Given an empty board, when call isSudokuValid then should return false",
        result = testSudokuValidity(
            emptyList()
        ),
        correctResult = false
    )


    check(
        name = "Given a board with invalid size (Not square), when call isSudokuValid then should return false",
        result = testSudokuValidity(
            listOf(
                listOf("5", "3", "4", "6", "h", "8", "9", "1"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )
    //endregion


    //region Row Validation Tests
    check(
        name = "Given a sudoku board that have a dash symbol in row, when call isSudokuValid then should return true",
        result = testSudokuValidity(
            listOf(
                listOf("5", "3", "4", "-", "7", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = true
    )


    check(
        name = "Given a sudoku board with duplication in row, when call isSudokuValid then should return false",
        result = testSudokuValidity(
            listOf(
                listOf("5", "4", "4", "6", "7", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )


    check(
        name = "Given a sudoku board has non-numeric input in the row, when call isSudokuValid then should return false",
        result = testSudokuValidity(
            listOf(
                listOf("5", "3", "4", "6", "h", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )
    //endregion


    //region Column Validation Tests
    check(
        name = "Given a board with dash symbol (-) in column, when call isSudokuValid then should return true",
        result = testSudokuValidity(
            listOf(
                listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("-", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = true
    )


    check(
        name = "Given a board with duplication in column, when call isSudokuValid then should return false",
        result = testSudokuValidity(
            listOf(
                listOf("4", "3", "5", "6", "7", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )


    check(
        name = "Given a board with non-numeric input in column, when call isSudokuValid then should return false",
        result = testSudokuValidity(
            listOf(
                listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                listOf("h", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("6", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )
    //endregion


    //region Subgrid Validation Tests
    check(
        name = "Given board with non-numeric input in subgrid, when call isSudokuValid should return false",
        result = testSudokuValidity(
            listOf(
                listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                listOf("6", "h", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )


    check(
        name = "Given board with duplication in numbers, when call isSudokuValid then should return false",
        result = testSudokuValidity(
            listOf(
                listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "3", "8", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = false
    )
    //endregion


    //region Valid Board Tests
    check(
        name = "Given a valid board, when call isSudokuValid then should return true",
        result = testSudokuValidity(
            listOf(
                listOf("5", "3", "4", "6", "7", "8", "9", "1", "2"),
                listOf("6", "7", "2", "1", "9", "5", "3", "4", "8"),
                listOf("1", "9", "8", "3", "4", "2", "5", "6", "7"),
                listOf("8", "5", "9", "7", "6", "1", "4", "2", "3"),
                listOf("4", "2", "6", "8", "5", "3", "7", "9", "1"),
                listOf("7", "1", "3", "9", "2", "4", "8", "5", "6"),
                listOf("9", "6", "1", "5", "3", "7", "2", "8", "4"),
                listOf("2", "8", "7", "4", "1", "9", "6", "3", "5"),
                listOf("3", "4", "5", "2", "8", "6", "1", "7", "9")
            )
        ),
        correctResult = true
    )
    //endregion
}





fun check(name: String, result: Boolean, correctResult: Boolean) {
    if (result == correctResult) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}
