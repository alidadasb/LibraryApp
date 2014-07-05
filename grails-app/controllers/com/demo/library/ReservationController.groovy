package com.demo.library

import grails.converters.JSON
import grails.rest.RestfulController
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ReservationController extends RestfulController {
    static responseFormats = ['json', 'xml']

    ReservationController() {
        super(Reservation)
    }

    def queryReservationByUser() {
        log.info "Query params $params"
        render Reservation.findAllByUser(User.get(params.userId)) as JSON
    }

}
