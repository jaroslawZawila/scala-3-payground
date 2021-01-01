package macros

import scala.quoted._

object DebugPrint:

  inline def debugSingle(inline expr: Any): Unit = ${debugSingleImpl('expr)}

  def debugSingleImpl(expr: Expr[Any])(using Quotes): Expr[Unit] = {
    '{ println("Value of " + ${Expr(expr.show)} + " is " + $expr) }
  }

end DebugPrint