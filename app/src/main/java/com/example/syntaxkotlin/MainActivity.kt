package com.example.syntaxkotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.syntaxkotlin.ui.theme.SyntaxKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SyntaxKotlinTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }

            // Lesson 1
            //variablesYConstants()

            // Lesson 2
            //dataTypes()

            // Lesson 3
            //sentenceIf()

            // Lesson 4
            //sentenceWhen()

            // Lesson 5
            //arrays()

            // Lesson 6
            //maps()

            // Lesson 7
            //loops()

            // Lesson 8
            //nullSafety()

            // Lesson 9
            //functions()

            // Lesson 10
            classes()
        }
    }

    private fun variablesYConstants() {

        // Variables

        var myFirstVariable = "Hello Hackermen!"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Welcome Robert"

        println(myFirstVariable)

        // We cannot assign an INT type to a string variable
        //myFirstVariable = 1

        var mySecondVariable = "test!"

        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "ready"

        println(myFirstVariable)

        // Constants

        val myFirstConstant = "¿You liked the tutorial?"

        println(myFirstConstant)

        // A constant cannot modify its value (error)
        //myFirstConstant = "LIKE"

        val mySecondConstant = myFirstVariable

        println(mySecondConstant)
    }

    /*
    Here we are talking about data types (data types)
     */
    private fun dataTypes() {

        // String

        val myString: String = "Hi Hackermen!"
        val myString2 = "Welcome to Robert"
        val myString3 = myString + " " + myString2
        println(myString3)

        // Integers (Byte, Short, Int, Long)

        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimals (Float, Double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 // Actually this is int
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)

    }

    /*
    Here we are going to talk about the IF sentence
     */
    private fun sentenceIf() {

        val myNumber = 71

        // Conditional operators
        // > greater than
        // < smaller than
        // >= (> =) greater than or equal
        // <= (< =) smaller the same
        // == (= =) equality
        // != (! =) inequality

        // Logical operators
        // && operator "y"
        // || operator "o"
        // ! operator "no"

        if (!(myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            // Sentence if
            println("$myNumber It is less than or equal to 10 and greater than 5 or is equal to 53")

        } else if(myNumber == 60) {

            // Sentence else if
            println("$myNumber is equal to 60")

        } else if(myNumber != 70) {

            // Sentence else if
            println("$myNumber It is not equal to 70")

        } else {
            // Sentence else
            println("$myNumber It is greater than 10 or less than 5 and is not equal to 53")
        }

    }

    /*
    Here we are going to talk about the when
     */
    fun SentenceWhen() {

        // When con String
        val country = "Italia"

        when (country) {
            "Spain", "Mexico", "Peru", "Colombia", "Argentina" -> {
                println("The language is Spanish")
            } "EEUU" -> {
            println("The language is English")
        } "Francia" -> {
            println("The language is French")
        } else -> {
            println("We do not know the language")
        }
        }

        // When con Int
        val age = 100

        when (age) {
            0, 1, 2 -> {
                println("You're a baby")
            } in 3..10 -> {
            println("You're a child")
        } in 11..17 -> {
            println("You are a teenager")
        } in 18..69 -> {
            println("You are an adult")
        } in 70..99 -> {
            println("You are old")
        } else -> {
            println("😱")
        }
        }

    }

    /*
    Here we are going to talk about arrays or arrangements
     */
    fun arrays() {

        val name = "kenny"
        val surname = "Robert"
        val company = "INMOPA"
        val age = "32"

        // Creation of an array

        val myArray = arrayListOf<String>()

        // Add one by one

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)
        //myArray.add(age)
        //myArray.add(age)

        println(myArray)

        // Add a data set

        myArray.addAll(listOf("Hi", "Welcome to the tutorial"))

        println(myArray)

        //Access to data

        val myCompany = myArray[2]

        println(myCompany)

        // Data modification

        myArray[5] = "test"

        println(myArray)

        // Delete data

        myArray.removeAt(4)

        println(myArray)

        // Tour data

        myArray.forEach {
            println(it)
        }

        // Other operations

        println(myArray.count())

        myArray.clear()

        println(myArray.count())

        // myArray.first()
        // myArray.last()
        // myArray.sort()
    }

    /*
    Here we are going to talk about maps, also called dictionaries
     */
    fun maps() {

        // Syntax
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        //Add elements
        myMap = mutableMapOf("Kenny" to 1, "Pedro" to 2, "Sara" to 5)
        println(myMap)

        // Add a single value
        myMap["Ana"] = 7
        myMap.put("María",8)
        println(myMap)

        // Update of a data
        myMap.put("Kenny",3)
        myMap["Kenny"] = 4
        println(myMap)

        myMap.put("Marcos",3)
        println(myMap)

        // Access data
        println(myMap["Kenny"])

        // Eliminate data
        myMap.remove("Kenny")
        println(myMap)
    }

    /*
    Here we are going to talk about loops, also called loops
    */
    private fun loops() {

        // Bucles

        val myArray = listOf("hi", "Welcome", "test!")
        val myMap = mutableMapOf("Kenny" to 1, "Pedro" to 2, "Sara" to 5)

        // For
        for (myString in myArray) {
            println(myString)
        }

        for (myElement in myMap) {
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10) {
            println(x)
        }

        for (x in 9 until 30) {
            println(x)
        }

        for (x in 0..10 step 2) {
            println(x)
        }

        for (x in 10 downTo 0 step 3) {
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNum in myNumericArray) {
            println(myNum)
        }

        // While

        var x = 0

        while (x < 10) {
            println(x)
            x += 2
        }

    }

    /*
    Here we are going to talk about security against null (Null Safety)
     */
    fun nullSafety() {

        var myString = "Robert"
        // myString = Null would give a compilation error
        println(myString)

        // Variable null safety
        var mySafetyString: String? = "Robert null safety"
        mySafetyString = null
        println(mySafetyString)

        //mySafetyString = "test!"
        //println(mySafetyString)

        /*if (mySafetyString != null) {
            println(mySafetyString!!)
        } else {
            println(mySafetyString)
        }*/

        // Safe call

        println(mySafetyString?.length)

//        mySafetyString?.let {
//            println(it)
//        } ?: run {
//            println(mySafetyString)
//        }

    }

    /*
   Here we are going to talk about functions
    */
    fun functions() {

        sayHello()
        sayHello()
        sayHello()

        sayMyName("Kenny")
        sayMyName("Pedro")
        sayMyName("Sara")

        sayMyNameAndAge("Kenny", 35)

        val sumResult = sumTwoNumbers(10, 5)
        println(sumResult)

        println(sumTwoNumbers(15, 9))

        println(sumTwoNumbers(10, sumTwoNumbers(5, 5)))
    }

    // Simple function
    fun sayHello() {
        println("Hola!")
    }

    // Functions with an input parameter
    fun sayMyName(name: String) {
        println("Hi, my name is $name")
    }

    // Functions with more than an input parameter
    fun sayMyNameAndAge(name: String, age: Int) {
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    // Functions with a return value
    fun sumTwoNumbers(firstNumber: Int, secondNumber: Int) : Int {
        val sum = firstNumber + secondNumber
        return sum
    }

    /*
   Here we are going to talk about classes
    */
    fun classes() {

        val brais = Programmer("Kenny", 35, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))
        println(brais.name)

        brais.age = 40
        brais.code()

        val sara = Programmer("Sara", 35, arrayOf(Programmer.Language.JAVA), arrayOf(brais))
        sara.code()

        println("${sara.friends?.first()?.name} He is a friend of ${sara.name}")
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SyntaxKotlinTheme {
        Greeting("Android")
    }
}