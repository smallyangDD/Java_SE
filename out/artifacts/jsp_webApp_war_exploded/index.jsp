<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh_CN">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>云下载网盘</title>
    <link rel="stylesheet" href="../src/css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <script src="../src/js/jquery-2.2.4.min.js"></script>
    <script src="../src/js/bootstrap.min.js"></script>
    <script src="../js/common.js"></script>
    <script src="../js/index.js"></script>
</head>

<body>
    <div class="container-fluid">
        <div class="row">
            <div class="content col-lg-5 col-md-6 col-xs-6 col-lg-push-3 col-md-push-3 col-xs-push-3">
                <div class="more-out-box">
                    <form action="../src/phpAPI/getShellCMD.php" style="display: none;" method="post">
                        <p class="down-hidden-box"><span class="glyphicon glyphicon-chevron-down"></span></p>
                        <div class="form-group">
                            <input class="form-control" type="text" name="downloadUrl" id="downloadUrl"
                                   placeholder="输入下载地址">
                        </div>
                        <div class="form-group">
                            <input class="form-control" id="submit" type="button" value="提交">
                        </div>
                        <div class="more-setting">
                            <p class="down-hidden-box nlhei"><span>更多</span></p>
                            <div class="form-group">
                                <label for="ht">转入后台下载&nbsp;&nbsp;</label>
                                <input id="ht" type="checkbox">
                            </div>
                            <div class="form-group">
                                <label for="out">输出下载信息&nbsp;&nbsp;</label>
                                <input id="out" type="checkbox">
                            </div>
                            <div class="form-group">
                                <label for="cj">超级下载(oss传输)&nbsp;&nbsp;</label>
                                <input id="cj" type="checkbox">
                            </div>
                        </div>

                    </form>
                  <!-- 进度展示 -->
                    <div class="statusBtn" style="--color:linear-gradient(135deg, skyblue, #5ccffc, #f1f1f1);">
                        <span>点击下载</span>

                      <!-- <div class="statusBtn-bg"></div>
                      <div class="statusBtn-bg1"></div> -->
                    </div>
                    <div class="show-more-info" style="display: none;">
                        <ul class="list-group" id="printInfo">
                            <!-- 打印输出信息 -->
                        </ul>
                    </div>
                </div>

                <div class="tip-img-box" style="display: none;">
                    <div class="frist-img">
                        <img src="../img/wangluo.png" alt="" srcset="">
                    </div>
                  <!-- 箭头、指向 -->
                    <div class="cencet-img">
                        <div class="top"></div>
                        <div class="bottom"></div>
                    </div>
                    <div class="last-img">
                        <img src="../img/yunzhuji.png" alt="" srcset="">
                    </div>
                </div>
            </div>
        </div>

    </div>

</body>
</html>
