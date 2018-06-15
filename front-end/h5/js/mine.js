$(function() {
  mine.initPage();
});

var mine = {
    ajax: new HttpService(),
    initPage: function() {
        if (sessionStorage.getItem('userinfo')) {
            var names = JSON.parse(sessionStorage.getItem('userinfo')).name;
            $('.account').text(names);
        }
        mine.refreshAccount();

        $('.refresh_sum').click(function() {
          $('.residual p').text('**** 点');
          mine.refreshAccount();
        });
        $('.exit-btn button').click(function() {
          mine.loginout();
        });
    },
    refreshAccount: function() {
        this.ajax.get('/member/member-money', {}, function(data) {
            if (data.code == '2018') {
                $('.account').text(data.result.name);
                $('#localSum').text(data.result.sum + ' 点');
                $('#rebateSum').text(data.result.rebate + ' 点');
            }
        });
    },
    loginout: function() {
        this.ajax.post('/member/exit-member', {}, function(data) {
            if (data.code == '2018') {
                sessionStorage.setItem('userinfo', '');
                sessionStorage.setItem('toid', '');
                setTimeout(function() {
                    layer.closeAll();
                    window.location.href = 'index.html';
                }, 200);
            }
        });

    },
}
