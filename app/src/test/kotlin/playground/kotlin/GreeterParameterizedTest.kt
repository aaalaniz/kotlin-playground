package playground.kotlin

import com.google.common.truth.Truth.assertThat
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Test
import org.junit.runner.RunWith

enum class GreeterTestFixture(val person: Person) {
    Alice(person = Person(name = "Alice", age = 30)),
    Bob(person = Person(name = "Bob", age = 31))
}

@RunWith(TestParameterInjector::class)
class GreeterParameterizedTest {
    private val greeter = Greeter()

    @Test
    fun `the greeter greets`(@TestParameter greeterTestFixture: GreeterTestFixture) {
        val person = greeterTestFixture.person
        assertThat(greeter.greet(person)).isEqualTo("Hello ${person.name}!")
    }
}