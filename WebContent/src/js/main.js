

ApplicationLoad = {
  init: function () {
    this.load_page();
  },

  load_page: function(){
    $(window).load(function(){
      $("#load").fadeOut(500).delay(500);
    });

  },

}

$(document).ready( function () { 

	carregar();

	function carregar(){
			$('#listaUsuarios').load("Connection");
		}

		jQuery('#form-excluir').submit(function(){
			loadIn();
			var dados = jQuery(this).serialize();
			jQuery.ajax({
				type: "POST",
				url: "inc/modules/module-empresa/deletar.php",
				data: dados,
				success: function(data)
				{	
					carregar();
					$('#exclusao').fadeOut(10);
					$('#form-excluir').each(function(){
  					this.reset();
					});
					loadOut();
					mensagem(data);

					
				}
			});
			
			return false;
		});




	ApplicationLoad.init(); 


});