var todoApp = angular.module('todoApp', []);

todoApp.controller('ToDoCtrl', function ($scope) {
    $scope.todos = ["First","Second", "Third", "Fourth"];
});