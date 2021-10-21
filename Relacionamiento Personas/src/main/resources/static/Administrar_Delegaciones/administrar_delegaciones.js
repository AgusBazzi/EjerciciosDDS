var app = new Vue({
	el: "#main",
	data: {
		delegaciones: []
	},
	created () {
		fetch('http://localhost:9090/reporte/delegaciones')
		.then(response => response.json())
		.then(data => {
			this.delegaciones = data
		})
	}
})