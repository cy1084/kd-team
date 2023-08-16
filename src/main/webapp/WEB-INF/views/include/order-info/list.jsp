<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오더 리스트
	<table border="1">
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>아이디</th>
			<th>주문일</th>
			<th>연락처</th>
			<th>주소</th>
			<th>총 금액</th>
			<th>결제 수단</th>
			<th>배송비</th>
		</tr>
		<tbody id="tBody">
		</tbody>
	</table>
	<script type="text/javascript">
		function loadFunc(){
			const xhr= new XMLHttpRequest();
			xhr.open('GET','/order-info/list');
			xhr.onreadystatechange=function(){
				if(xhr.readyState===4){
					if(xhr.status===200){
						const obj=JSON.parse(xhr.responseText);
						let html='';
						for(let list of obj){
							html += '<tr>';
							html += '<td>' + list.oiNum + '</td>';
							html += '<td><a href="/views/order-info/view?oiNum=' + list.oiNum + '">' + list.oiName + '</td>';
							html += '<td>' + list.oiId + '</td>';
							html += '<td>' + list.oiDate + '</td>';
							html += '<td>' + list.oiPhone + '</td>';
							html += '<td>' + list.oiAddress + '</td>';
							html += '<td>' + list.oiAmount + '</td>';
							html += '<td>' + list.oiPayment + '</td>';
							html += '<td>' + list.oiDelivery + '</td>';
							html += '</tr>';
						}
						document.querySelector('#tBody').innerHTML=html;
					}
				}
			}
			xhr.send();
		}
		window.addEventListener('load', loadFunc);
	</script>
</body>
</html>