import zio.test._
import zio.test.Assertion._
import zio._

object ExampleSpec extends ZIOSpecDefault {
  def spec = suite("ExampleSpec")(
    test("testing an effect using map operator") {
      ZIO.succeed(1 + 1).map(n => assert(n)(equalTo(2)))
    },
    test("testing an effect using a for comprehension") {
      for {
        n <- ZIO.succeed(1 + 1)
      } yield assert(n)(equalTo(2))
    }
  )
}
