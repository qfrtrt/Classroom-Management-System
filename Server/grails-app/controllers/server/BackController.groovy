package server

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class BackController {

    BackService backService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond backService.list(params), model:[backCount: backService.count()]
    }

    def show(Long id) {
        respond backService.get(id)
    }

    def create() {
        respond new Back(params)
    }

    def save(Back back) {
        if (back == null) {
            notFound()
            return
        }

        try {
            backService.save(back)
        } catch (ValidationException e) {
            respond back.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'back.label', default: 'Back'), back.id])
                redirect back
            }
            '*' { respond back, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond backService.get(id)
    }

    def update(Back back) {
        if (back == null) {
            notFound()
            return
        }

        try {
            backService.save(back)
        } catch (ValidationException e) {
            respond back.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'back.label', default: 'Back'), back.id])
                redirect back
            }
            '*'{ respond back, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        backService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'back.label', default: 'Back'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'back.label', default: 'Back'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
