/**
 * Created by alidad on 6/17/14.
 */
console.log("loading app");
angular.module('libraryApp', ['ngRoute','ngResource'])
    .config([ '$routeProvider' ,'$locationProvider','$compileProvider','$logProvider', function ($routeProvider,$locationProvider,$compileProvider,$logProvider) {

        $logProvider.debugEnabled(true);
        $routeProvider
            .when('/library/home', {templateUrl: 'views/home.html', controller: 'homeCtrl'})
            .when('/library/bookManagement', {templateUrl: 'views/book.html', controller: 'bookManagerCtrl'})
            .when('/library/externalApi', {templateUrl: 'views/freeStyle.html', controller: 'freeStyleCtrl'});

        $compileProvider.aHrefSanitizationWhitelist(/^\s*(https?|ftp|mailto|file|ijet2):/);
        $locationProvider.html5Mode(true);

    }]);



