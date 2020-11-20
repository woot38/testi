package pkg


sealed trait Color
sealed case class Red() extends Color {
  override def toString = "Red"
}
sealed case class Blue() extends Color {
  override def toString = "Blue"
}
sealed case class Yellow() extends Color {
  override def toString = "Yellow"
}
sealed case class Green() extends Color {
  override def toString = "Green"
}
sealed case class Blank() extends Color {
  override def toString = "Blank"
}


sealed class Rank(val value: Int) {
  override def toString = s"${value}"
}
sealed case class Wild4() extends Rank(14) {
  override def toString = "Choose color, +4"
}
sealed case class Wild() extends Rank(13){
  override def toString = "Choose color"
}
sealed case class Reverse() extends Rank(12){
  override def toString = "Change direction"
}
sealed case class Plus2() extends Rank(11){
  override def toString = "+2"
}
sealed case class Skip() extends Rank(10){
  override def toString = "skip"
}
sealed case class Nine() extends Rank(9)
sealed case class Eight() extends Rank(8)
sealed case class Seven() extends Rank(7)
sealed case class Six() extends Rank(6)
sealed case class Five() extends Rank(5)
sealed case class Four() extends Rank(4)
sealed case class Three() extends Rank(3)
sealed case class Two() extends Rank(2)
sealed case class One() extends Rank(1)
sealed case class Zero() extends Rank(0)


case class Card(color: Color, rank: Rank) {
  override def toString = rank.toString+" "+color.toString
}