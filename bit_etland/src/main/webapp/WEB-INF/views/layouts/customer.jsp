<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!--
	@Author :서동준 dongjun8983@gmail.com
	@Date : 2019. 3. 12. 오전 9:57:33
	@File Name : customer.jsp
	@Desc : 고객 템플릿 페이지 
-->
<jsp:include page="common.jsp"/>
<body id="page-top">
			<tiles:insertAttribute name="nav"/>
			<tiles:insertAttribute name="header"/>
			<tiles:insertAttribute name="content" />
			<tiles:insertAttribute name="footer" />
</body>
</html>
