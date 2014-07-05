<!DOCTYPE html >

<html ng-app="libraryApp">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="Grails"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="shortcut icon" href="${assetPath(src: 'favicon.ico')}" type="image/x-icon">
    <link rel="apple-touch-icon" href="${assetPath(src: 'apple-touch-icon.png')}">
    <link rel="apple-touch-icon" sizes="114x114" href="${assetPath(src: 'apple-touch-icon-retina.png')}">
    <asset:stylesheet src="application.css"/>
    <asset:javascript src="application.js"/>
    <g:layoutHead/>
</head>

<body>

<!-- Fixed navbar -->
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <b><a class="navbar-brand" href="#">Awesome library!</a></b>
        </div>

        <div class="collapse navbar-collapse" ng-init="activemenue">
            <ul class="nav navbar-nav">
                <li class=""><a  href="/library/home">Home</a></li>
                <li class=""><a href="/library/bookManagement">Book</a></li>
                <li class=""><a href="/library/externalApi">External API</a></li>


            </ul>
        </div><!--/.nav-collapse -->
    </div>
</div>

<!-- Begin page content -->
<div class="container">
    <div class="page-header">

    </div>
    <g:layoutBody/>
</div>
<br>
<br>
<br>
<br>
<br>
<hr>
<div id="footer">
    <div class="container">
        <p class="text-muted">Grails, angularjs demo -- developed by Alidad Soleimani</p>
    </div>
</div>

</body>

</html>
