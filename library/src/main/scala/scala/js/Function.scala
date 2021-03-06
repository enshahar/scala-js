/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2013, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */



package scala.js

class Function(args: String*) extends Object {
  val length: Number = ???

  def $apply[A](thisArg: Any, argArray: Array[A]): Dynamic = ???
  def $apply(thisArg: Any): Dynamic = ???
  def call(thisArg: Any, argArray: Any*): Dynamic = ???
  def bind(thisArg: Any, argArray: Any*): Dynamic = ???
}

object Function extends js.Object {
  def apply(args: js.String*): Function = ???
}

trait Function0[+R] extends Function {
  def apply(): R
}

trait Function1[-T1, +R] extends Function {
  def apply(arg1: T1): R
}

trait Function2[-T1, -T2, +R] extends Function {
  def apply(arg1: T1, arg2: T2): R
}

trait Function3[-T1, -T2, -T3, +R] extends Function {
  def apply(arg1: T1, arg2: T2, arg3: T3): R
}

trait Function4[-T1, -T2, -T3, -T4, +R] extends Function {
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4): R
}

trait Function5[-T1, -T2, -T3, -T4, -T5, +R] extends Function {
  def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): R
}
