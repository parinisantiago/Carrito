app.factory("usuarioServicio",
		['$http', '$q', 
		function($http, $q){
		    var baseRESTurl = "./rest/";
		    		    
		    var interfazPublica = {
		    	
				getUsuarios : function(){
					//return [{nombre:"juan",vip:true},{nombre:"Pedro",vip:false}];
					var defered = $q.defer();
			        var promise = defered.promise;
			        $http({
			        	  method  : 'GET',
			        	  url     : baseRESTurl + "usuario/usuarios",
			        	 })
					.then(
						function(respuesta){
							defered.resolve(respuesta.data);
						},
						function(respuesta){
							console.log("Error al recuperar usuarios.");
							console.log(respuesta);
							defered.reject(respuesta);
					    });
					
					return promise;
				  },
				getTop : function(idUser){
					var defered = $q.defer();
			        var promise = defered.promise;
			        $http({
			        	  method  : 'GET',
			        	  url     : baseRESTurl + "usuario/top?dni="+idUser,
			        	 })
					.then(
						function(respuesta){
							defered.resolve(respuesta.data);
						},
						function(respuesta){
							console.log("Error al recuperar usuarios.");
							console.log(respuesta);
							defered.reject(respuesta);
					    });
					
					return promise;
				}
		    }
		    
		    return interfazPublica;
		}]);