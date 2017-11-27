/*
 * 
 *		@author Éderson Gervásio
 * 
 * 
 * 
 */

$(function () {
    var table = $('#tableCheckID').DataTable({
      'paging'      : true,
      'lengthChange': false,
      'searching'   : false,
      'ordering'    : true,
      'info'        : true,
      'autoWidth'   : false,
      'className': 'dt-body-center',
      'render': function (data, type, full, meta){
          return '<input type="checkbox" name="id[]" value="' 
             + $('<div/>').text(data).html() + '">';
      },
      "language": {
    	  "emptyTable": "Nenhum registro encontrado!",
    	  "infoEmpty": "0 Registros",
    	  "loadingRecords": "Carregando...",
    	  "processing":     "Processando...",
    	  "search":         "Pesquisar:",
    	  "lengthMenu":     "",
    	  "info":   "",
    	    	paginate: {
    	    		first:    '«',
    	    		previous: 'Anterior',
    	            next:     'Próximo',
    	            last:     '»'
    	        },
    	        aria: {
    	            paginate: {
    	            	first:    'Principal',
    	            	previous: 'Anterior',
    	                next:     'Próximo',
    	                last:     'Final'
    	            }
    	        }
    	  },
    })
  });

/*$(document).ready(function() {
    editor = new $.fn.dataTable.Editor( {
        "ajax": "../php/checkbox.php",
        "table": "#example",
        "fields": [ {
                label:     "Active:",
                name:      "active",
                type:      "checkbox",
                separator: "|",
                options:   [
                    { label: '', value: 1 }
                ]
            }, {
                label: "First name:",
                name:  "first_name"
            }, {
                label: "Last name:",
                name:  "last_name"
            }, {
                label: "Phone:",
                name:  "phone"
            }, {
                label: "City:",
                name:  "city"
            }, {
                label: "Zip:",
                name:  "zip"
            }
        ]
    } );*/
 
   /* $('#example').DataTable( {
        dom: "Bfrtip",
        ajax: "../php/checkbox.php",
        columns: [
            { data: "first_name" },
            { data: "last_name" },
            { data: "phone" },
            { data: "city" },
            { data: "zip" },
            {
                data:   "active",
                render: function ( data, type, row ) {
                    if ( type === 'display' ) {
                        return '<input type="checkbox" class="editor-active">';
                    }
                    return data;
                },
                className: "dt-body-center"
            }
        ],
        select: {
            style: 'os',
            selector: 'td:not(:last-child)' // no row selection on last column
        },
        buttons: [
            { extend: "create", editor: editor },
            { extend: "edit",   editor: editor },
            { extend: "remove", editor: editor }
        ],
        rowCallback: function ( row, data ) {
            // Set the checked state of the checkbox in the table
            $('input.editor-active', row).prop( 'checked', data.active == 1 );
        }
    } );
 
    $('#example').on( 'change', 'input.editor-active', function () {
        editor
            .edit( $(this).closest('tr'), false )
            .set( 'active', $(this).prop( 'checked' ) ? 1 : 0 )
            .submit();
    } );
} );*/