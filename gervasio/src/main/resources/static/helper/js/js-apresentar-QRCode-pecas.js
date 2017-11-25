/**
 * @author Éderson Gervásio
 *		   edersongervasiosilva@gmail.com
 *		   linkedin.com/in/edersongs
 *	   	   github.com/edersongs	
 *	       + 55 (34) 9 9272-2350	
 *
 */
	
function onClickGerarQr(codigo) {
	
	$('#dvQR').html('<img src="/pecas/gerarQR?texto='+codigo+'&tamanho='+parseInt(300)+'">');
}