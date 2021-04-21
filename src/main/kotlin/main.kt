import org.lwjgl.glfw.GLFW.glfwCreateWindow
import org.lwjgl.glfw.GLFW.glfwInit
import org.lwjgl.opengl.GL11.GL_FALSE
import org.lwjgl.system.MemoryUtil.NULL
import kotlin.system.exitProcess

fun main() {
    // GLFWを初期化する
    if (glfwInit() == GL_FALSE.toBoolean()) {
        // 初期化に失敗した
        System.err.println("Can't initialize GLFW")
        exitProcess(1)
    }

    // ウィンドウを作成する
    val window: Long = glfwCreateWindow(640, 480, "Hello!", NULL, NULL)
    if (window == NULL) {
        // ウィンドウが作成できなかった
        System.err.println("Can't create GLFW window.")
        exitProcess(1)
    }
}