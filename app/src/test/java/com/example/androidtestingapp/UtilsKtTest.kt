package com.example.androidtestingapp

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test


class UtilsKtTest {
    private val validPassword = "Passw0rd!"

    /**
     * ===========================================================================================
     *                                  TESTING PASSWORD
     * ===========================================================================================
     */
    @Test
    fun test_isValidPassword() {
        val result = verifyPassword(validPassword)

        // Resultat / Assertion
        assertTrue(result.isEmpty())
    }

    @Test
    fun test_isInvalidPassword() {
        // Action
        val invalidPassword = "Pass"
        val result = verifyPassword(invalidPassword)

        // Resultat / Assertion
        assert(result.isNotEmpty())
    }

    // OU

    @Test
    fun `Test if password contains at least 6 characters`(){
        val invalidPassword = "Pass"
        // Action
        val resultValidPassword = verifyPassword(validPassword)
        val resultInvalidPassword = verifyPassword(invalidPassword)

        // Result / Assertion
        assert(resultValidPassword.isEmpty())
        assertTrue(!resultInvalidPassword.contains("\"Le mot de passe doit contenir au moins 6 caractères.\""))
    }

    @Test
    fun `Test if password contains at least 1 uppercase characters`(){
        val invalidPassword = "pass"
        // Action
        val resultValidPassword = verifyPassword(validPassword)
        val resultInvalidPassword = verifyPassword(invalidPassword)

        // Result / Assertion
        assert(resultValidPassword.isEmpty())
        assertTrue(resultInvalidPassword.contains("Le mot de passe doit contenir au moins une lettre majuscule."))
    }

    @Test
    fun `Test if password contains at least 1 lowercase characters`(){
        val invalidPassword = "PASSWORD"
        // Action
        val resultValidPassword = verifyPassword(validPassword)
        val resultInvalidPassword = verifyPassword(invalidPassword)

        // Result / Assertion
        assert(resultValidPassword.isEmpty())
        assertTrue(resultInvalidPassword.contains("Le mot de passe doit contenir au moins une lettre minuscule."))
    }

    @Test
    fun `Test if password contains at least 1 digit`(){
        val invalidPassword = "Password!"
        // Action
        val resultValidPassword = verifyPassword(validPassword)
        val resultInvalidPassword = verifyPassword(invalidPassword)

        // Result / Assertion
        assert(resultValidPassword.isEmpty())
        assertTrue(resultInvalidPassword.contains("Le mot de passe doit contenir au moins un chiffre."))
    }

    @Test
    fun `Test if password contains at least 1 special characters`(){
        val caracteresSpeciaux = "~`!@#\\$%\\^&*\\(\\)-_+=<>?/\\[]\\{}|"
        val invalidPassword = "Passw0rd"
        // Action
        val resultValidPassword = verifyPassword(validPassword)
        val resultInvalidPassword = verifyPassword(invalidPassword)

        // Result / Assertion
        assert(resultValidPassword.isEmpty())
        assertTrue(!resultInvalidPassword.contains("Le mot de passe doit contenir au moins un caractère spécial parmi $caracteresSpeciaux."))
    }



    /**
     * ===========================================================================================
     *                                  TESTING E-MAIL
     * ===========================================================================================
     */
    @Test
    fun `Test valid email`() {
        assertTrue(isEmailValid("utilisateur@example.com"))
    }

    @Test
    fun `Test email contains special characters`() {
        assertTrue(isEmailValid("john.doe123@example.co.uk"))
    }

    @Test
    fun `Test email domain has 2 characters`() {
        assertTrue(isEmailValid("info@domaine.fr"))
    }

    @Test
    fun `Test domain name is invalid`() {
        assertFalse(isEmailValid("utilisateur@exemple"))
    }

    @Test
    fun `Test no characters before @`() {
        assertFalse(isEmailValid("@example.com"))
    }

    @Test
    fun `Test no domain name after @`() {
        assertFalse(isEmailValid("utilisateur@.com"))
    }
}