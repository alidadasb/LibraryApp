<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>

<body>

<div>
    <label>Name:</label>
    <input type="text" ng-model="yourName" placeholder="Enter a name here">
    <hr>

    <h1>Hello {{yourName}}!</h1>
</div>

<div ng-view></div>

</body>
</html>
