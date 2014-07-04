class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "clientApp")
        "500"(view:'/error')

        "/home"(controller: "clientApp",action: 'home')
        "/book"(controller: "clientApp",action: 'book')
        "/"(controller: 'clientApp', action: 'redirectToHome')

        "/person/v1/persons/$id?" (resource: "person")
        "/api/person/$id?" (controller: 'clientApp', action: 'individual')
    }
}
