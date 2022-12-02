package AoC2022
import org.scalatest.funsuite.AnyFunSuite

class Day01Suite extends AnyFunSuite:
  val sample = """
  |10
  |15
  |
  |30
  |
  |15
  |50
  |40
  |100
  |
  |20
  |
  |430
  """.stripMargin.trim

  test("Part 1 should return correct result") {
    assert(Day01.part1(sample) == 430)
  }
  test("Part 2 should return correct result") {
    assert(Day01.part2(sample) == 430 + 205 + 30)
  }
