package redpill.dictionary



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(MKB10)
class MKB10Tests {

    void testMKB10OneClass(){

        MKB10 mkb10 = new MKB10(id: UUID.randomUUID(), title: 'Справочник МКБ-10', parent: null, description: 'Международный справичник' )


        Dictionary dictionary = new Dictionary(
                id: UUID.randomUUID(),
                title: 'Класс XI. Болезни органов пищеварения (K00—K93)',
                code: null,
                description: 'Класс XI. Болезни органов пищеварения (K00—K93)',
                parent: mkb10

        )

        Dictionary dictionary_K00_K14 = new Dictionary(
                id: UUID.randomUUID(),
                title: 'Болезни полости рта, слюнных желез и челюстей',
                code: 'K00—K14',
                description: 'K00—K14 Болезни полости рта, слюнных желез и челюстей',
                parent: dictionary
        )

        Dictionary dictionary_K00 = new Dictionary(
                id: UUID.randomUUID(),
                title: 'Нарушения развития и прорезывания зубов',
                code: 'K00',
                description: 'Нарушения развития и прорезывания зубов',
                parent: dictionary_K00_K14
        )

//        DictionaryItem dictionaryItem1
//
//        DictionaryItem dictionaryItem = new DictionaryItem(id: UUID.randomUUID(), code: )

        println mkb10
        println dictionary_K00

    }

    void testSomething() {
//        fail "Implement me"
    }
}
