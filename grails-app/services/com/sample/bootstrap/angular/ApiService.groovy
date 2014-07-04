package com.sample.bootstrap.angular

import grails.plugins.rest.client.RestResponse

class ApiService {
    static transactional = false
    def rest

    def getPerson() {

        RestResponse result = rest.get("http://localhost:8080/library/person/v1/persons/1")

        println "Rest result: " + result
        return result.json

    }
}
