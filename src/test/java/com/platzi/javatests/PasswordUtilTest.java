package com.platzi.javatests;

import org.junit.Test;

import static com.platzi.javatests.PasswordUtil.SecurityLevel.MEDIUM;
import static com.platzi.javatests.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {

       assertEquals(WEAK, PasswordUtil.assessPassword("123aa!"));
    }

    @Test
    public void weak_when_has_less_only_letters() {

        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghjk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {

        assertEquals(MEDIUM, PasswordUtil.assessPassword("abcde12345"));
    }

    @Test
    public void strong_when_has_letters_numbers_and_symbols() {

        assertEquals(STRONG, PasswordUtil.assessPassword("abcd1234!"));
    }
}