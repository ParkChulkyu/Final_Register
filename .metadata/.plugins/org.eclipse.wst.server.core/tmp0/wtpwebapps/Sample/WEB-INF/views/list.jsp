<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.test.sample.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>LIST</h1>
	<table border="1">
		<col width="50" />
		<col width="100" />
		<col width="300" />
		<col width="200" />
		<col width="200" />
		<col width="200" />
		<col width="200" />
		<col width="200" />
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
			<th>작성일</th>
			<th>작성일</th>
			<th>작성일</th>
			<th>작성일</th>
		</tr>
		<c:choose>
			<c:when test="${empty list }">
				<tr>
					<td colspan="4">------------empty------------</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list }" var="dto">
					<tr>
						<td>${dto.m_no }</td>
						<td>${dto.m_id }</td>
						<td>${dto.m_pw }</td>
						<td>${dto.m_name }</td>
						<td>${dto.m_email }</td>
						<td>${dto.m_addr }</td>
						<td>${dto.m_addr2 }</td>
						<td>${dto.m_join }</td>
						<td>${dto.m_grade }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
			<td colspan="8"><input type="button" value="write"
				onclick="location.href='insertBoard.do'" /></td>
		</tr>
	</table>

</body>
</html>