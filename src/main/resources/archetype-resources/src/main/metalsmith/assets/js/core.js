function createBackendURL(path){
	if(window.location.href==="http://localhost:8080/"){
		return "http://localhost:5000/" + path;
	} else {
		return "https://two-tier.herokuapp.com/" + path;
	}
}