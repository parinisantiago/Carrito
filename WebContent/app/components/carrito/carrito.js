app.controller('carritoController', carritoController);
carritoController.$inject = ['$scope','$http','$rootScope','carritoServicio'];

function carritoController($scope,$http,$rootScope,carritoServicio) {
	var ctrl = this;
	console.log("asdasd")
	console.log($rootScope.usu);
	$scope.usu = $rootScope.usu;
	$scope.carrito;
	if($rootScope.usu !== undefined){
		$scope.carrito = $rootScope.usu.carrito;
	}
	
	$scope.crearCarrito = function(){
		//llamar al service
		$rootScope.usu.carrito = {id:1,productos:[]};
	}
	$scope.$on('updateCarrito',function(event, profileObj) {
		$scope.carrito = profileObj;
		console.log($scope.carrito)
	})
	$scope.hayCarrito = function(){
		return $rootScope.usu !== undefined && $rootScope.usu.carrito !== undefined;
	}
	
	$scope.hayUsuario= function(){
		return $rootScope.usu !== undefined;
	}
	
	$scope.mostrarBoton = function(){
		return  $rootScope.usu !== undefined &&  $rootScope.usu.carrito === undefined;
	}
	
	$scope.quitarProducto = function(producto){
		carritoServicio.quitarProductoACarrito($rootScope.usu.carrito.id, producto)
		.then(function(data){
			$rootScope.usu.carrito = data.Carrito;
			$rootScope.$broadcast('updateCarrito', data.Carrito);
		});
	}
	
	$scope.borrarCarrito = function(){
		carritoServicio.borrarCarrito($rootScope.usu.id)
		.then(function(data){
			$rootScope.usu.carrito = undefined;
		})
	}
	
	$scope.crearCarrito = function(){
		carritoServicio.nuevoCarrito($rootScope.usu.id)
		.then(function(data){
			$rootScope.usu.carrito = data.Carrito;
			$rootScope.$broadcast('updateCarrito', data.Carrito);
		})
	}
	
	$scope.pagarCarrito = function(){
		carritoServicio.pagarCarrito($rootScope.usu.carrito.id)
		.then(function(data){
			$scope.carritoPago = data.Carrito
			$rootScope.usu.carrito = undefined
			$rootScope.$broadcast('updateCarrito', undefined);
		})
	}
}

app.component("carrito", {
		controller: 'carritoController',
		templateUrl: 'app/components/carrito/carrito.html',
	
});
