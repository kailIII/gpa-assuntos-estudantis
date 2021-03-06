<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<jsp:include page="../fragments/headTag.jsp" />
<title>Cadastra/Edita servidor</title>

</head>
<body>
	<jsp:include page="../fragments/bodyHeader.jsp" />
	<ol class="breadcrumb">
		<li><a href="/MAE/servidor/listar">Listar Servidor</a></li>
		<li class="active">Cadastrar Servidor</li>
	</ol>

	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<c:choose>
					<c:when test="${action == 'cadastrar'}">
						<h2>Novo Servidor</h2>
					</c:when>
					<c:otherwise>
						<h2>Editar Servidor</h2>
					</c:otherwise>
				</c:choose>
			</div>

			<div class="panel-body">
				<form:form id="adicionarServidorForm" role="form"
					commandName="servidor" servletRelativeAction="/servidor/salvar"
					method="POST" cssClass="form-horizontal">
					<input type="hidden" name="id" value="${servidor.id}" />
					<div class="form-group">
						<label for="SIAPE" class="col-sm-1 control-label">SIAPE:</label>
						<div class="col-sm-3">
							<form:input id="siape" maxlength="7" path="siape"
								cssClass="form-control" placeholder="SIAPE do servidor" />
							<div class="error-validation">
								<form:errors path="siape">
									<label class="col-sm-10 control-label" id="label-erro">
										Campo Obrigatório!
									</label>
								</form:errors>
							</div>
						</div>
					</div>

					<div class="form-group">
						<label for="Cargo" class="col-sm-1 control-label"
							id="label-select">Cargo:</label>
						<div class="col-sm-3 control-label">
							<form:select path="cargo" id="cargo" class="form-control">
								<form:option value="">Selecione Cargo</form:option>
								<form:options items="${cargos}" />
							</form:select>
							<div class="error-validation">
								<form:errors path="siape">
									<label class="col-sm-10 control-label" id="label-erro">
										Campo Obrigatório!
									</label>
								</form:errors>
							</div>
						</div>
					</div>


					<div class="form-group">
						<div class="col-sm-2" id="div-form-btn">
							<input name="submit" type="submit" class="btn btn-primary"
								value="Cadastrar" id="form-btn" />
						</div>
						<div class="col-sm-2" id="div-form-btn">
							<a href="<c:url value="/servidor/listar"></c:url>"
								class="btn btn-default" id="form-btn">Cancelar</a>
						</div>
					</div>

				</form:form>
			</div>
		</div>
	</div>

	<jsp:include page="../fragments/footer.jsp" />

</body>

</html>