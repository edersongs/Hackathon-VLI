document.getElementById("btnTransID").addEventListener("click", onClickBotao);

function onClickBotao() {
    $.ajax({
        url: '/transferencias/listaFiliais',
        method: "GET",
        dataType: "json",
        success: pesquisaRealizadaComSucess
    });
}

function pesquisaRealizadaComSucess(dados) {
	if ($.isArray(dados)) {
		$('#filOriID').find('option').remove();
		$('#filDstID').find('option').remove();
        $.each(dados, function(index, value) {
            $('#filOriID').append('<option value=' + value.codigo + '>' + value.nome + '</option>');
        });
        
        $.each(dados, function(index, value) {
            $('#filDstID').append('<option value=' + value.codigo + '>' + value.nome + '</option>');
        });
    }
}