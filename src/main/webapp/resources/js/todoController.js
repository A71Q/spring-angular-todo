var todoController = angular.module('todoController', []);

todoController.controller('ToDoCtrl', function ($scope, $http, ToDoServiceList) {

    $scope.editMode = false;
    $scope.position = '';

    $scope.getAllTodos = function () {
        $scope.resetError();
        $scope.todos = ToDoServiceList.query();
    };

    $scope.addTodo = function (todo) {
        $scope.resetError();
        console.log(todo);
        $http.post('todo/add', todo).success(function (response) {
            $scope.getAllTodos();
            $scope.todo.title = '';
        }).error(function () {
                $scope.setError('Could add todo');
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