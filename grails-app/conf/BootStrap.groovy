import com.demo.library.Book
import com.demo.library.Reservation
import com.demo.library.User

class BootStrap {

    def fixtureLoader

    def init = { servletContext ->
        fixtureLoader.load("bookData")
        assert Book.list()
        assert User.list()
        assert Reservation.list()
    }
    def destroy = {
    }
}
