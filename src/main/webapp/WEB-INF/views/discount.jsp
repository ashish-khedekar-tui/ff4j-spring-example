<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>

<html>
<head>
    <title>Discount calculator</title>
</head>

<body>


<b>holidays.discount.enabled</b>


<table border="1">
    <tr>
        <th scope="col">Destination</th>
        <th scope="col">Price</th>
        <th scope="col">Eligible for simple discount</th>
        <th scope="col">Eligible for customised discount</th>
    </tr>
    <c:forEach items="${holidayPackages}" var="holiday">
        <tr>
            <td>${holiday.destination}</td>
            <td>${holiday.price}</td>
            <td>${holiday.eligibleForDiscount}</td>
            <td>${holiday.eligibleForCustomisedDiscount}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>