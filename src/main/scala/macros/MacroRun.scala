import macros.DebugPrint

def power(p: Int) = p * p

@main def runMacro = {
  val x = 2
  val z = 22
  DebugPrint.debugSingle(power(z))
}