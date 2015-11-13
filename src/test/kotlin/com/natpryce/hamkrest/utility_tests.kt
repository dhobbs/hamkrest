package com.natpryce.hamkrest

import org.junit.Test

class DelimitingValuesInStrings {
    @Test
    fun quotes_around_string_values_and_escaped_within() {
        assertThat(delimit("hello, \"bob\""), equalTo("\"hello, \\\"bob\\\"\""))
    }

    @Test
    fun pairs() {
        assertThat(delimit(Pair("x", "y")), equalTo("(\"x\", \"y\")"))
    }

    @Test
    fun iterables() {
        assertThat(delimit(listOf(1,2)), equalTo("[1, 2]"))
        assertThat(delimit(listOf("1","2")), equalTo("""["1", "2"]"""))
    }

    @Test
    fun range() {
        assertThat(delimit(1..8), equalTo("1..8"))
    }
}