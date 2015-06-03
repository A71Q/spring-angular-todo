var todoController = angular.module('todoController', []);

todoController.controller('ToDoCtrl', function ($scope, ToDoServiceList) {

    $scope.getAllTodos = function () {
        $scope.resetError();
        $scope.todos = ToDoServiceList.query();
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