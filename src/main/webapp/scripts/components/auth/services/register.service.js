'use strict';

angular.module('goldstarApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


