<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="page-header">
  <h1>GPA <small>Sistema de Gestão  de Programas Acadêmicos</small></h1>
</div>
<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
	      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="<c:url value='/'/>">Home</a>
	    </div>
	    
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	    	<ul class="nav navbar-nav">
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Aluno<b class="caret"></b></a>
		          <ul class="dropdown-menu">
		            <li><a href="<c:url value=''/>">Adicionar</a></li>
		            <li class="divider"></li>
		            <li><a href="<c:url value='alunos.htm'/>">Listar</a></li>
		            <li class="divider"></li>
		            <li><a href="<c:url value='auxilio.htm'/>">Inscri��o Aux�lio Moradia</a></li>
		            <li class="divider"></li>
		            <li><a href="<c:url value='iniciacao.htm'/>">Inscri��o Inicia��o Acad�mica</a></li>
		          </ul>
		        </li>
		        <li class="dropdown">
		          <a href="#" class="dropdown-toggle" data-toggle="dropdown">Servidor<b class="caret"></b></a>
		          <ul class="dropdown-menu">
		            <li><a href="<c:url value=''/>">Adicionar</a></li>
		            <li class="divider"></li>
		            <li><a href="<c:url value='servidores.htm'/>">Listar</a></li>
		          </ul>
		        </li>
	
		      </ul>
	    </div>
	</div>
</nav>