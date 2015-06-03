var todoApp = angular.module('todoApp', ['ngRoute', 'todoControllers']);

todoApp.config(['$routeProvider',
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
