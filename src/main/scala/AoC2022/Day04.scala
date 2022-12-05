package AoC2022

import scala.collection.immutable.Range

object Day04 extends App:
  def parseElves(line: String): (Array[Int], Array[Int]) =
    val (leftElf, rightElf) = line.split(",") match
      case Array(left, right) =>
        (left.split("-").map(_.toInt), right.split("-").map(_.toInt))
      case _ => assert(false) // unreachable with correct input
    (leftElf, rightElf)

  def hasSubsets(line: String): Boolean =
    val (leftElf, rightElf) = parseElves(line)
    (leftElf(0) <= rightElf(0) && leftElf(1) >= rightElf(1)) ||
    (leftElf(0) >= rightElf(0) && leftElf(1) <= rightElf(1))

  def hasOverlaps(line: String): Boolean =
    val (leftElf, rightElf) = parseElves(line)
    (leftElf(0) <= rightElf(1) && leftElf(1) >= rightElf(0)) ||
    (leftElf(1) >= rightElf(0) && leftElf(0) <= rightElf(1))

  def part1(data: Seq[String]): Int =
    data.count(hasSubsets)

  def part2(data: Seq[String]): Int =
    data.count(hasOverlaps)

  def main() =
    val input = io.Source.fromResource("AoC2022/day04.txt").getLines().toSeq
    println(s"A ${part1(input)}")
    println(s"B ${part2(input)}")
  main()
