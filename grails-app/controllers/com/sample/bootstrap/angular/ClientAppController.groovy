package com.sample.bootstrap.angular

class ClientAppController {

    static defaultAction = "home"

    def apiService

    def home() {
    }

    def redirectToHome() {
        redirect(uri: '/home')
    }

    def redirectToBook() {
        redirect(uri: '/book')
    }

    def individual() {
        println "Params: $params"
        render apiService.getPerson()
    }
}
