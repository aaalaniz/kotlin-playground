package playground.kotlin

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class GreeterTest {
    private val greeter = Greeter()
    
    @Test
    fun `the greeter greets`() {
        val person = Person(name = "Alice", age = 30)
        assertThat(greeter.greet(person)).isEqualTo("Hello ${person.name}!")
    }
}
