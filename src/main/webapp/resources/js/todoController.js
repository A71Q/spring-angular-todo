var todoController = angular.module('todoController', []);

todoController.controller('ToDoCtrl', function ($scope, $http, ToDoServiceList) {

    $scope.editMode = false;
    $scope.position = '';

    $scope.getAllTodos = function () {
        $scope.resetError();
        $scope.todos = ToDoServiceList.query();
    };

    $scope.addTodo = function (newTodo) {
        $scope.resetError();
        $http.post('todo/add/' + newTodo).success(function (response) {
            $scope.getAllTodos();
        }).error(function () {
                    $scope.setError('Could add todo');
                });
        $scope.todoName = '';
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