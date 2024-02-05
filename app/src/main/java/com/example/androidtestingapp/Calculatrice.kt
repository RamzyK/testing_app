package com.example.androidtestingapp

class Calculatrice {
    fun addition(a: Int, b: Int): Int {
        return a + b
    }

    fun soustraction(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplication(a: Int, b: Int): Int {
        return a * b
    }

    fun division(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("Division par zéro n'est pas autorisée.")
        }
        return a / b
    }
}