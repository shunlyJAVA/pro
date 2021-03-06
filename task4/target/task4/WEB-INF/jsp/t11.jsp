<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>
<html>



<div class="container">

    <div class="nav-title">首页&gt;职业</div>
    <div class="nav-bar">
        <span class="">方向：</span>
        <a class="nav-bar-a a-selected" href="">全部</a>
        <a class="nav-bar-a" href="">前端开发</a>
        <a class="nav-bar-a" href="">后端开发</a>
        <a class="nav-bar-a" href="">移动开发</a>
        <a class="nav-bar-a" href="">整站开发</a>
        <a class="nav-bar-a" href="">运营维护</a>
    </div>




    <div class="caption">
        <h4>前端开发方向</h4>
    </div>
    <div class="row">
        <c:forEach items="${front}" var="j">
        <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
            <div class="warp-border">

                <div class="clearfix">
                    <div class="icon-people"><img src="t11/imges/687.png"></div>
                    <div class="text">
                        <h4 class="">${j.profession}</h4>
                        <p class="text-present">${j.professionInfo}</p>
                    </div>
                </div>

                <div class="warp-class2">
                    <div class="warp-class2-text">
                        <div class="iconfont text-padding">门槛 <img src="t11/imges/xx.png"></div>
                    </div>
                    <div class="warp-class2-text">
                        <div class="iconfont text-padding text-border-left">难易程度 <img src="t11/imges/xx.png"><img src="t11/imges/xx.png"></div>
                    </div>
                </div>
                <div class="warp-class2">
                    <div class="warp-class2-text">
                        <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${j.growingCircle}</span>年</div>
                    </div>
                    <div class="warp-class2-text">
                        <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${j.scarcity}</span>家公司需要</div>
                    </div>
                </div>

                <div class="warp-class2">
                    <div class="leftWarp">
                        薪资待遇
                    </div>
                    <div class="rightWarp">
                        <div class="rightWarp-class">
                            <div class="rightWarp-year">0-1年</div>
                            <div class="rightWarp-wages">${j.salary1}/月</div>
                        </div>
                        <div class="rightWarp-class">
                            <div class="rightWarp-year">1-2年</div>
                            <div class="rightWarp-wages">${j.salary2}/月</div>
                        </div>
                        <c:choose>
                        <c:when test="${j.salary3 != null}">
                        <div class="rightWarp-class border-bottom">
                            <div class="rightWarp-year">2-3年</div>
                            <div class="rightWarp-wages">${j.salary3}</div>
                        </div>
                        </c:when>
                        </c:choose>
                    </div>
                </div>

                <div class="warp-class2">
                    <b class="text-b">有286人正在学</b>
                </div>
                <div class="warp-class2">
                    <p class="text-p">${j.tips}</p>
                </div>

                <div class="flip-container">
                    <p class="flip-title">iOS工程师</p>
                    <p class="flip-text">iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样， 也是以Darwin为基础的，因此同样属于类Unix的商业操作系统。国内iOS开发起步相对较晚， 人才培养机制更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。 国内iOS开发起步相对较晚，人才培养机制更是远远跟不上市场发展速度。 有限的iOS开发人才成了国内企业必争的资源。</p>
                </div>

            </div>
        </div>
        </c:forEach>
    </div>

    <div class="caption">
        <h4>后端开发方向</h4>
    </div>
    <div class="row">
        <c:forEach items="${end}" var="j">
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                <div class="warp-border">

                    <div class="clearfix">
                        <div class="icon-people"><img src="t11/imges/687.png"></div>
                        <div class="text">
                            <h4 class="">${j.profession}</h4>
                            <p class="text-present">${j.professionInfo}</p>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">门槛 <img src="t11/imges/xx.png"></div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">难易程度 <img src="t11/imges/xx.png"><img src="t11/imges/xx.png"></div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color">${j.growingCircle}</span>年</div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span class="iconfont-color">${j.scarcity}</span>家公司需要</div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="leftWarp">
                            薪资待遇
                        </div>
                        <div class="rightWarp">
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">0-1年</div>
                                <div class="rightWarp-wages">${j.salary1}/月</div>
                            </div>
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">1-2年</div>
                                <div class="rightWarp-wages">${j.salary2}/月</div>
                            </div>
                            <c:choose>
                                <c:when test="${j.salary3 != null}">
                                    <div class="rightWarp-class border-bottom">
                                        <div class="rightWarp-year">2-3年</div>
                                        <div class="rightWarp-wages">${j.salary3}</div>
                                    </div>
                                </c:when>
                            </c:choose>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <b class="text-b">有286人正在学</b>
                    </div>
                    <div class="warp-class2">
                        <p class="text-p">${j.tips}</p>
                    </div>

                    <div class="flip-container">
                        <p class="flip-title">iOS工程师</p>
                        <p class="flip-text">iOS是由苹果公司开发的移动操作统，iOS与苹果的Mac OS X操作系统一样， 也是以Darwin为基础的，因此同样属于类Unix的商业操作系统。国内iOS开发起步相对较晚， 人才培养机制更是远远跟不上市场发展速度。有限的iOS开发人才成了国内企业必争的资源。 国内iOS开发起步相对较晚，人才培养机制更是远远跟不上市场发展速度。 有限的iOS开发人才成了国内企业必争的资源。</p>
                    </div>

                </div>
            </div>
        </c:forEach>
    </div>


</div>

<br>

</body>
</html>