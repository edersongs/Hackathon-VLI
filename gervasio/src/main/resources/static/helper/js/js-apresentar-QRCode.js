/**
 * @author Éderson Gervásio
 *		   edersongervasiosilva@gmail.com
 *		   linkedin.com/in/edersongs
 *	   	   github.com/edersongs	
 *	       + 55 (34) 9 9272-2350	
 *
 */
	
function onClickGerarQr() {
	
	var valorDiditado = $('#valorID').val();
	var tamanhoDiditado = $('#tamanhoID').val();
	
	if (valorDiditado != null && tamanhoDiditado != null) {
		$('#dvQR').html('<img src="ativos/gerarQR?texto='+valorDiditado+'&tamanho='+parseInt(tamanhoDiditado)+'">');
	}
	
}