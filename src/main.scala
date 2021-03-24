object main {
  def main(args: Array[String]) {
    splitList()
  }

  def splitList(): Unit ={
    val statesMap = Map(
      "AKMerlin" -> "Alaska",
      "Submerlin" -> "Alaska",
      "IL" -> "Illinois",
      "MerlinBoy" -> "Alaska",
      "KY" -> "Kentucky"
    )
    println(statesMap.filter(x=>x._1.toLowerCase().contains("merlin")))
  }
}