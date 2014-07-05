package com.demo.library

import grails.converters.JSON
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = true)
class UserController extends RestfulController {
    static responseFormats = ['json', 'xml']

    UserController() {
        super(User)
    }

    def queryUser() {
        log.info "Query params $params"
        render User.findByNameIlike(params.query + '%') as JSON
    }

}
