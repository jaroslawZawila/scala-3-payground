object Config:
  inline val logging = true

object Logger:

  private var indent = 0

  inline def log[T](msg: String, indentMargin: =>Int)(op: => T): T =
    if Config.logging then
      println(s"${"  " * indent}start $msg")
      indent += indentMargin
      val result = op
      indent -= indentMargin
      println(s"${"  " * indent}$msg = $result")
      result
    else op
end Logger

var indentSetting = 2

object Main:

  import Logger.log
  
  def factorial(n: BigInt): BigInt =
    log(s"factorial($n)", indentSetting) {
      if n == 0 then 1
      else n * factorial(n - 1)
    }
    
end Main

@main def inline = {
  
  println(Main.factorial(2))
  
}