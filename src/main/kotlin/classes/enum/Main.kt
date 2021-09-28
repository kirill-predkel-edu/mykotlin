package classes.enum

fun main() {
  val message = when (State.RUNNING) {

    State.IDLE -> "It's idle"
    State.RUNNING -> "It's running"
    State.FINISHED -> "It's finished"
  }
  println(message)
}