/**
 * Created by alidad on 6/21/14.
 */
angular.module('libraryApp')
    .controller('bookManagerCtrl', ['$scope' ,'$resource','$timeout', function ($scope, $resource,$timeout) {
        console.log("In Book manager");

        $scope.library = {
            newbook :{
                numberOfCopies:undefined,
                author:undefined,
                title:undefined
            }
        };

        $scope.saveBook = function(){
            var Books = $resource('/library/books', {}, {save: { method: 'POST', cache: false}});
            Books.save($scope.library.newbook, function (response) {
                console.log(response);
                $scope.showSuccess("Successfully saved a book");
            });
        }




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

    }]);
