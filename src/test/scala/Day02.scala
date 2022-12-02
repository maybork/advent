package AoC2022
import org.scalatest.funsuite.AnyFunSuite

class Day02Suite extends AnyFunSuite:
  val sample = """
  |A Y
  |B X
  |C Z
  """.stripMargin.trim.split("\n").toSeq
  test("Part1 should yield 15") {
    assert(Day02.part1(sample) == 15)
  }
  test("Part2 should yield 15") {
    assert(Day02.part1(sample) == 12)
  }
