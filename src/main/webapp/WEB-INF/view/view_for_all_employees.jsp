<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<body>
<h3>Information for all employees</h3>

<security:authorize access="hasRole('HR')">
Only HR access: <input type="button" value="Salary" onclick="window.location.href = 'hr_info'">
<br><br>
</security:authorize>


<security:authorize access="hasRole('MANAGER')">
Only Manager access: <input type="button" value="Performance" onclick="window.location.href = 'manager_info'">
<br><br>
</security:authorize>


</body>
</html>
