package com.hunglee.calculatorprep

sealed class CalculatorOperation(val symbol: String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
    data class Operation(val operation: CalculatorOperation) : CalculatorActions()
}
