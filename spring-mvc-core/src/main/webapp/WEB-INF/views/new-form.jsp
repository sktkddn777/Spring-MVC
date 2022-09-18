<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--WEB-INF 내부에 있는 자원들은 컨틀롤러를 거쳐야 함을 명시, 직접 호출 안됨--%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <!-- 상대경로 사용, [현재 URL이 속한 계층 경로 + /save] -->
    <form action="save" method="post">
        username: <input type="text" name="username" />
        age: <input type="text" name="age" />
        <button type="submit">전송</button>
    </form>
</body>
</html>