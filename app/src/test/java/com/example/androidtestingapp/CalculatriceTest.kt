package com.example.androidtestingapp

import org.junit.Assert.*
import org.junit.Test

class CalculatriceTest{

    private val calculatrice = Calculatrice()

    @Test
    fun `Test addition`() {
        assertEquals(9, calculatrice.addition(3, 4))
    }

    @Test
    fun `Test soustraction`() {
        assertEquals(2, calculatrice.soustraction(5, 3))
    }

    @Test
    fun `Test multiplication`() {
        assertEquals(12, calculatrice.multiplication(3, 4))
    }

    @Test
    fun `Test division`() {
        assertEquals(5, calculatrice.division(10, 2))
    }

    @Test
    fun `Test division par zero`()  {
        try {
            calculatrice.division(5, 0)
            //
            fail("Should have thrown Arithmetic exception")
        } catch (e: IllegalArgumentException) {
            //success
            assertTrue(true)
        }
    }
}