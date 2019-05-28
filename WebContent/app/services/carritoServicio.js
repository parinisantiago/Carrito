app.factory("carritoServicio",
		['$http', '$q', 
		function($http, $q){
			var baseRESTurl = "./rest/";
		    
		    var interfazPublica = {
		    		
		    		nuevoCarrito : function(idUsuario){
						var defered = $q.defer();
				        var promise = defered.promise;
				        $http({
				        	  method  : 'POST',
				        	  url     : baseRESTurl + "carrito/nuevo",
				        	  data  : {"id": idUsuario}
				        	 })
						.then(
							function(respuesta){
								defered.resolve(respuesta.data);
							},
							function(respuesta){
								console.log("Error al crear carrito de usuario.");
								console.log(respuesta);
								defered.reject(respuesta);
						    });
						
						return promise;
					  },
					
					agregarProductoACarrito: function(idCarrito, producto){
						var defered = $q.defer();
				        var promise = defered.promise;
				        $http({
				        	  method  : 'PUT',
				        	  url     : baseRESTurl + "carrito/agregar",
				        	  data    : {"id": idCarrito, "productos":[{"id":producto.id}]}
				        	 })
				        .then(
							function(respuesta){
								defered.resolve(respuesta.data);
							},
							function(respuesta){
								console.log("Error al agregar producto en carrito");
								console.log(respuesta);
								alert("Error al agregar producto en carrito");
								defered.reject(respuesta);
						    });
						
						return promise;
					},
					
					quitarProductoACarrito: function(idCarrito, producto){
						var defered = $q.defer();
				        var promise = defered.promise;
				        $http({
				        	  method  : 'put',
				        	  url     : baseRESTurl + "carrito/quitar",
				        	  data    : {"id": idCarrito, "productos":[{"id":producto.id}]}
				        	 })
				        .then(
							function(respuesta){
								defered.resolve(respuesta.data);
							},
							function(respuesta){
								console.log("Error al quitar producto de carrito");
								console.log(respuesta);
								alert("Error al quitar producto de carrito");
								defered.reject(respuesta);
						    });
						
						return promise;
					},
					
					pagarCarrito: function(idCarrito){
						var defered = $q.defer();
				        var promise = defered.promise;
				        $http({
				        	  method  : 'PUT',
				        	  url     : baseRESTurl + "carrito/pagar",
				        	  data    : {"id": idCarrito}
				        	 })
				        .then(
							function(respuesta){
								defered.resolve(respuesta.data);
							},
							function(respuesta){
								console.log("Error al pagar carrito");
								console.log(respuesta);
								alert("Error al pagar carrito");
								defered.reject(respuesta);
						    });
						
						return promise;
					},
					
					borrarCarrito: function(idUsuario){
						var defered = $q.defer();
				        var promise = defered.promise;
				        $http({
				        	  method  : 'put',
				        	  url     : baseRESTurl + "carrito/borrar",
				        	  data    : {"id":idUsuario},
				        	 })
				        .then(
							function(respuesta){
								defered.resolve(respuesta.data);
							},
							function(respuesta){
								console.log("Error al borrar carrito");
								console.log(respuesta);
								alert("Error al borrar carrito");
								defered.reject(respuesta);
						    });
						
						return promise;
					}
					
		    }
		    
		    return interfazPublica;
		}]);