/**
 * 通用方法封装处理
 * Copyright (c) 2018 ruoyi 
 */

$(function() {
	// select2复选框事件绑定
	if ($.fn.select2 !== undefined) {
		$("select.form-control:not(.noselect2)").each(function () {
			$(this).select2().on("change", function () {
				$(this).valid();
			})
		})
	}
	// checkbox 事件绑定
	if ($(".check-box").length > 0) {
	    $(".check-box").iCheck({
	    	checkboxClass: 'icheckbox-blue',
			radioClass: 'iradio-blue',
	    })
	}
	// radio 事件绑定
	if ($(".radio-box").length > 0) {
	    $(".radio-box").iCheck({
	    	checkboxClass: 'icheckbox-blue',
			radioClass: 'iradio-blue',
	    })
	}
	// laydate 时间控件绑定
	if ($(".select-time").length > 0) {
		layui.use('laydate', function() {
		    var laydate = layui.laydate;
		    laydate.render({ elem: '#startTime', theme: 'molv' });
		    laydate.render({ elem: '#endTime', theme: 'molv' });
		    laydate.render({ elem: '#oneTime', theme: 'molv' });
		    laydate.render({ elem: '#twoTime', theme: 'molv' });
		    laydate.render({ elem: '#threeTime', theme: 'molv' });
		    laydate.render({ elem: '#fourTime', theme: 'molv' });
		    laydate.render({ elem: '#fiveTime', theme: 'molv' });
		});
	}
	// tree 关键字搜索绑定
	if ($("#keyword").length > 0) {
		$("#keyword").bind("focus", function focusKey(e) {
		    if ($("#keyword").hasClass("empty")) {
		        $("#keyword").removeClass("empty");
		    }
		}).bind("blur", function blurKey(e) {
		    if ($("#keyword").val() === "") {
		        $("#keyword").addClass("empty");
		    }
		    $.tree.searchNode(e);
		}).bind("input propertychange", $.tree.searchNode);
	}
});

/** 创建选项卡 */
function createMenuItem(dataUrl, menuName) {
    dataIndex = $.common.random(1,100),
    flag = true;
    if (dataUrl == undefined || $.trim(dataUrl).length == 0) return false;
    var topWindow = $(window.parent.document);
    // 选项卡菜单已存在
    $('.menuTab', topWindow).each(function() {
        if ($(this).data('id') == dataUrl) {
            if (!$(this).hasClass('active')) {
                $(this).addClass('active').siblings('.menuTab').removeClass('active');
                $('.page-tabs-content').animate({ marginLeft: ""}, "fast");
                // 显示tab对应的内容区
                $('.mainContent .RuoYi_iframe', topWindow).each(function() {
                    if ($(this).data('id') == dataUrl) {
                        $(this).show().siblings('.RuoYi_iframe').hide();
                        return false;
                    }
                });
            }
            flag = false;
            return false;
        }
    });
    // 选项卡菜单不存在
    if (flag) {
        var str = '<a href="javascript:;" class="active menuTab" data-id="' + dataUrl + '">' + menuName + ' <i class="fa fa-times-circle"></i></a>';
        $('.menuTab', topWindow).removeClass('active');

        // 添加选项卡对应的iframe
        var str1 = '<iframe class="RuoYi_iframe" name="iframe' + dataIndex + '" width="100%" height="100%" src="' + dataUrl + '" frameborder="0" data-id="' + dataUrl + '" seamless></iframe>';
        $('.mainContent', topWindow).find('iframe.RuoYi_iframe').hide().parents('.mainContent').append(str1);

        // 添加选项卡
        $('.menuTabs .page-tabs-content', topWindow).append(str);
    }
    return false;
}

/** 设置全局ajax超时处理 */
$.ajaxSetup({
    complete: function(XMLHttpRequest, textStatus) {
        if (textStatus == "parsererror") {
        	$.modal.confirm("登陆超时！请重新登陆！", function() {
        		window.location.href = ctx + "login";
        	})
        }
    }
}); 

/**
 * 把金额格式成为每三位一逗号分隔,显示小数位数自己定义，默认是两位
 * @param value 金额
 * @param type 小数位数, 默认是两位小数
 * @returns {*}
 * @author zhaoxueting
 */
var formatMoney = function (value, type) {
    if (value == null || value == '') {
        return '';
    }
    if (type == null || type == '') {
        type  = 2;
    }
    return value.toFixed(type).replace(/(\d)(?=(\d{3})+\.)/g, '$1,');
};

/**
 * 格里尼治时间转字符串
 * @param dateStr 格林尼治时间
 * @returns Str 返回yyyy-MM-dd格式字符串
 * @author zhaoxueting
 */
var GMTToDateStr = function(dateStr){
    let date = new Date(dateStr)
    let Str=date.getFullYear() + '-' +
    (date.getMonth() + 1) + '-' + 
    date.getDate()
    return Str
}

/**
 * 格里尼治时间转字符串
 * @param dateStr 格林尼治时间
 * @returns Str 返回yyyy-MM-dd hh:mm:ss格式字符串
 * @author zhaoxueting
 */
var GMTToDateTimeStr = function(time){
	let date = new Date(time)
    let Str=date.getFullYear() + '-' +
    (date.getMonth() + 1) + '-' + 
    date.getDate() + ' ' + 
    date.getHours() + ':' + 
    date.getMinutes() + ':' + 
    date.getSeconds()
    return Str
}

