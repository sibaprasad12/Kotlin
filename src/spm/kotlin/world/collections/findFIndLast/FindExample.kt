package spm.kotlin.world.collections.findFIndLast/** *find and findLast functions return the first or the last collection element that matches the given predicate. *  If there are no such elements, functions return null. */fun main() {    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")  // 1    val first = words.find { it.startsWith("some") }                                // 2    val last = words.findLast { it.startsWith("some") }                             // 3    val nothing = words.find { it.contains("nothing") }}