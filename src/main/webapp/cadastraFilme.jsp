<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:view>
		<h:form>
			<h1>Cadastro de filme</h1>
			<a href="index.faces">Voltar</a>
			<h:panelGrid columns="2">
				<h:outputText value="* Nome: "/>
				<h:inputText value="#{filmeController.filme.nome}" maxlength="40" size="40"/>
				<h:outputText value="* Valor: "/>
				<h:inputText value="#{filmeController.filme.valor}" maxlength="8" size="15"/>
				<h:outputText value="* Gênero: "/>
				<h:inputText value="#{filmeController.filme.genero }" maxlength="40" size="40"/>
				<h:outputText value="* Status: "/>
				<h:selectOneRadio value="#{filmeController.filme.status }">
					<f:selectItem itemValue="S" itemLabel="Sim"/>
					<f:selectItem itemValue="N" itemLabel="Não"/>
				</h:selectOneRadio>
				
				<h:commandButton action="#{filmeController.salvar }" value="Cadastrar"/>
				<h:commandButton action="#{filmeController.voltar }" value="Cancelar"/>
				
			</h:panelGrid>
		</h:form>
	</f:view>

</body>
</html>