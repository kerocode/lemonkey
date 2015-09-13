'use strict';

angular.module('goldstarApp')
    .controller('MainController', function ($scope, Principal, Upload) {
        Principal.identity().then(function(account) {
            $scope.account = account;
            $scope.isAuthenticated = Principal.isAuthenticated;

        });

        $scope.upload = function (file) {
            console.log('here');
            Upload.upload({
                url: '/api/keylemon/image',
                file: file
            }).then(function(result) {
                console.log(result);
                $scope.faceData = result.data

            })
        };
    });

