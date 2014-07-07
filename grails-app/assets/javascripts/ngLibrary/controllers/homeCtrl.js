/**
 * Created by alidad on 6/21/14.
 */
angular.module('libraryApp')
    .controller('homeCtrl', ['$scope' , '$resource', '$timeout', function ($scope, $resource, $timeout) {

        //Library model
        $scope.library = {searchTerm: undefined, searchResult: undefined, user: undefined};


        // Resetting error after 10 sec
        $scope.showError = function (message) {
            $scope.error = message;

            $timeout(function () {
                $scope.error = undefined;
            }, 10000);
        };

        // Resetting success after 10 sec
        $scope.showSuccess = function (message) {
            $scope.success = message;

            $timeout(function () {
                $scope.success = undefined;
            }, 10000);
        };


        // Search for books by title
        $scope.searchBook = function (event) {
            if ($scope.library.searchTerm) {
                var Books = $resource('/library/books/search', {query: $scope.library.searchTerm}, {get: { method: 'GET', cache: true, isArray: true}});
                Books.get({query: $scope.library.searchTerm}, function (data) {
                    console.log(data);
                    $scope.library.searchResult = data;
                });
            } else {
                var Books = $resource('/library/books', {max: -1}, {get: { method: 'GET', cache: true, isArray: true}});
                Books.get({}, function (data) {
                    console.log(data);
                    $scope.library.searchResult = data;
                })
            }
        };

        //Reserve a book for a user
        $scope.reserve = function (book) {
            if ($scope.library.user && book.id) {
                alert("About to reserve book [" + book.title + "]");
                var newReservation = {
                    book: {id: book.id},
                    user: {id: $scope.library.user.id},
                    startDate: "2014-06-29T02:02:44Z"
                }

                var Reservations = $resource('/library/reservations', {}, {save: { method: 'POST', cache: false}});
                Reservations.save(newReservation, function (response) {
                    console.log(response);
                    $scope.showSuccess("Successfully save a reservation");
                    $scope.loadUserReservations();
                });

            }
        };

        // List all users reservations
        $scope.loadUserReservations = function () {
            console.log($scope.library.user);
            var Reservations = $resource('/library/reservations/search/user', {}, {get: { method: 'GET', cache: false, isArray: true}});
            Reservations.get({"userId": $scope.library.user.id}, function (response) {
                console.log(response);
                $scope.library.userReservations = response;
            })
        }


        // Logging out from system
        $scope.logout = function () {
            $scope.library.user = undefined
        };


        // Logging into the system
        $scope.login = function (name, ev) {
            if (ev.which == 13) {
                var Users = $resource('/library/users/search', {}, {});
                Users.get({query: name}, function (data) {
                    console.log(data);
                    if (data.name && data.id) {
                        $scope.library.user = angular.copy(data);
                        $scope.loadUserReservations();
                    }
                    else {
                        $scope.showError("Cannot find the username, please provide a valid username by looking at the bookData.groovy file");
                    }
                })
            }
        };


    }]);