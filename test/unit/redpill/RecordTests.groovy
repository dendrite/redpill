package redpill



import grails.test.mixin.*
import grails.test.mixin.domain.DomainClassUnitTestMixin
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Record)
class RecordTests {

    void testSomething() {

        UUID uuid1 = UUID.randomUUID();
        UUID uuid2 = UUID.randomUUID();

        def record = new Record(id: uuid1 , createdAt: new Date(), description: "Record #1", name: "Name #1" );
        record.save(flush: true, failOnError: true);

        record = new Record(id: uuid2 , createdAt: new Date(), description: "Record #2", name: "Name #2" );
        record.save(flush: true, failOnError: true);


        def recordBack = Record.read(uuid2)
        println recordBack.description

        // fail "Implement me"
    }
}
