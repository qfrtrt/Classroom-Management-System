package server

import grails.test.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class BackServiceSpec extends Specification {

    BackService backService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Back(...).save(flush: true, failOnError: true)
        //new Back(...).save(flush: true, failOnError: true)
        //Back back = new Back(...).save(flush: true, failOnError: true)
        //new Back(...).save(flush: true, failOnError: true)
        //new Back(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //back.id
    }

    void "test get"() {
        setupData()

        expect:
        backService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Back> backList = backService.list(max: 2, offset: 2)

        then:
        backList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        backService.count() == 5
    }

    void "test delete"() {
        Long backId = setupData()

        expect:
        backService.count() == 5

        when:
        backService.delete(backId)
        sessionFactory.currentSession.flush()

        then:
        backService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Back back = new Back()
        backService.save(back)

        then:
        back.id != null
    }
}
