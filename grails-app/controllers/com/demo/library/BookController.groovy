package com.demo.library

import grails.converters.JSON
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = true)
class BookController extends RestfulController {
    static responseFormats = ['json', 'xml']

    BookController() {
        super(Book)
    }

    def queryBooks() {
        log.info "Query params $params"
        render Book.findAllByTitleIlike('%' + params.query + '%') as JSON
    }
}
