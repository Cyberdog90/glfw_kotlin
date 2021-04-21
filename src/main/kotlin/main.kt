import org.lwjgl.glfw.GLFW.glfwCreateWindow
import org.lwjgl.glfw.GLFW.glfwInit
import org.lwjgl.glfw.GLFW.glfwMakeContextCurrent
import org.lwjgl.glfw.GLFW.glfwSwapBuffers
import org.lwjgl.glfw.GLFW.glfwWaitEvents
import org.lwjgl.glfw.GLFW.glfwWindowShouldClose
import org.lwjgl.opengl.GL.createCapabilities
import org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT
import org.lwjgl.opengl.GL11.GL_FALSE
import org.lwjgl.opengl.GL11.glClear
import org.lwjgl.opengl.GL11.glClearColor
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

    // 作成したウィンドウをOpenGLの処理対象にする
    glfwMakeContextCurrent(window)
    createCapabilities()

    // 背景色を指定する
    glClearColor(1.0f, 1.0f, 1.0f, 0.0f)

    // ウィンドウが開いている間繰り返す
    while (glfwWindowShouldClose(window) == GL_FALSE.toBoolean()) {
        //ウィンドウを消去する
        glClear(GL_COLOR_BUFFER_BIT)

        //
        //ここで描画処理を行う
        //

        // カラーバッファを入れ替える
        glfwSwapBuffers(window)

        //イベントを取り出す
        glfwWaitEvents()
    }
}