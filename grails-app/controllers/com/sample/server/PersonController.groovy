package com.sample.server

import grails.converters.JSON

class PersonController {

    def show() {
        def result

        if (params.id) {
            result = [
                    result:persons()[0]
            ]
            render result as JSON
        } else {
            result = [
                    result: persons()
            ]
            render result as JSON
        }
    }

    private ArrayList<LinkedHashMap<String, Serializable>> persons() {
        [
                [name: "alidad", lastName: "Soleimani", age: 123, address: "321 Earth"],
                [name: "John", lastName: "Smith", age: 54, address: "1 right ave"]
        ]
    }

}
