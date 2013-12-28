package redpill



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Label)
class LabelTests {

    void testDefaultLabel(){


        Label label = new Label(id: UUID.randomUUID(), value: "SOME".bytes)

        println "____" + label

        println label.text
        println label.value



    }

    void testSomething() {

    }
}
