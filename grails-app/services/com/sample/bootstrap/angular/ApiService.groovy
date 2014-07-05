package com.sample.bootstrap.angular

import grails.plugins.rest.client.RestResponse

class ApiService {
    static transactional = false
    def rest

    def searchBooks(String query) {
        RestResponse result = rest.get("http://localhost:8080/library/books/search/" + query)
        println "Rest result: " + result
        return result.json
    }
}
