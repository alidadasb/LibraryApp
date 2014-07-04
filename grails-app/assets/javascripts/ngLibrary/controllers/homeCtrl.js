/**
 * Created by alidad on 6/21/14.
 */
angular.module('libraryApp')
    .controller('homeCtrl', ['$scope' ,'$resource', function ($scope, $resource) {
        console.log("In home");

        var Persons = $resource('/library/api/person/:id', {id: '@mid'});
        var CountryList = $resource('http://restcountries.eu/rest/v1', {},{get:{ method : 'GET',cache : true, isArray: true}});

        Persons.get({mid: 1}, function ( data) {
            console.log(data);
            $scope.data = data;
        });

        CountryList.get({}, function ( data) {
            console.log(data);
            $scope.countryList = data;
        });

    }]);
