$(function(){
    //导航切换
    $('.P_Header .nav_li').hover(function () {
        $(this).find('.sec_nav').slideDown();
    }, function () {
        $(this).find('.sec_nav').hide();
    })
})