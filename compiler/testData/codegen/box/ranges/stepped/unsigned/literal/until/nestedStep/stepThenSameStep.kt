// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1u until 9u step 2 step 2) {
        uintList += i
    }
    assertEquals(listOf(1u, 3u, 5u, 7u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 1uL until 9uL step 2L step 2L) {
        ulongList += i
    }
    assertEquals(listOf(1uL, 3uL, 5uL, 7uL), ulongList)

    return "OK"
}