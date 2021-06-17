package io.github.chase22.brainfuck.cpu;

import io.github.chase22.brainfuck.cpu.base.ByteInt

fun assemble(code: String): List<ByteInt> = code.toCharArray().map(::convert)

fun convert(char: Char): ByteInt =
    when(char) {
        '+' -> 2
        '-' -> 3
        '>' -> 4
        '<' -> 5
        '.' -> 6
        ',' -> 7
        else -> 0
    }.let { ByteInt(it) }