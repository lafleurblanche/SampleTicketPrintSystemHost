package net.konohana.sakuya.printsys.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SamplePrintSystemApplication

fun main(args: Array<String>) {
    runApplication<SamplePrintSystemApplication>(*args)
}
