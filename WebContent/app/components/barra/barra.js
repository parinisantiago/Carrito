app.controller('barraController', barraController);
barraController.$inject = ['usuarioServicio', '$scope','$rootScope'];

function barraController(usuarioServicio, $scope,$rootScope) {

	$scope.usuario;
	$scope.usuarioSelect;
	$scope.carrito
	
	usuarioServicio.getUsuarios()
	.then(function(data){
		$scope.usuarios = data.Usuarios;
		$scope.usuarioSelect = $scope.usuarios[0];
		$rootScope.usu = $scope.usuarioSelect;
	})
	.catch(function(error){
		console.log(error)
	});


	
	
	$scope.setUsuario = function(){
		$scope.usuario = $scope.usuarioSelect;
		$scope.carrito = $scope.usuario.carrito;
		$rootScope.usu = $scope.usuario;
		$rootScope.$broadcast('updateCarrito', $scope.usuario.carrito);
	}
	$scope.top;
	$scope.buscarTop = function(){
		usuarioServicio.getTop($scope.usuarioSelect.id).then(
				function(data){
					$scope.top = data.Productos
				}).catch(
				function(error){
					$scope.top = data.Productos
				})
	}
	
	$(function () {
		$('[data-toggle="tooltip"]').tooltip()
	})
}

app.component("barra", {
		controller: 'barraController',
		templateUrl: 'app/components/barra/barra.html',
	
});