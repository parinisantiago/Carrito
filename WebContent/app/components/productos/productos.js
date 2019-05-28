app.controller('productosController', productosController);
productosController.$inject = ['carritoServicio', 'productoServicio', '$scope','$http','$rootScope'];

function productosController(carritoServicio,productoServicio,$scope,$http,$rootScope) {
	
	var ctrl = this;
	$scope.busqueda;
	productoServicio.getProductos()
	.then(function(data){
		$scope.productos = data.Productos;
	})
	.catch(function(error){
		console.log(error);
	})

	$scope.hayCarrito = function(){
		return $rootScope.usu !== undefined && $rootScope.usu.carrito !== undefined;
	}
	$scope.enCarrito = function(producto){
		let prod = $rootScope.usu.carrito.productos;
			let size = prod.length;
		for(let i = 0; i < size;i++){
			if(prod[i].id == producto.id){return true;}
		}
		return false;
	}
	
	$scope.agregarProducto = function(producto){
		carritoServicio.agregarProductoACarrito($rootScope.usu.carrito.id, producto)
		.then(function(data){
			$rootScope.$broadcast('updateCarrito', data.Carrito);
			$rootScope.usu.carrito = data.Carrito;
		});
		
	}
	$scope.quitarProducto = function(producto){
		carritoServicio.quitarProductoACarrito($rootScope.usu.carrito.id, producto)
		.then(function(data){
			$rootScope.$broadcast('updateCarrito', data.Carrito);
			$rootScope.usu.carrito = data.Carrito;
		});
	}

}

app.component("productos", {
		controller: 'productosController',
		templateUrl: 'app/components/productos/productos.html',
	
});
