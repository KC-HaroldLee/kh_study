<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테이블 스타일링</title>
<link rel="stylesheet" type="text/css" href="/study/design/common.css">

</head>
<body>

	<div class="container-600">
		<div class="row">
		<h1>오늘의 날씨</h1>
			<table class="table table-border table-hover table-striped"  >
			<thead>
				<tr>
				<th>지역</th>
				<th>현재기온</th>
				<th colspan="2">불쾌지수/습도(%)</th>
				<th>풍속</th>				
			</tr>
			</thead>
		<tbody>
			<tr>
				<th rowspan="2">서울/경기</th>
				<td>23</td>
				<td>60</td>
				<td>80</td>
				<td>4.7</td>
			</tr>
			
			<tr>
				<td>20</td>
				<td>60</td>
				<td>80</td>
				<td>5.0</td>
			</tr>
			
			<tr>
				<td>제주도</td>
				<td>21</td>
				<td>65</td>
				<td>85</td>
				<td>3.6</td>
			</tr>
		</tbody>
	
	
	</table>
		
		</div>
		
	</div>
</body>
</html>