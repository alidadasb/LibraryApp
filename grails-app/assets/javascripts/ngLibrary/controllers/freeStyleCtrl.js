/**
 * Created by alidad on 7/4/14.
 */
angular.module('libraryApp')
    .controller('freeStyleCtrl', ['$scope' , '$resource', '$timeout', function ($scope, $resource, $timeout) {
        console.log("In Book freestyle zone");


        var CountryList = $resource('http://restcountries.eu/rest/v1', {}, {get: { method: 'GET', cache: true, isArray: true}});
        CountryList.get({}, function (data) {
            console.log(data);
            $scope.countryList = data;
        });


        $scope.library = {searchResult: undefined,searchTerm:undefined};

        // Search for books by title
        $scope.searchBook = function (event) {
            if ($scope.library.searchTerm) {
                var Books = $resource('/freeStyle/book/search', {query: $scope.library.searchTerm}, {get: { method: 'GET', cache: true, isArray: true}});
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

    }]);