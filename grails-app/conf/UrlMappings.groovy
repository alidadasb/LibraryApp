class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {}

        "/"(controller: "clientApp")
        "500"(view: '/error')

        "/home"(controller: "clientApp", action: 'index')
        "/book"(controller: "clientApp", action: 'book')
        "/"(controller: 'clientApp', action: 'redirectToHome')
        "/bookManagement"(controller: 'clientApp',action:'index')
        "/externalApi"(controller: 'clientApp',action:'index')

        "/books/search" (controller: 'book', action: 'queryBooks')
        "/users/search" (controller: 'user', action: 'queryUser')
        "/books"(resources:'book')
        "/users"(resources:'user')
        "/reservations"(resources:'reservation')
        "/reservations/search/user"(controller: 'reservation',action: 'queryReservationByUser')

        "/freeStyle/book/search"(controller: 'clientApp',action: 'treatGrailsApiAsIfItsExternal')

    }
}
