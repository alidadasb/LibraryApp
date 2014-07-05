import com.demo.library.Book
import com.demo.library.Reservation
import com.demo.library.User

fixture {

    book10(Book, title: "Angel Child, Dragon Child", author: "Michelle Maria Surat", numberOfCopies: 8)
    book11(Book, title: "An Angel for Solomon Singer", author: "Cynthia Rylant", numberOfCopies: 10)
    book12(Book, title: "Arctic Stories", author: "Michael Arvaarluk Kusugak", numberOfCopies: 9)
    book13(Book, title: "Chesterís Way", author: "Kevin Henkes", numberOfCopies: 10)
    book14(Book, title: "Don't Need Friends", author: "Carolyn Crimi", numberOfCopies: 10)
    book15(Book, title: "Good Luck, Mrs. K!", author: "Louise Borden", numberOfCopies: 10)
    book16(Book, title: "Horace and Morris but Mostly Delores", author: "James Howe", numberOfCopies: 10)
    book17(Book, title: "Ira Sleeps Over", author: "Bernard Waber", numberOfCopies: 10)
    book18(Book, title: "Just Kids: Visiting a Class for Children with Special Needs", author: "E. B. Senisi", numberOfCopies: 10)
    book19(Book, title: "Let's Talk About It: Extraordinary Friends", author: "Fred Rogers", numberOfCopies: 10)
    book20(Book, title: "Lottie's New Friend", author: "Petra Mathers", numberOfCopies: 9)
    book21(Book, title: "Miss Rumphius", author: "Barbara Cooney", numberOfCopies: 10)
    book22(Book, title: "Mrs. Katz and Tush", author: "Patricia Polacco", numberOfCopies: 10)
    book23(Book, title: "Next Spring an Oriole", author: "Gloria Whelan", numberOfCopies: 10)
    book24(Book, title: "Officer Buckle and Gloria", author: "Peggy Rathmann", numberOfCopies: 10)
    book25(Book, title: "Old Henry", author: "Joan Blos", numberOfCopies: 10)
    book26(Book, title: "The Old Woman Who Named Things", author: "Cynthia Rylant", numberOfCopies: 10)
    book27(Book, title: "The Shy Little Girl", author: "Phyllis Krasilovsky", numberOfCopies: 9)
    book28(Book, title: "Sing to the Stars,", author: "Mary Brigid Barrett", numberOfCopies: 9)
    book29(Book, title: "Somebody Loves You, Mr. Hatch", author: "Eileen Spinelli", numberOfCopies: 9)
    book30(Book, title: "Stellaluna", author: "Janelle Cannon", numberOfCopies: 9)
    book31(Book, title: "Swimmy", author: "Leo Lionni", numberOfCopies: 10)
    book32(Book, title: "Uncle Willie and the Soup Kitchen", author: "Dianne DiSalvo Ryan", numberOfCopies: 10)
    book33(Book, title: "Yoko", author: "Rosemary Well", numberOfCopies: 10)


    user1(User, name: "John Smith")
    user2(User, name: "Alidad Soleimani")
    user3(User, name: "Dhiraj Mahapatro")
    user4(User, name: "Brad Peter")
    user5(User, name: "Andy William")
    user6(User, name: "Peter Jash")

    res1(Reservation, user: user1, book: book10, startDate: new Date())
    res2(Reservation, user: user1, book: book20, startDate: new Date())
    res3(Reservation, user: user2, book: book12, startDate: new Date() - 6)
    res4(Reservation, user: user3, book: book10, startDate: new Date() - 5)
    res5(Reservation, user: user4, book: book27, startDate: new Date() - 4)
    res6(Reservation, user: user5, book: book28, startDate: new Date() - 3)
    res7(Reservation, user: user5, book: book29, startDate: new Date() - 2)
    res8(Reservation, user: user5, book: book30, startDate: new Date() - 1)

}