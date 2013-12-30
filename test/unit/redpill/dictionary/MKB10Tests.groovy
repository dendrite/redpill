package redpill.dictionary



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(MKB10)
@Mock([DictionaryItem, Dictionary])
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


        dictionary_K00
            .add(new DictionaryItem(
                        id: UUID.randomUUID(),
                        code: 'K00.0',
                        name: 'Адентия',
                        description: 'Адентия',
                )
            )
            .add(new DictionaryItem(
                        id: UUID.randomUUID(),
                        code: 'K00.1',
                        name: 'Сверхкомплектные зубы',
                        description: 'Сверхкомплектные зубы',
                )
            )
            .add(new DictionaryItem(
                        id: UUID.randomUUID(),
                        code: 'K00.2',
                        name: 'Аномалии размеров и формы зубов',
                        description: 'Аномалии размеров и формы зубов',
                )
            )


        println mkb10
        println dictionary_K00

        println "\n\n\n\n\n\n"

        println "---"

        println "dictionary_K00:" + dictionary_K00



        println "mkb" + mkb10
        println "\n\n child ?" + mkb10.hasChildDictionary


    }

    void testSomething() {
//        fail "Implement me"
    }
}
