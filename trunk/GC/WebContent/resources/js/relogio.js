function mueveReloj() {
	var horadiv = document.getElementById("hora");
	momentoActual = new Date();
	hora = momentoActual.getHours();
	if (hora < 10) {
		hora = "0" + hora;
		minuto = momentoActual.getMinutes();
	}
	if (minuto < 10) {
		minuto = "0" + minuto;
		segundo = momentoActual.getSeconds();
	}
	if (segundo < 10)
		segundo = "0" + segundo;

	horadiv.innerHTML = hora + " : " + minuto + " : " + segundo;
	setTimeout("mueveReloj()", 1000);
}
mueveReloj();