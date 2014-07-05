LibraryApp
==========

A sample application that integrates AngularJs with Grails and work with REST Services.

This a simple library application that allows users to reserve books online, and also see their book reservation. It simply exposes 3 resources (users,books,reservations). 

Requirement:
1- User login
2- They can see their reserved books
3- They can search for available books
4- They can reserve new books

Intention is simply -- "really no intention for coding it this way"

How to use it: 

1- git clone https://github.com/alidadasb/LibraryApp.git
2- grailsw run-app  or download Grails 2.4.2 and then grails run-app
3- The home url is http://localhost:8080/library/home
4- You will see 3 pages, home,book,freestyle. its just different ways of pulling data from REST services by AngularJS and displaying them on the screen. 
5- The 3 ways of hitting REST resrvice are dirrectly from angular, through Grails services or simply hitting external urls :D 

