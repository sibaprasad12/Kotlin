package spm.kotlin.world.opetorExample

/**
 * https://blog.mindorks.com/using-scoped-functions-in-kotlin-let-run-with-also-apply
 */

lateinit var myPerson: Person

fun main(args: Array<String>) {

    funUseof_is_as()

    useOfInOperator()

    operatorReferentialEquality()

    operatorStructuralEquality()

    useOfLabelInLoops()

    useOfLazy()

    useOfLet()

    useOfRun()

    useOfAlso()

    useOfApply()

    useOfWith()

    funUseof_is_as()

    useOfFIlter()

    useofMap()
}


/**
 * is operator checks the type of variable and returns boolean as true if it matches the type.
 * !is -  returns true if the type doesn’t matches. It’s just a not operator for is operator.
 *
 * as -
 * as operator works as other languages cast operators which casts the object to another object with particular reference.
var otherShapeObject = shapeObject as Circle
or the nullable type object can only be cast to a new nullable reference type object.
var nullableShapeObject : Circle? = shapeObject as Circle?
The above explicit cast is unsafe as it can throw an exception if the cast is not possible. That’s why as operator called as unsafe cast operator.
Instead, we can use a safe cast operator as? where it assigns a null value if the cast is not possible without throwing an exception.
var safeCastObject : Circle? = shapeObject as? Circle
 * */
// as : Type case

fun funUseof_is_as() {

    println("========== USE OF IS AND AS ================")
    var obj = "siba"

    if (obj is String) {
        print(obj.length)
    }

    if (obj !is String) { // same as !(obj is String)
        print("Not a String")
    } else {
        println(obj.length)
    }


    if (obj !is String) return
    println(obj.length) // x is automatically cast to String

    // use of AS

    val x: String
}

// in
fun useOfInOperator() {
    println("========== USE OF IN OPERATOR ================")
    var obj: Any = 123
    when (obj) {
        in 1..6 -> {
            println("its between 1 o 6")
        }
        !in 1..6 -> {
            println("its not in between 1 o 6")
        }
        is Int -> print(1 + 1)
        is String -> println("asdasd")
        is IntArray -> println("asdasda")
    }
}

/**
 *
 *  Structural equality (== - a check for equals())
Referential equality (=== - two references point to the same object)
 */

// ===
fun operatorReferentialEquality() {
    println("========== USE OF === OPERATOR ================")
    val a: Int = 10000
    println(a === a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // !!!Prints 'false'!!!
}

// == -> used for quantitative check. COntent check
fun operatorStructuralEquality() {
    println("========== USE OF == OPERATOR ================")
    val a: Int = 10000
    println(a == a) // Prints 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA == anotherBoxedA) // Prints 'true'
}

/**
 * Before this, it's always difficult to break a nested loop with condition
 * But now in Kotlin you can define a loop with label and can cancel the loop with condition
 */
// @loop
fun useOfLabelInLoops() {
    println("========== USE OF LABEL IN LOOP ================")
    loopouter@ for (i in 1..10) {
        innerLoop@ for (j in 1..5) {
            if (i == 8) {
                break@loopouter
            } else if (j == 3) {
                break@innerLoop
            }
            if (j == 2) {
                continue@innerLoop
            }
            println("$i ${j}")
        }
    }
}

fun useOfDelegate() {
    println("============use of Delegate==========")
    //  var p: String by Delegates()
}

/**
 * There are certain classes whose object initialization is very heavy and so much time taking that it results in the delay of the whole class creation process.
 * the benefit of using lazy is that the object will be created only when it is called otherwise it will not be created.
 * Lazy is mainly used when you want to access some read-only property because the same object is accessed throughout.
 * The value must be a constant by using val or const
 */
private fun useOfLazy() {
    println("========== USE OF LAZY OPERATOR ================")
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
    println(lazyValue)
}
// computed
// Output =  Hello

/**
 *  let is a non-monadic version of map:
It accepts objects as parameters and returns the result of the lambda.
Super-useful for conversions:
- > It does not change the object, it only return the value that applied condition
 */

private fun useOfLet() {
    println("========== USE OF LET OPERATOR ================")
    val person: Person = Person("Siba", 42)
    println(person)
    val result = person.let { it.age * 2 }
    println(person)
    println(result)
    val result1 = person.let { it.age = 2 }
    println(result1)
    println(person)
}
/** OUTPUT
 *  Person(name=Edmund, age=42)
Person(name=Edmund, age=42)
84
 */

/**
 *
run is another function literal with receiver.
It is used with lambdas that do not return values,
but rather just create some side-effects:
 */

private fun useOfRun() {
    println("========== USE OF RUN OPERATOR ================")
    val person = Person("Sibaprasad", 42)
    val result = person.run { age * 2 }
    println("Person Object =  $person")
    println("Result = $result")
    val x = "siba".run {
        println(toUpperCase())
        length
    }
    println("X = $result")
}
/** OUTPUT
 * Person(name=Edmund, age=42)
84
 */

/**
 * also
With this function, you say “also do this with the object.”
I often use it to add debugging to the call chains or to do some additional processing:
 */

private fun useOfAlso() {
    println("========== USE OF ALSO OPERATOR ================")
    val person = Person("Siba", 42)
    println(person)
    val result = person.also { person1 ->
        person1.age = 50
        person1.name = "amit"
    }
    println("After apply ALso Operator , result is $result")
    println("After apply ALso Operator , the object is $person")
}
/** OUTPUT
 *  Person(name=Siba, age=42)
After apply ALso Operator , result is Person(name=amit, age=50)
After apply ALso Operator , the object is Person(name=amit, age=50)
 */

/**
 * apply
apply is used for post-construction configuration.
It is a spm.kotlin.world.function literal with receiver: The object is not passed as a parameter,
but rather as this.
An object passed in such way is called the receiver.
 */

private fun useOfApply() {
    println("========== USE OF APPLY OPERATOR ================")
    val person = Person("Sibaprasad", 42)
    println(person)
    val result = person.apply {
        name = "Siba"
        age = 50 }
    println("After apply " + person)
    println("The Result " + result)
}

/** OUTPUT
 *  Person(name=Sibaprasad, age=42)
After apply Person(name=Siba, age=50)
The Result Person(name=Siba, age=50)
 */

/**
 * with
According to Kotlin idioms, with should be used to call multiple methods on an object.
 */

private fun useOfWith() {
    println("========== USE OF WITH OPERATOR ================")
    val person = Person("Edmund", 42)
    val result = with(person) {
        age * 2
    }
    println(person)
    println(result)
}

/** OUTPUT
 *
 * Person(name=Edmund, age=42)
84
 */
private fun useOfFIlter() {
    println("========== USE OF FILTER OPERATOR ================")
    val originalMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    val list = listOf(1, 2, 3, 4, 5)

    val filteredMap = originalMap.filter { it.value < 2 }
    println(filteredMap) // {key1=1}
// original map has not changed
    println(originalMap) // {key1=1, key2=2, key3=3}

    val filteredList = list.filter { it < 3 }
    println(filteredList)

}

private fun useofMap() {
    println("========== USE OF MAP OPERATOR ================")
    val originalMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3)
    val list = listOf(1, 2, 3, 4, 5)

    val mappedList = list.map {
        it * 2
    }

    println(mappedList) // {key1=1}

    val mappedMap = originalMap.map {
        it.value * 5
    }
    println(mappedMap) // {key1=1}

}