<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>会议议程</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link href="https://cdn.bootcss.com/normalize/8.0.0/normalize.min.css" rel="stylesheet">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/signing.css" rel="stylesheet">
</head>
<body>

<div class="panel panel-primary" style="border-color: white">
    <div class="panel-heading">
        <h3>会议内容</h3>
    </div>
    <div class="panel-body">
        <h4>召开事由：</h4>
        <p>${docContent}
        </p>
        <!-- Table -->
        <table class="table">
            <thead>
            <th class="list-title">议程</th>
            </thead>
            <tbody>
            <#list meetinglist as item>
            <tr>
                <td style="text-align:center;word-wrap:break-word;word-break:break-all;">
                ${item}
                </td>
            </tr>
            </#list>
            </tbody>
        </table>
    </div>
</div>


</body>
</html>