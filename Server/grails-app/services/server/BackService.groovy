package server

import grails.gorm.services.Service

@Service(Back)
interface BackService {

    Back get(Serializable id)

    List<Back> list(Map args)

    Long count()

    void delete(Serializable id)

    Back save(Back back)

}