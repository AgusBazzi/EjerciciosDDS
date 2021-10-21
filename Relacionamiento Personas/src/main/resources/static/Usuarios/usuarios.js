var app = new Vue({
	el: "#main",
	data: {
		usuarios: []
	},
	created () {
		fetch('http://localhost:9090/reporte/usuarios')
		.then(response => response.json())
		.then(data => {
			this.usuarios = data
		})
	}
})