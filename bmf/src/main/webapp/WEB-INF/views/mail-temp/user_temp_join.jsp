<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "com.bemyfriend.bmf.common.code.ConfigCode"
    %>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<body>
	<h1> 안녕하세요. ${param.userId} 님 ☻ </h1>
	<h1> Be My Friends 사이트에 가입하신 것을 환영합니다 !</h1>
	<h1> 회원가입을 마무리 하기 위해 아래의 링크를 클릭해주세요. </h1>
	<a href ="<%= ConfigCode.DOMAIN %>/member/user/joinimpl/${authPath}">회원가입 완료</a>
</body>
</html>

