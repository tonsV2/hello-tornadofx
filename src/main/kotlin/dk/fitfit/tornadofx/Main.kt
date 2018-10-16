package dk.fitfit.tornadofx

import javafx.scene.text.FontWeight.BOLD
import tornadofx.*

class HelloWorld : View() {
    override val root = hbox {
        label("Hello world")
    }
}

class HelloWorldApp : App(HelloWorld::class, Styles::class)

class Styles : Stylesheet() {
    init {
        label {
            fontSize = 40.px
            fontWeight = BOLD
            backgroundColor += c("#cecece")
        }
    }
}

open class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch<HelloWorldApp>(args)
        }
    }
}
