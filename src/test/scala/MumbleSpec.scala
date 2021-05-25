import org.scalatest._
import org.scalatest.funspec.AnyFunSpec
import matchers.should.Matchers._

class MumbleSpec extends AnyFunSpec {
  describe("Mumble") {
    val mumble = new Mumble()

    it("should handle one letter") {
      mumble.speak("a") should equal("A")
    }

    it("should handle two letters") {
      mumble.speak("ab") should equal("A-Bb")
    }

    it("should handle three letters") {
      mumble.speak("abc") should equal("A-Bb-Ccc")
    }

    it("should handle four letters") {
      mumble.speak("abcd") should equal("A-Bb-Ccc-Dddd")
    }

    it("will handle letters in non-alphabetical order") {
      mumble.speak("xiswfb") should equal("X-Ii-Sss-Wwww-Fffff-Bbbbbb")
    }
  }
}
