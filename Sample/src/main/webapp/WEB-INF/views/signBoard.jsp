<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

</head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src='https://www.google.com/recaptcha/api.js'></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>
<script type="text/javascript">
	function goPopup() {
		// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
		var pop = window.open("./jusoPopup.do", "juso",
				"width=570,height=420, scrollbars=yes, resizable=yes");

		// 모바일 웹인 경우, 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrMobileLinkUrl.do)를 호출하게 됩니다.
		//var pop = window.open("/popup/jusoPopup.jsp","pop","scrollbars=yes, resizable=yes"); 
	}
	/** API 서비스 제공항목 확대 (2017.02) **/

	function jusoCallBack(roadAddrPart1, addrDetail, zipNo) {
		// 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
		$("#addr").val("(" + zipNo + ") " + roadAddrPart1);
		$("#addr2").val(addrDetail);
	}
	
	   //ID 유효성 검사
	   function idChkConfirm() {
	      var chk = document.getElementsByName('m_id')[0].title
	      if (chk == "n") {
	         alert("아이디 중복체크를 먼저해주세요");
	         document.getElementsByName("m_id")[0].focus();
	      } else {
	      }
	   }

	   function idChked() {
	      var doc = document.getElementsByName("m_id")[0];
	      if (doc.value.trim() == "" || doc.value == null
	            || doc.value == "undefined") {
	         alert("아이디를 입력해주세요")
	      } else {
	         open("idchk?id=" + doc.value, "", "width=200, height=200")
	      }
	   }

</script>
<body>

	<h1>회원가입</h1>

	<form action="sign.do" method="post">
		<table border="1">

			<tr class="table-primary">
				<th>아이디 :</th>
				<td><input title="n" id="m_id" type="text" name="m_id"
					placeholder="ID" required /> <input id="m_id2" type="button"
					value="중복" class="btn btn-outline-primary" onclick="idChked();">
				</td>

			</tr>

			<tr class="table-primary">
				<th>비밀번호 :</th>
				<td><input type="password" name="m_pw" placeholder="PW"
					onclick="idChkConfirm();" required></td>
			</tr>
			<tr class="table-primary">
				<th>이름 :</th>
				<td><input type="text" name="m_name" placeholder="이름"
					onclick="idChkConfirm();" required></td>
			</tr>
			<tr class="table-primary">
				<th>이메일 :</th>
				<td><input required id="email" type="text" size="50"
					name="m_email" placeholder="예) abc@abc.com" value=""
					onclick=""> <input type="button"
					style="width: 50pt; height: 26pt;" value="전송"
					onclick="fnEmailValidation();" class="btn btn-outline-success">
					<input id="emailCodeInput" class="number" type="text" size="50"
					placeholder="인증번호 입력"> <input type="button"
					style="width: 50pt; height: 26pt;" value="인증"
					onclick="chkEmailCode();" class="btn btn-outline-info"> <input
					id="emailRes" type="hidden" value="N" /></td>
			</tr>

			<tr class="table-primary">

				<th>도로명 주소 :</th>
				<td><input id="addr" type="text" size="60" name="m_addr"
					value="<c:if test="${not empty dto}">${dto.m_addr}</c:if>"
					onclick="goPopup();" readonly placeholder="클릭하면 도로명주소 입력가능!"><br />
					<input id="addr2" type="text" size="30" name="m_addr2"
					value="<c:if test="${not empty dto}">${dto.m_addr2}</c:if>"
					placeholder="상세 주소를 입력해주세요" /></td>
			</tr>
			<tr class="table-primary">
				<td colspan="7"><input type="submit" value="가입하기"
					class="btn btn-danger"> <input type="button"
					onclick="location.href='index.jsp'" value="돌아가기"
					class="btn btn-secondary"></td>
			</tr>
		</table>
	</form>

</body>
</html>