data class Development(
		val name: String,
		val production: Int
)

fun main(args: Array<String>) {
	val church = Development("Church", 7)
	val developments = HashMap<String, Development>()

	developments.put(church.name, church)

	println(developments.toString())
}


