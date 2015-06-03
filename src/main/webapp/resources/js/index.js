var todoControllers = angular.module('todoControllers', []);

todoControllers.controller('ToDoCtrl', function ($scope, $http) {

    console.log("todoctrl-e:");

    $scope.getAllTodos = function () {
        $scope.resetError();
        console.log("getting all todo");
        $http.get('todo/all.json').success(function (response) {
            $scope.todos = response;
        }).error(function () {
                $scope.setError('Could not display all todos');
            });
    };

    $scope.resetError = function () {
        $scope.error = false;
        $scope.errorMessage = '';
    };

    $scope.setError = function (message) {
        $scope.error = true;
        $scope.errorMessage = message;
    };

    $scope.getAllTodos();
});