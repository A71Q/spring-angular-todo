var todoService = angular.module('todoService', []);

todoService.service('ToDoServiceList', ['$resource', function ($resource) {
    return $resource('todo/all.json');
}]);