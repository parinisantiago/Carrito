app.factory("productoServicio",
		['$http', '$q', 
		function($http, $q, localstorage){
		    var baseRESTurl = "./rest/";
		    
		    var interfazPublica = {
		    		
				    getProductos : function(){
						var defered = $q.defer();
				        var promise = defered.promise;
				        $http({
				        	  method  : 'GET',
				        	  url     : baseRESTurl + "producto/productos",
				        	 })
						.then(
							function(respuesta){
								console.log(respuesta)
								defered.resolve(respuesta.data);
							},
							function(respuesta){
								console.log("Error al recuperar productos.");
								console.log(respuesta);
								defered.reject(respuesta);
						    });
						
						return promise;
					  }
		    }
		    
		    return interfazPublica;
		}]);