package pkg

case class Deck(anz:Int = 1) {
  def colors(): Vector[Color] = Vector(Yellow(), Blue(), Green(), Red())
  def ranks(): Vector[Rank] = Vector(Reverse(), Skip(), Plus2(), Nine(), Eight(), Seven(), Six(), Five(), Four(), Three(), Two(), One(), Zero())
  def colorB(): Vector[Color] = Vector(Blank(),Blank(),Blank(),Blank())
  def rankB(): Vector[Rank] = Vector(Wild(), Wild4())

  def deck(): Vector[Card] =  {(for (color <- colors(); rank <- ranks()) yield Card(color,rank)).concat(
                              for (color <- colors(); rank <- ranks().dropRight(1)) yield Card(color,rank)).concat(
                              for (color <- colorB(); rank <- rankB()) yield Card(color,rank))
  }

  def shuffle(cards: Vector[Card]): Vector[Card] = util.Random.shuffle(cards)

  //def drawcard(cards: Vector[Card], anz:Int = 1): Vector[Card] = cards.splitAt(anz)
}
