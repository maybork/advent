package AoC2022

object Day02 extends App:
  // I couldn't figure out how to do this in Scala, I looked at https://github.com/maneatingape/advent-of-code
  // and found this very clever solution.
  def part1(data: Seq[String]) =
    val scores = Seq(
      "",
      "B X",
      "C Y",
      "A Z",
      "A X",
      "B Y",
      "C Z",
      "C X",
      "A Y",
      "B Z"
    ).zipWithIndex.toMap
    data.map(scores).sum

  def part2(data: Seq[String]) =
    // Having seen maneatingape's solution I decided to sit down and think about this one,
    // I drew up a diagram of all of the possible scores, encoding pairs of letters into
    // indices of the sequence.
    val scores = Seq(
      "",
      "B X",
      "C X",
      "A X",
      "A Y",
      "B Y",
      "C Y",
      "C Z",
      "A Z",
      "B Z"
    ).zipWithIndex.toMap
    data.map(scores).sum

  def main() =
    val input = io.Source.fromResource("AoC2022/day02.txt").getLines().toSeq
    println(s"Part 1 ${part1(input)}")
    println(s"Part 2 ${part2(input)}")
  main()
