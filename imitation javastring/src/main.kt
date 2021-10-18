fun main() {
    val representString = RepresentString()
    println("Text into the string: ${representString.string}")

    representString.string = "Change represent string"
    println("Text into the string which was changing: ${representString.string}")

    representString.string = "Cutter for string"
    var substring = representString.getSubstring(1, 6)
    println("Fragments of the text: $substring")

    substring = representString.getSubstring(4)
    println("Fragments of the text without parameter End: $substring")

    val concatString = representString.getConcatString("Hello", "World!")
    println(concatString)

    val shouldFoundString = representString.search("London the is the capital of UK", "UK")
    println("Checking a word in a string: $shouldFoundString")

    val stringFromNumber = representString.getStringFromInteger(21)
    println("Converted number to string:  $stringFromNumber")

    val stringToFloat = representString.getFloatFromString("3.14")
    println("Converted string to float number:  $stringToFloat")
}

class RepresentString(private var representString: String = "This is represent string") {
    var string get() = representString
    set(value) {
        representString = value
    }

    fun getSubstring(start: Int, end: Int = string.length): String {
        return string.substring(start, end)
    }

    fun getConcatString(basicString: String, otherString: String): String {
        return "$basicString $otherString"
    }

    fun search(basicString: String, otherString: String): Boolean {
        return basicString.contains(otherString)
    }

    fun getStringFromInteger(number: Int): String {
        return number.toString()
    }

    fun getFloatFromString(basicString: String): Float {
        return basicString.toFloat()
    }
}