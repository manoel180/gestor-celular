var minutos = 20;
var seconds = 00;
var campo = document.getElementById("cronometro");
var campo_div = document.getElementById("cronometro_div");

function startCountdown() {
	if (seconds <= 0) {
		seconds = 60;
		minutos -= 1;
	}
	if (minutos <= -1) {
		seconds = 0;
		seconds += 1;
		campo.innerHTML = "";
		campo_div.innerHTML = "Sessão expirada!";
	} else {
		seconds -= 1;
		if (seconds < 10) {
			seconds = "0" + seconds;
		}
		campo.innerHTML = " " + minutos + "min" + seconds;
		setTimeout("startCountdown()", 1000);
	}
}
startCountdown();