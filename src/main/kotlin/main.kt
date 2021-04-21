import org.lwjgl.glfw.GLFW.glfwInit
import org.lwjgl.opengl.GL11.GL_FALSE
import kotlin.system.exitProcess

fun main() {
    if (glfwInit() == GL_FALSE.toBoolean()) {
        // 初期化に失敗した
        println("Can't initialize GLFW")
        exitProcess(1)
    }
}