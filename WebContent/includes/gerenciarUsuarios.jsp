<div class="header-conteudo">
		<h2>Usu�rios </h2>
	</div>
<div class="conteudo">
	

		<section id="exclusao">
				<h3>Deseja excluir: <span></span></h3>
				<form id="form-excluir">
					<input type="hidden" id="id-exclude" name="id_usuario">
					<input type="submit" value="SIM" class="bt-sim">
					<button class="bt-nao"> NÂO </button>
				</form>
	</section>

	<section id="load-form"></section>


	<table class="table table-hover table-striped"> 
		<thead class="tabela-fotos"> 
			<tr> 
				<th>C�digo</th> 
				<th>Nome</th> 
				<th>E-mail</th> 
				<th>Op��es</th> 
			</tr> 
		</thead> 
		<tbody id='listaUsuarios' class="tabela-fotos"> 
			 <tr> 
				<th scope="row"><?=$lista[$i]['id']?></th> 
				<td><?=$lista[$i]['nome']?></td> 
				<td><?=$lista[$i]['email']?></td> 
				<td class="ops">
					<a class="tooltips" data-toggle="tooltip" data-placement="right" title="Ativar">
						<div class="table-ops ativar bt-ativar" data-id="<?=$lista[$i]['id']?>"></div>
					</a>
					<a class="tooltips" data-toggle="tooltip" data-placement="right" title="Desativar">
						<div class="table-ops desativar bt-desativar" data-id="<?=$lista[$i]['id']?>"></div>
					</a>
				</td> 
			</tr>

		</tbody> 
	</table>
</div>