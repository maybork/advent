package AoC2022

object Day03 extends App:
  def evalRucksack(line: String): Int =
    val (a, b) = line.splitAt(line.length() / 2);
    val matching = a.filter(b.contains(_)).charAt(0)
    priority(matching)

  def evalThreeRucksacks(sacks: Seq[String]): Int =
    val (a, b, c): (String, String, String) = (sacks(0), sacks(1), sacks(2));
    val matching: Char = a.filter(b.contains(_)).filter(c.contains(_)).charAt(0)
    priority(matching)

  def priority(item: Char): Int =
    item.isUpper match
      case true  => item.charValue() - 38
      case false => item.charValue() - 96

  def part1(data: Seq[String]): Int =
    data.map(evalRucksack).sum

  def part2(data: Seq[String]): Int =
    var dataIter = data.iterator
    var result: Int = 0
    while dataIter.hasNext do
      result += evalThreeRucksacks(dataIter.take(3).toSeq);
    result
  def main() =
    val input = io.Source.fromResource("AoC2022/day03.txt").getLines().toSeq
    println(s"A ${part1(input)}")
    println(s"B ${part2(input)}")
  main()
