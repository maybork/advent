package AoC2022

object Day01 extends App:
  def part1(input: String): Int =
    input
      .split("\n\n")
      .map(_.split("\n").map(_.toInt).sum)
      .max

  def part2(input: String): Int =
    input
      .split("\n\n")
      .map(_.split("\n").map(_.toInt).sum)
      .sorted
      .reverse
      .take(3)
      .sum

  def main() =
    val input = io.Source.fromResource("AoC2022/day01.txt").mkString
    println(s"A ${part1(input)}")
    println(s"B ${part2(input)}")
  main()
