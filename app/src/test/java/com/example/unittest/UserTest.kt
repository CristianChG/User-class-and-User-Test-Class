package com.example.unittest

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class UserTest {
    @Test
    fun testIsAdult() {
        val user = User("John", 20)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsTeenager() {
        val user = User("John", 15)
        assertTrue(user.isTeenager())
    }

    @Test
    fun testIsChild() {
        val user = User("John", 8)
        assertTrue(user.isChild())
    }
    @Test
    fun testGetName(){
        val user = User("John", 20)
        assertEquals("John", user.name)
    }
}