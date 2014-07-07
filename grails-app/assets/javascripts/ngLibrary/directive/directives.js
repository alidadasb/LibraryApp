/**
 * Created by alidad on 7/7/14.
 */

angular.module('libraryApp')
    .directive('getbook', function ($resource) {
        return{
            scope: { getbook : '@' },
            replace: false,
            restrict: 'A',
            template: "<span>{{book.title}}</span>",
            link: function (scope) {
                var Books = $resource('/library/books/:id', {}, {get: { method: 'GET', cache: true}});
                Books.get({id:scope.getbook}, function (data) {
                    scope.book = data;
                });
            }
        }
    });

