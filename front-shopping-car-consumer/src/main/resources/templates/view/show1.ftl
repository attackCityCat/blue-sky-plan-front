<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
<#if list?exists>
<#list list as i>

    ${i.productName?if_exists}
    ${i.productSpec?if_exists}

    </#list>
    </#if>
</body>
</html>