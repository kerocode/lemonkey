'use strict';

angular.module('goldstarApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
