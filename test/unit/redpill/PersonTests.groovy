package redpill

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import grails.test.mixin.TestMixin
import grails.test.mixin.domain.DomainClassUnitTestMixin

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
@TestMixin(DomainClassUnitTestMixin)
@Mock([Person])
class PersonTests {

    void testSomething() {

    }
}
