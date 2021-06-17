package io.github.chase22.brainfuck.cpu.components

import io.github.chase22.brainfuck.cpu.CPU

class ControlLogic() {
    fun run() {
        while(true) {
            when (CPU.programMemory.currentValue.toInt()) {
                2 -> increment()
                3 -> decrement()
                4 -> shiftRight()
                5 -> shiftLeft()
                6 -> output()
                7 -> input()
                else -> break
            }
            CPU.programCounter.countUp()
        }
    }

    fun increment() {
        memOutCuIn()
        CPU.counterUnit.increment()
        CuOutMemIn()
    }

    fun decrement() {
        memOutCuIn()
        CPU.counterUnit.decrement()
        CuOutMemIn()
    }

    fun shiftLeft() {
        CPU.tapeMemoryCounter.countDown()
    }

    fun shiftRight() {
        CPU.tapeMemoryCounter.countUp()
    }

    fun input() {
        CPU.tapeMemory.currentValue = CPU.ioUnit.read()
    }

    fun output() {
        CPU.ioUnit.write(CPU.tapeMemory.currentValue)
    }

    private fun memOutCuIn() {
        CPU.counterUnit.currentValue = CPU.tapeMemory.currentValue
    }

    private fun CuOutMemIn() {
        CPU.tapeMemory.currentValue = CPU.counterUnit.currentValue
    }
}