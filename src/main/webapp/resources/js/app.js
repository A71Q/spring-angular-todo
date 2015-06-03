angular.module('todoApp', ['ngRoute', 'ngResource', 'todoController', 'todoService']);

angular.module('todoApp').config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
            when('/todos', {
                templateUrl: 'todo/list',
                controller: 'ToDoCtrl'
            }).
            otherwise({
                redirectTo: '/todos'
            });
    }]);
