package com.sample.bootstrap.angular

class ClientAppController {

    def apiService

    def index() {
    }

    def redirectToHome() {
        redirect(uri: '/home')
    }

    def treatGrailsApiAsIfItsExternal(){
        render apiService.searchBooks(params)
    }

}
