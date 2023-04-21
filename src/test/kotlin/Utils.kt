package homework12

fun captureOutput(block: () -> Unit) : String {
    val oldOut = System.out
    val outContent = java.io.ByteArrayOutputStream()
    System.setOut(java.io.PrintStream(outContent))
    block()
    System.setOut(oldOut)
    return outContent.toString().trim()
}