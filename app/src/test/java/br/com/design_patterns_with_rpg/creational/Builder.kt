package br.com.design_patterns_with_rpg.creational

import org.junit.jupiter.api.Test
import java.io.File

class Dialog {

    fun setTitle(text: String) = println("setting title text $text")
    fun setTitleColor(color: String) = println("setting title color $color")
    fun setMessage(text: String) = println("setting message $text")
    fun setMessageColor(color: String) = println("setting message color $color")
    fun setImage(bitmapBytes: ByteArray) = println("setting image with size ${bitmapBytes.size}")

    fun show() = println("showing dialog $this")
}

class DialogBuilder() {

    constructor(init: DialogBuilder.() -> Unit) : this() {
        init()
    }

    private var titleHolder: TextView? = null
    private var messageHolder: TextView? = null
    private var imageHolder: File? = null

    fun title(attributes: TextView.() -> Unit) {
        titleHolder = TextView().apply { attributes() }
    }

    fun message(attributes: TextView.() -> Unit) {
        messageHolder = TextView().apply { attributes() }
    }

    fun image(attributes: () -> File) {
        imageHolder = attributes()
    }

    fun build(): Dialog {
        println("build")
        val dialog = Dialog()

        titleHolder?.run {
            dialog.setTitle(text)
            dialog.setTitleColor(color)
        }

        messageHolder?.apply {
            dialog.setMessage(text)
            dialog.setMessageColor(color)
        }

        imageHolder?.apply {
            dialog.setImage(readBytes())
        }

        return dialog
    }

    class TextView {
        var text: String = ""
        var color: String = "#00000"
    }
}

fun dialog(init: DialogBuilder.() -> Unit): Dialog =
    DialogBuilder(init).build()

class BuilderTest {

    @Test
    fun builder() {

        println("Build dialog")

        val dialog: Dialog =
            dialog {
                title {
                    text = "Eldritch horror"
                }
                message {
                    text =
                        "In Eldritch Horror, one to eight players take on the role of investigators who travel the world, working together, and must solve mysteries."
                    color = "#333333"
                }
                image {
                    File.createTempFile("image", "jpg")
                }
            }

        println("Show dialog")

        dialog.show()
    }
}